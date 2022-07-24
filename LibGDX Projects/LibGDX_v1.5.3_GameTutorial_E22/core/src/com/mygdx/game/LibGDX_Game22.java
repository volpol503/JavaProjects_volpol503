package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTileLayer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthoCachedTiledMapRenderer;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import static Utils.Constants.PPM;

public class LibGDX_Game22 extends ApplicationAdapter {

	private boolean DEBUG = false;
	private float SCALE = 2.0f;
	private OrthographicCamera camera;
	private OrthogonalTiledMapRenderer otmr;
	private OrthoCachedTiledMapRenderer tmr;
	private TiledMap map;
	private TiledMapTileLayer layer;

	private Box2DDebugRenderer b2dr;
	private World world;
	private Body player, box;
	private SpriteBatch batch;
	private Texture tex;


	@Override
	public void create () {
	float w = Gdx.graphics.getWidth();
	float h = Gdx.graphics.getHeight();
	camera = new OrthographicCamera();
	camera.setToOrtho(false, w/SCALE,h/SCALE);

	world = new World(new Vector2(0,0f), false);
	b2dr = new Box2DDebugRenderer();

	player = createBox(140,140,32, 32, false);
	box = createBox(140,130,64,32, true);

	batch = new SpriteBatch();
	tex = new Texture("badlogic.jpg");

	map = new TmxMapLoader().load("Tile.tmx");
	tmr = new OrthoCachedTiledMapRenderer(map);
	otmr = new OrthogonalTiledMapRenderer(map);
	}

	@Override
	public void render () {
		update(Gdx.graphics.getDeltaTime());
		//Render
		Gdx.gl.glClearColor(0f, 0f, 0f, 1f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		batch.draw(tex,box.getPosition().x*PPM-(tex.getWidth()/2),
				box.getPosition().y*PPM - (tex.getHeight()/2));
		batch.end();
		otmr.render();
		b2dr.render(world, camera.combined.scl(PPM));

		if(Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE))Gdx.app.exit();

	}
	@Override
	public void resize(int width, int height) {
		camera.setToOrtho(false, width/SCALE,height/SCALE);
	}

	@Override
	public void dispose () {
		world.dispose();
		b2dr.dispose();
		batch.dispose();
		tex.dispose();
		otmr.dispose();
		map.dispose();
//		tmr.dispose();
	}

	public void update(float delta){
		world.step(1 / 60f,6 , 2);
		inputUpdate(delta);
		cameraUpdate(delta);
		otmr.setView(camera);
//		tmr.setView(camera);
		batch.setProjectionMatrix(camera.combined);
	}
	public void inputUpdate(float delta){
		int horizontalForce = 0;
		int verticalForce = 0;
		if(Gdx.input.isKeyPressed(Input.Keys.A)){ horizontalForce -=1; }
		if(Gdx.input.isKeyPressed(Input.Keys.D)){ horizontalForce +=1; }
		if(Gdx.input.isKeyPressed(Input.Keys.W)){
//			player.applyForceToCenter(0,-30,false);
			verticalForce +=1;
		}

		if(Gdx.input.isKeyPressed(Input.Keys.S)){
//			player.applyForceToCenter(0,30,false);
			verticalForce -=1;
		}

		player.setLinearVelocity(verticalForce * 5, player.getLinearVelocity().y);
		player.setLinearVelocity(horizontalForce * 5, player.getLinearVelocity().x);
	}
	public void cameraUpdate(float delta){
		Vector3 position = camera.position;
		position.x = player.getPosition().x * PPM;
		position.y = player.getPosition().y * PPM;
		camera.position.set(position);
		camera.update();

	}

	public Body createBox(int x, int y, int width, int height, boolean inStatic){
		Body pBody;
		BodyDef def = new BodyDef();
		if(inStatic)
			def.type = BodyDef.BodyType.StaticBody;
		else
			def.type = BodyDef.BodyType.DynamicBody;
		def.position.set(x/PPM, y/PPM);
		def.fixedRotation = true;
		pBody = world. createBody(def);
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(width / 2 /PPM,height / 2 /PPM);
		pBody.createFixture(shape,1.0f);
		shape.dispose();
		return pBody;
	}
}
