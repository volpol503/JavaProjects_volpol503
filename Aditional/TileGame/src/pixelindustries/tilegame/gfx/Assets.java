package pixelindustries.tilegame.gfx;

import java.awt.image.BufferedImage;


public class Assets {
	public static final int width = 16, height = 16;
	public static BufferedImage player,dirt,grass,stone,tree,cobblestone,testImage,grassblock,none,stonebrick,glass,coalore,ironore;
	public static BufferedImage[] player_down,player_up,player_left,player_right;
	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.LoadImage("/textures/sheetprev.png"));
		Test test = new Test(ImageLoader.LoadImage("/textures/test1.png"));
		
		player_down = new BufferedImage[2];
		player_up = new BufferedImage[2];
		player_left = new BufferedImage[2];
		player_right = new BufferedImage[2];
		player = sheet.crop(0, width * 6, width*2, height*4);
		player_down[0] = sheet.crop(width * 8,0, width * 2, height * 2);
		player_down[1] = sheet.crop(width * 10,0, width * 2, height * 2);
		player_up[0] = sheet.crop(width *12, 0, width * 2, height * 2);
		player_up[1] = sheet.crop(width* 14, 0, width * 2, height * 2);
		player_right[0] = sheet.crop(width * 8, height * 2, width * 2, height * 2);
		player_right[1] = sheet.crop(width * 10, height * 2, width * 2, height * 2);
		player_left[0] = sheet.crop(width * 12, height * 2, width * 2, height * 2);
		player_left[1] = sheet.crop(width * 14, height * 2, width *2, height * 2);
		dirt = sheet.crop(width * 2, height * 4, width, height);
		grass = sheet.crop(width *3, width*10, width, height);
		grassblock = sheet.crop(width * 4, height *11, width, height);
		stone = sheet.crop(width * 5,width * 11,width, height);
		stonebrick = sheet.crop(width * 5,width *12,width, height);
		cobblestone = sheet.crop(width * 4, height * 10, width, height);
		glass = sheet.crop(width * 4, height * 13, width, height);
		coalore = sheet.crop(width * 4,width * 15,width, height);
		ironore = sheet.crop(width*3,height * 15,width, height);
		
		tree = sheet.crop(0, 0, width *2, height *4);
		
		none = sheet.crop(width * 2, height * 8, width, height);
	}

}
