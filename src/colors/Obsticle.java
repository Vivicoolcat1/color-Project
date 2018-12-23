package colors;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Obsticle extends GameObject  {
	Random rand = new Random();
	Color c;
	int rand2 ;
	
		
		public Obsticle(int x, int y, int width, int height) {
			super(x,y,width,height);
			rand2 =rand.nextInt(3);
			if (rand2==0) {
				c=(Color.YELLOW);

			} else if (rand2==1) {
				c=(Color.BLUE);

			} else if (rand2==2) {
				c=(Color.RED);

			} else {
				c=(Color.GREEN);}

		}
		

		
		 
	public void draw(Graphics g, camera cam) {
		
g.setColor(c);
		g.fillRect(x + cam.x, -y + cam.y , width, height);
		g.setColor(Color.BLACK);
		g.drawRect(x + cam.x, -y + cam.y, width, height);
		System.out.println(cam.x);
	    System.out.println(cam.y);
	    System.out.println(x);
	    System.out.println(y);
	}}

	
	
	
