package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.World;

public class MainScreen implements Screen, InputProcessor {
    LibGDXR_Game15 game;
    SpriteBatch batch;
    Texture img;
    public BitmapFont bitmapFont;
    public static final float UNIT_SCALE = 1f / 16f;
    private World world;
    private TiledMap map;
    private OrthographicCamera camera = new OrthographicCamera();
    private OrthogonalTiledMapRenderer render;
    Box2DDebugRenderer box2DDebugRenderer;
    private Ball[] balls = new Ball[5];
    //	private OrthoCachedTiledMapRenderer render;
    int count = 5;
    int VIEW_WIDTH = 64;
    int VIEW_HEIGHT = 64;
    float CAMERA_X = 0;
    float CAMERA_Y = 0;
    int x = 0;
    int y = 0;

    public MainScreen(LibGDXR_Game15 game){
        this.game = game;
        batch = new SpriteBatch();
        img = new Texture("Sprites/Ball.png");
        map = new TmxMapLoader().load("Maps/168_75.tmx");
        render = new OrthogonalTiledMapRenderer(map, 0.1f);
        camera.setToOrtho(false,VIEW_WIDTH, VIEW_HEIGHT);
        world = new World(new Vector2(), false);
        box2DDebugRenderer = new Box2DDebugRenderer();
        balls[0] = new Ball(10,10, world, img);
        balls[1] = new Ball(20,10, world, img);
        balls[2] = new Ball(10,20, world, img);
        balls[3] = new Ball(20,20, world, img);
        balls[4] = new Ball(15,15, world, img);
        balls[0].addForce(new Vector2(0, 5000));
        Gdx.input.setInputProcessor(this);

//		if(Gdx.input.isKeyPressed(Input.Keys.L))VIEW_WIDTH++;
//		if(Gdx.input.isKeyPressed(Input.Keys.L))VIEW_HEIGHT++;
//		if(Gdx.input.isKeyPressed(Input.Keys.K))VIEW_WIDTH--;
//		if(Gdx.input.isKeyPressed(Input.Keys.K))VIEW_HEIGHT--;
//		if(Gdx.input.isTouched(Input.Keys.L))VIEW_WIDTH--;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.translate(CAMERA_X, CAMERA_Y,0);


        world.step(delta,4,4);
        camera.update();
        render.setView(camera);
        render.render();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(img,
//				 x- img.getWidth() / 2,y - img.getHeight() / 2
                x,y,5,5);
        for(int i = 0; i < count; i++){
            balls[i].draw(batch);
        }
        batch.end();

        box2DDebugRenderer.render(world,camera.combined);
        if(Gdx.input.isKeyPressed(Input.Keys.D))x++;
        if(Gdx.input.isKeyPressed(Input.Keys.A))x--;
        if(Gdx.input.isKeyPressed(Input.Keys.S))y--;
        if(Gdx.input.isKeyPressed(Input.Keys.W))y++;
        if(Gdx.input.isKeyJustPressed(Input.Keys.H)){ CAMERA_X += 0.5f; }
        if(Gdx.input.isKeyJustPressed(Input.Keys.F)){ CAMERA_X -= 0.5f; }
        if(Gdx.input.isKeyJustPressed(Input.Keys.T)){ CAMERA_Y += 0.5f; }
        if(Gdx.input.isKeyJustPressed(Input.Keys.G)){ CAMERA_Y -= 0.5f; }

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        world.dispose();
        batch.dispose();
        img.dispose();
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
//       game.getListener().showAds();
        game.getListener().showRewardedAds();
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
