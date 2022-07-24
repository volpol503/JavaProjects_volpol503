package com.mygdx.game;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Box2D;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.reflect.ClassReflection;
import com.badlogic.gdx.utils.reflect.ReflectionException;
import com.badlogic.gdx.utils.viewport.FitViewport;
import java.util.EnumMap;
import screen.AbstractScreen;
import screen.ScreenType;
import static Utils.Constants.PPM;

public class LibGDXGame30 extends Game {
    private static final String TAG = LibGDXGame30.class.getSimpleName();
    public EnumMap<ScreenType, AbstractScreen> screenCache;
    private FitViewport screenViewport;

    public static final short BIT_CIRCLE = 1 << 0;
    public static final short BIT_BOX = 1 << 1;
    public static final short BIT_GROUND = 1 << 2;
    private World world;
    private Box2DDebugRenderer box2DDebugRenderer;
    private Box2DDebugRenderer b2dr;
    private boolean DEBUG = false;
    private float SCALE = 2.0f;
    private OrthographicCamera camera;
    private Body player, platform;
    private SpriteBatch batch;
    private Texture tex;
    
    
    
    
    @Override
    public void create() {

        float w = Gdx.graphics.getWidth();
        float h = Gdx.graphics.getHeight();

        world = new World(new Vector2(0,-9.8f), false);
        b2dr = new Box2DDebugRenderer();
        player = createBox(8,10,32,32, false);
        platform = createBox(0,0,64, 32, true);
        batch = new SpriteBatch();
        camera = new OrthographicCamera();
        camera.setToOrtho(false, w/2,h/2);
        
        Gdx.app.setLogLevel(Application.LOG_DEBUG);
        Box2D.init();
        world = new World(new Vector2(0, 9.81f), true);
        box2DDebugRenderer = new Box2DDebugRenderer();
        screenViewport = new FitViewport(9, 16);
        screenCache = new EnumMap<ScreenType, AbstractScreen>(ScreenType.class);
        setScreen(ScreenType.GAME);
        
    }

    public FitViewport getScreenViewport() { return screenViewport; }
    public World getWorld() {
        return world;
    }
    public Box2DDebugRenderer getBox2DDebugRenderer() { return box2DDebugRenderer; }
    public void setScreen(final ScreenType screenType) {
        final Screen screen = screenCache.get(screenType);
        if (screen == null) {
            try {
                Gdx.app.debug(TAG, "Creating new screen" + screenType);
                final AbstractScreen newScreen = (AbstractScreen) ClassReflection.getConstructor(screenType.getScreenClass(), LibGDXGame30.class).newInstance(this);
                screenCache.put(screenType, newScreen);
                setScreen(newScreen);
            } catch (ReflectionException e) {
                throw new GdxRuntimeException("Screen" + screenType + "could not be created", e);
            }
        } else {
            Gdx.app.debug(TAG, "Switching to screen" + screenType);
            setScreen(screen);
        }
    }
    public void update(float delta){
        world.step(1 / 60f,6 , 2);
        inputUpdate(delta);
        cameraUpdate(delta);
        batch.setProjectionMatrix(camera.combined);
    }
    public void inputUpdate(float delta){
        int horizontalForce = 0;
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){ horizontalForce +=1; }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){ horizontalForce -=1; }
        if(Gdx.input.isKeyJustPressed(Input.Keys.DOWN)){
            player.applyForceToCenter(0,300,false);
//			player.applyForceToCenter(0,300,false);
        }
        player.setLinearVelocity(horizontalForce * 5, player.getLinearVelocity().y);
    }
    public void cameraUpdate(float delta){
        Vector3 position = camera.position;
        position.x = player.getPosition().x * PPM;
        position.y = player.getPosition().y * PPM;
        camera.position.set(position);
        camera.update();

    }
    @Override
    public void dispose() {
        super.dispose();
        box2DDebugRenderer.dispose();
        world.dispose();
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
            
            