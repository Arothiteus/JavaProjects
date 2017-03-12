package com.ToxicWasteland.main;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class PlBullet extends GameObject{

	private Handler handler;
	private GameObject player;
	
	public PlBullet(float x,float y,ID id, Handler handler){
		super(x, y, id);
		this.handler = handler;		
		for(int i = 0; i < handler.object.size(); i++){
			if(handler.object.get(i).getId() == ID.Player) player = handler.object.get(i);
		}
		
		
	}
		
		public Rectangle getBounds(){
			return new Rectangle((int)x, (int)y, 25, 25);
		}
			
		
		
	public void tick(){		
		 x += velX;
         y += velY;
         float diffX = x - player.getX()-4;
         float diffY = y - player.getY()-4;
         float distance = (float) Math.sqrt((x-player.getX())*(x-player.getX())+(y-player.getY())*(y-player.getY()));
         velX = (float) ((-4/distance) * diffX);
         velY = (float) ((-4/distance) * diffY);
	}	
	public void render(Graphics g) {	
		g.setColor(Color.red);
		g.fillRect((int)x, (int)y, 25, 25);
	}
}
