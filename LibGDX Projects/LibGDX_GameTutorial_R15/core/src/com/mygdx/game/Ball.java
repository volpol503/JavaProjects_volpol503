package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.World;

public class Ball {
    private Body body;
    private Texture img;
    public static final float RADIUS = 20f;
    public Ball(float x, float y, World world, Texture img){
        body = createBall(x, y, RADIUS * MainScreen.UNIT_SCALE, world);
        this.img = img;
        body.setLinearDamping(0.1f);
    }

    public void draw(SpriteBatch batch){
        float divR = RADIUS * MainScreen.UNIT_SCALE;
        batch.draw(img, body.getPosition().x - divR, body.getPosition().y - divR,
                2*RADIUS * MainScreen.UNIT_SCALE,
                 2*RADIUS * MainScreen.UNIT_SCALE);
    }

    public void addForce(Vector2 v){
        body.applyForceToCenter(v, true);
    }

    private Body createBall(float x, float y, float radius, World world){
        BodyDef def = new BodyDef();
        def.type = BodyDef.BodyType.DynamicBody;
        def.fixedRotation = true;
        Body body = world.createBody(def);

        CircleShape circle = new CircleShape();
        circle.setPosition(new Vector2(0,0));
        circle.setRadius(radius);
        Fixture f = body.createFixture(circle, 1f);
        f.setUserData("ball");
        circle.dispose();

        body.setTransform(x,y,0);
        return body;
    }
}
