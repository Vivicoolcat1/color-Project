package colors;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Obsticle extends GameObject{
	Random rand = new Random();
	public Obsticle(int x, int y, int width, int height) {
		super(x,y,100,50);
	}
	

	public void draw(Graphics g, camera cam) {
		 int rand2 =rand.nextInt(3);
		if (rand2==0) {
			g.setColor(Color.YELLOW);

		} else if (rand2==1) {
			g.setColor(Color.BLUE);

		} else if (rand2==2) {
			g.setColor(Color.RED);

		} else {
			g.setColor(Color.GREEN);

		}

		g.fillRect(300 + 0, -100 + 650 , 100, 50);
		g.setColor(Color.BLACK);
		g.drawRect(x + cam.x, y + cam.y, width, height);
		System.out.println(cam.x);
	    System.out.println(cam.y);
	    System.out.println(x);
	    System.out.println(y);
	}

	
	
	public void update() {
		super.update();
	}
	
	
	
}
