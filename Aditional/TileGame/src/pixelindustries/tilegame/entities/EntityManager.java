package pixelindustries.tilegame.entities;

import java.awt.Graphics;
import java.util.ArrayList;

import pixelindustries.tilegame.Handler;
import pixelindustries.tilegame.entities.creatures.Player;

public class EntityManager {
	private Handler handler;
	private Player player;
	private ArrayList<Entity> entities;
	
	public EntityManager(Handler handler, Player player){
		this.handler = handler;
		this.player = player;
		entities = new ArrayList<Entity>();
	}
	public void tick(){
		for(int chislo = 0; chislo < entities.size();chislo++){
			Entity entity = entities.get(chislo);
			entity.tick();
		}
		player.tick();
	}
	public void render(Graphics g){
		for(Entity znachenie: entities){
			znachenie.render(g);
		}
		player.render(g);
	}
	
	public void addEntity(Entity e){
		entities.add(e);
	}
	
	//GETTERS SETTERS
	
	public Handler getHandler() {
		return handler;
	}
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public ArrayList<Entity> getEntities() {
		return entities;
	}
	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}
}
