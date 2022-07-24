package pixelindustries.tilegame;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import pixelindustries.tilegame.display.Display;
import pixelindustries.tilegame.gfx.Assets;
import pixelindustries.tilegame.gfx.GameCamera;
import pixelindustries.tilegame.gfx.ImageLoader;
import pixelindustries.tilegame.input.KeyManager;
import pixelindustries.tilegame.states.GameState;
import pixelindustries.tilegame.states.MenuState;
import pixelindustries.tilegame.states.State;

public class Game implements Runnable{
	private Display display;
	
	private int width, height;
	public String title;
	public boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	private BufferedImage testImage;
	private BufferedImage GUIInventory;
	private BufferedImage GUIFastSlots;
	private BufferedImage Background;
	//States
	private State gameState;
	private State menuState;
	//Input
	private KeyManager keyManager;
	
	//Camera
	private GameCamera gameCamera;
	//Handler
	private Handler handler;

	
	public Game(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
	}
	private void init(){
		
		display = new Display(title,width,height);
		display.getFrame().addKeyListener(keyManager);
		Assets.init();
		Background = ImageLoader.LoadImage("/textures/Forest_7.png");
		GUIFastSlots = ImageLoader.LoadImage("/textures/GUIFastSlots512.png");
		GUIInventory = ImageLoader.LoadImage("/textures/GUIInventory512.png");
		
		handler = new Handler(this);
		gameCamera = new GameCamera(handler, 0, 0);
		
		
		gameState = new GameState(handler);
		menuState = new MenuState(handler);
		State.setState(gameState);

	}
	private void tick(){
		
		keyManager.tick();
		if(State.getState()!= null)
			State.getState().tick();
	}
	private void render(){
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//Clear Screen
		g.clearRect(0, 0, width, height);
		//Draw Here
		g.drawImage(Background, 0,0, null);
		if(State.getState()!= null)
			State.getState().render(g);
//		g.drawImage(GUIFastSlots, 5, 5, null);
//		g.drawImage(GUIInventory, 5, 74, null);
		//End Drawing
		bs.show();

		g.dispose();
	}
	public void run(){
		init();
		int fps = 60;
		double timePerTick = 1000000000/fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		

		while(running){
			now = System.nanoTime();
			delta += (now - lastTime)/timePerTick;
			timer += now -lastTime;
			lastTime = now;
			if(delta >= 1){
			tick();
			render();
			ticks++;
			delta--;
			}
			if(timer >= 1000000000){	
				ticks = 0;
				timer = 0;
			}
		}
		stop();
	}
	public KeyManager getKeyManager(){
		return keyManager;
	}
	public GameCamera getGameCamera(){
		return gameCamera;
	}
	public int getWidth(){
		return width;
	}
	public int getHeight(){
		return height;
	}
	public synchronized void start(){
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	public synchronized void stop(){
		if(!running)
			return;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	}
		
}

