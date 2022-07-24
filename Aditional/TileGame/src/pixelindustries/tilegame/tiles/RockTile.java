package pixelindustries.tilegame.tiles;

import pixelindustries.tilegame.gfx.Assets;

public class RockTile extends Tile{

	public RockTile(int id) {
		super(Assets.stone, id);
	}
	public boolean isSolid(){
		return true;
	}

}
