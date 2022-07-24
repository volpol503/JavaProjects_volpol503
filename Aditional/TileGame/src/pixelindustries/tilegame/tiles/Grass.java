package pixelindustries.tilegame.tiles;

import pixelindustries.tilegame.gfx.Assets;

public class Grass extends Tile{

	public Grass(int id) {
		super(Assets.grassblock, id);
	}
	public boolean isSolid(){
		return true;
	}

}
