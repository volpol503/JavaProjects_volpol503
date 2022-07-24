package pixelindustries.tilegame.states;

import java.awt.Graphics;

import pixelindustries.tilegame.Handler;
import pixelindustries.tilegame.entities.creatures.Player;
import pixelindustries.tilegame.entities.statics.Tree;
import pixelindustries.tilegame.world.World;

public class GameState extends State{
//	private Player player;
//	private Tree tree;
	private World world;

	public GameState(Handler handler){
		super(handler);
		world = new World(handler,"res/worlds/world1.txt");
		handler.setWorld(world);
//		player = new Player(handler, 100, 100);
//		tree = new Tree(handler, 800, 128);
	}
	int x = 0;
	@Override
	public void tick() {
			world.tick();
//			player.tick();
//			tree.tick();
	}
	

	@Override
	public void render(Graphics g) {
		world.render(g); 
		
//		player.render(g);
//		tree.render(g);
		
	}
	
	
	
}
