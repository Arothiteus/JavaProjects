package com.ToxicWasteland.main;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	private Handler handler;
	private boolean[] keyDown = new boolean[4];
	
	public KeyInput(Handler handler){
		this.handler = handler;
		keyDown[0]=false; //W
		keyDown[1]=false; //S
		keyDown[2]=false; //A
		keyDown[3]=false; //D
	}
	
	public void keyPressed(KeyEvent e){
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player){
				
				if(key == KeyEvent.VK_W) { tempObject.setVelY(-3); keyDown[0]=true; } //W
				if(key == KeyEvent.VK_S) { tempObject.setVelY(3); keyDown[1]=true; }  //S
				if(key == KeyEvent.VK_A) { tempObject.setVelX(-3); keyDown[2]=true; } //A
				if(key == KeyEvent.VK_D) { tempObject.setVelX(3); keyDown[3]=true; }  //D
			}									
		}
		if(key == KeyEvent.VK_ESCAPE) System.exit(1);
		
	}
	
	public void keyReleased(KeyEvent e){
		int key = e.getKeyCode();
		
		
		for(int i = 0; i < handler.object.size(); i++){
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player){				
				
				
				if(key == KeyEvent.VK_W) keyDown[0]=false; //W 
				if(key == KeyEvent.VK_S) keyDown[1]=false; //S 
				if(key == KeyEvent.VK_A) keyDown[2]=false; //A 
				if(key == KeyEvent.VK_D) keyDown[3]=false; //D 
				
				//vert.movement
				if(!keyDown[0] && !keyDown[1]) tempObject.setVelY(0);
				//horz.movement
				if(!keyDown[2] && !keyDown[3]) tempObject.setVelX(0);
			}
			
				
		
		}
	}

}
