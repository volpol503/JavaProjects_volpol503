package pixelindustries.tilegame.tiles;

import pixelindustries.tilegame.gfx.Assets;

public class GrassTile extends Tile{

	public GrassTile(int id) {
		super(Assets.grass, id);
	}
	public boolean isSolid(){
		return true;
	}

}
