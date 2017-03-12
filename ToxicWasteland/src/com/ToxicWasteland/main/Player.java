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
		return new Rectangle(x, y, 32, 32);
	}
		
	
	public void tick() {
		x += velX;
		y += velY;
		
		x = Game.clamp(x, 0, Game.WIDTH - 38);
		y = Game.clamp(y, 0, Game.HEIGHT - 60);
		//if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
		//if(x <= 0 || x >= Game.WIDTH - 16) velX *= -1;
		
		collision();
	}
	
	private void collision(){
		for(int i = 0; i < handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);
			if(tempObject.getId() == ID.BasicEnemy){
				if(getBounds().intersects(tempObject.getBounds())){
					HUD.HEALTH -= 3;
				}
				else if(tempObject.getId() == ID.FatEnemy){
					if(getBounds().intersects(tempObject.getBounds())){
						HUD.HEALTH -= 5;					
				}
			}
		}
	}
}

	
	
	public void render(Graphics g){
		if(id == ID.Player) g.setColor(Color.white);
		
		Graphics2D g2d = (Graphics2D) g;
		
			
		
		//g.setColor(Color.white);
		g.fillRect(x, y, 32, 32);
	}

}
