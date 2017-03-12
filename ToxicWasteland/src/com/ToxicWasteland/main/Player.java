package com.ToxicWasteland.main;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Player extends GameObject {
	
	Random r = new Random();
	Handler handler;
		
	
	public Player(int x,int y,ID id, Handler handler){
		super(x, y, id);
		this.handler = handler;
	
	}
	
	public Rectangle getBounds(){
		return new Rectangle((int)x, (int)y, 32, 32);
	}
		
	
	public void tick() {
		x += velX;
		y += velY;
		
		x = Game.clamp((int)x, 0, Game.WIDTH - 38);
		y = Game.clamp((int)y, 0, Game.HEIGHT - 60);		
		collision();
	}
	
	private void collision(){
		for(int i = 0; i < handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);
			if(tempObject.getId() == ID.BasicEnemy){
				if(getBounds().intersects(tempObject.getBounds())){
					HUD.HEALTH -= 3;								
				
				}
			}
				if(tempObject.getId() == ID.FatEnemy){
					if(getBounds().intersects(tempObject.getBounds())){
						HUD.HEALTH -= 6;
				}
			}
		}
	}

	
	
	public void render(Graphics g){
		if(id == ID.Player) g.setColor(Color.white);
		
		Graphics2D g2d = (Graphics2D) g;
		
			
		
		//g.setColor(Color.white);
		g.fillRect((int)x, (int)y, 32, 32);
	}

}
