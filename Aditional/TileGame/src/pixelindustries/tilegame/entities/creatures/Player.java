package pixelindustries.tilegame.entities.creatures;

import java.awt.Graphics;

import pixelindustries.tilegame.Handler;
import pixelindustries.tilegame.gfx.Animation;
import pixelindustries.tilegame.gfx.Assets;

public class Player extends Creature{
	
	private Animation animDown, animLeft, animRight;
	private Animation animUp;
	
	public Player(Handler handler,float x, float y) {
		super(handler, x, y,  Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		bounds.x = 7;
		bounds.y = 18;
		bounds.width = 18;
		bounds.height = 32;
		//Animations
		animDown = new Animation(500, Assets.player_down);
		animUp = new Animation(500, Assets.player_up);
		animLeft = new Animation(500, Assets.player_left);
		animRight = new Animation(500,Assets.player_right);
	}

	@Override
	public void tick() {
		animLeft.tick();
		animRight.tick();
		animDown.tick();
		animUp.tick();
		//Movment
		getInput();
		move();
		handler.getGameCamera().centerOnEntity(this);
	}
	
	private void getInput(){
		xMove = 0;
		yMove = 8;
		
		if(handler.getKeyManager().up)
			yMove = -speed;
		if(handler.getKeyManager().down)
			yMove = speed;
		if(handler.getKeyManager().left)
			xMove = -speed;
		if(handler.getKeyManager().right)
			xMove = speed;
	}
	
	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.player, (int) (x - handler.getGameCamera().getxOffset()), 
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
//		g.setColor(Color.red);
//		g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
//		(int) (y + bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
	}
//	private BufferedImage getCurrentAnimationFrame(){
//		if(xMove < 0){
//			return animLeft.getCurrentFrame();
//		}else if(xMove > 0){
//			return animRight.getCurrentFrame();
//		}else if(yMove < 0){
//			return animUp.getCurrentFrame();
//		}else{
//			return animDown.getCurrentFrame();
//		}
//	}
	
}
