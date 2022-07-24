package pixelindustries.tilegame.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
	//STATIC STUFF HERE
	
	public static Tile[] tiles = new Tile [256];
	public static Tile grassTile = new GrassTile(0);
	public static Tile dirtTile = new DirtTile(21);
	public static Tile rockTile = new RockTile(11);
	public static Tile cobblestone = new CobblestoneTile(1);
	public static Tile grass = new Grass(2);
	public static Tile none = new None(3);
	public static Tile dirt = new Dirt(4);
	public static Tile stone = new Stone(5);
	public static Tile stonebrick = new StoneBrick(6);
	public static Tile ironore = new IronOre(7);
	public static Tile coalore = new CoalOre(8);
	public static Tile glass = new Glass(9);
		
	//CLASS
	
	public static final int TILEWIDTH = 16, TILEHEIGHT = 16;
	public static final int TILEWIDTH_32 = 32, TILEHEIGHT_43 = 43;
	protected BufferedImage texture;
	protected final int id;
	
	public Tile (BufferedImage texture, int id){
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g, int x, int y){
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
		
	}
	
	public boolean isSolid(){
		return false;
	}
	
	public int getID(){
		return id;
	}
	
}
