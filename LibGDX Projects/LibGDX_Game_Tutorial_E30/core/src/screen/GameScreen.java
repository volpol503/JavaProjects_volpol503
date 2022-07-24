package screen;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.mygdx.game.LibGDXGame30;

import static com.mygdx.game.LibGDXGame30.BIT_BOX;
import static com.mygdx.game.LibGDXGame30.BIT_CIRCLE;
import static com.mygdx.game.LibGDXGame30.BIT_GROUND;


public class GameScreen extends AbstractScreen {
    private final BodyDef bodyDef;
    private final FixtureDef fixtureDef;

   public GameScreen(final LibGDXGame30 context){
       super(context);


       bodyDef = new BodyDef();
       fixtureDef = new FixtureDef();
       //Create a circle
       bodyDef.position.set(4.5f, 15);
       bodyDef.gravityScale = 1;
       bodyDef.type = BodyDef.BodyType.DynamicBody;
       Body body = world.createBody(bodyDef);

       fixtureDef.isSensor = false;
       fixtureDef.restitution = 0.5f;

       fixtureDef.friction = 0.2f;
       fixtureDef.filter.categoryBits = BIT_CIRCLE;
       fixtureDef.filter.maskBits = BIT_GROUND | BIT_BOX;
       CircleShape cShape = new CircleShape();
       cShape.setRadius(0.5f);
       fixtureDef.shape = cShape;
       body.createFixture(fixtureDef);
       cShape.dispose();

       //Create a box
       bodyDef.position.set(5.3f, 4);
       bodyDef.gravityScale = 1;
       bodyDef.type = BodyDef.BodyType.DynamicBody;
       body = world.createBody(bodyDef);

       fixtureDef.isSensor = false;
       fixtureDef.restitution = 0.5f;
       fixtureDef.friction = 0.2f;
       fixtureDef.filter.categoryBits = BIT_BOX;
       fixtureDef.filter.maskBits = BIT_GROUND | BIT_CIRCLE;
       PolygonShape pShape = new PolygonShape();
       pShape.setAsBox(0.5f,0.5f);
       fixtureDef.shape = pShape;
       body.createFixture(fixtureDef);
       pShape.dispose();

       //Create a platform
       bodyDef.position.set(4.5f, 2);
       bodyDef.gravityScale = 1;
       bodyDef.type = BodyDef.BodyType.StaticBody;
       body = world.createBody(bodyDef);

       fixtureDef.isSensor = false;
       fixtureDef.restitution = 0f;
       fixtureDef.friction = 0.2f;
       fixtureDef.filter.categoryBits = BIT_GROUND;
       fixtureDef.filter.maskBits = -1;
       pShape = new PolygonShape();
       pShape.setAsBox(4f,0.5f);
       fixtureDef.shape = pShape;
       body.createFixture(fixtureDef);
       pShape.dispose();
   }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        if(Gdx.input.isKeyPressed(Input.Keys.A)){
            context.setScreen(ScreenType.LOAD);
        }

        viewport.apply(true);
        world.step(delta, 6,2);
        box2DDebugRenderer.render(world, viewport.getCamera().combined);
        if(Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE))Gdx.app.exit();
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

    }

//    public Body createBox(int x, int y, int width, int height, boolean inStatic){
//        Body pBody;
//        BodyDef def = new BodyDef();
//        if(inStatic)
//            def.type = BodyDef.BodyType.StaticBody;
//        else
//            def.type = BodyDef.BodyType.DynamicBody;
//
//        def.position.set(x/PPM, y/PPM);
//        def.fixedRotation = true;
//        pBody = world. createBody(def);
//
//        PolygonShape shape = new PolygonShape();
//        shape.setAsBox(width / 2 /PPM,height / 2 /PPM);
//
//        pBody.createFixture(shape,1.0f);
//        shape.dispose();
//        return pBody;
//    }
}
