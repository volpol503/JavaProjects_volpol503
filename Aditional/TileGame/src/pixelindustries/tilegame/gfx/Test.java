package pixelindustries.tilegame.gfx;

import java.awt.image.BufferedImage;

public class Test {
	private BufferedImage test;
	public Test (BufferedImage test){
		this.test = test;
	}
	public BufferedImage crop(int x, int y, int width, int height){
			return test.getSubimage(x, y, width, height);
	}
}
