package screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.mygdx.game.LibGDXGame30;
import static Utils.Constants.PPM;

public class LoadingScreen extends AbstractScreen {
    private final LibGDXGame30 context;
    private SpriteBatch batch;
    private Texture tex;
    private Body player, platform;
    private Box2DDebugRenderer b2dr;
    private OrthographicCamera camera;
    private LibGDXGame30 Game;
    public LoadingScreen(final LibGDXGame30 context){
        super(context);
        this.context = context;
    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,1,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        if(Gdx.input.isKeyPressed(Input.Keys.D)){
            context.setScreen(ScreenType.GAME);
        }
        batch.begin();
        batch.draw(tex,player.getPosition().x*PPM-(tex.getWidth()/2),player.getPosition().y*PPM - (tex.getHeight()/2));
        batch.end();
        b2dr.render(world, camera.combined.scl(PPM));

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
        b2dr.dispose();
        batch.dispose();
    }

}
