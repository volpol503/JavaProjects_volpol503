package pixelindustries.tilegame;


import pixelindustries.tilegame.gfx.GameCamera;
import pixelindustries.tilegame.input.KeyManager;
import pixelindustries.tilegame.world.World;

import javax.swing.*;

public class Handler {

	private Game game;
	private World world;

	public Handler(Game game){
		this.game = game;
	}
	
	public GameCamera getGameCamera(){
		return game.getGameCamera();
	}
	
	public KeyManager getKeyManager(){
		return game.getKeyManager();
	}
	
	public int getWidth(){
		return game.getWidth();
	}
	
	public int getHeight(){
		return game.getHeight();
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

}
