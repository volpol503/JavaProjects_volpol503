package pixelindustries.tilegame.tiles;

import pixelindustries.tilegame.gfx.Assets;

public class StoneBrick extends Tile{

	public StoneBrick(int id) {
		super(Assets.stonebrick, id);
	}
	public boolean isSolid(){
		return true;
	}
	

}
