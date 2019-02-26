package colors;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class BarPieces extends GameObject  {
	
	Random rand = new Random();
	Color c;
	int rand2 ;
	
public  BarPieces(float speed, int x, int y, int height, int width ) {
	super(speed,x,y,height,width);}
	
	
	

	public void update() {
		super.update();
		x += speed;
		
	
	}
	
	public void draw(Graphics g) {
		
		g.setColor(c);
		g.fillRect(x + GamePanel.cam.x, y + GamePanel.cam.y , width, height);
		g.setColor(Color.BLACK);
		g.drawRect(x + GamePanel.cam.x, y + GamePanel.cam.y, width, height);
		
	    super.draw(g);
	}
	public void setColor(Color c) {
		this.c = c;
	}
	
	
}
