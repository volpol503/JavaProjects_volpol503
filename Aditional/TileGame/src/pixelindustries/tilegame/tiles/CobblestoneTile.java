package pixelindustries.tilegame.tiles;

import pixelindustries.tilegame.gfx.Assets;

public class CobblestoneTile extends Tile{

	public CobblestoneTile(int id) {
		super(Assets.cobblestone, id);
	}
	public boolean isSolid(){
		return true;
	}
}
