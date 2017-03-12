package com.ToxicWasteland.main;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class FatEnemy extends GameObject{

Handler handler;
	
	public FatEnemy(int x,int y,ID id, Handler handler){
		super(x, y, id);
		this.handler = handler;
	}
		
		public Rectangle getBounds(){
			return new Rectangle(x, y, 40, 40);
		}
			
		
		
	public void tick(){		
	}	
	public void render(Graphics g) {	
		g.setColor(Color.red);
		g.fillRect(x, y, 40, 40);
	}
}
