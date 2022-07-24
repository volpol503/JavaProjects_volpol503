package pixelindustries.tilegame.tiles;

import pixelindustries.tilegame.gfx.Assets;

public class Stone extends Tile{

	public Stone(int id) {
		super(Assets.stone, id);
	}
	public boolean isSolid(){
		return true;
	}

}
