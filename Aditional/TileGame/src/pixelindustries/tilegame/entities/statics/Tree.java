package pixelindustries.tilegame.entities.statics;

import java.awt.Graphics;

import pixelindustries.tilegame.Handler;
import pixelindustries.tilegame.gfx.Assets;
import pixelindustries.tilegame.tiles.Tile;

public class Tree extends StaticEntity {

	public Tree(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH * 2, Tile.TILEHEIGHT *4);
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.tree,(int) (x - handler.getGameCamera().getxOffset()),
				(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

//	(x - handler.getGameCamera().getxOffset()), 
//	(int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	
	
}
