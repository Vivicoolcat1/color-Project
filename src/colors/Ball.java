package colors;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ball extends GameObject  {
	float speed;
	float gravity = 2f;
int minY;
Random rand = new Random ();


	public void update() {
		
		super.update();
		speed += gravity;
		y += speed;
		
		if(y<minY) {
			minY=y;
		}
	
	}
	

	
	 

	public void draw(Graphics g, camera cam) {
		rand.nextInt(3);
		if(rand.equals(0)) {
			g.setColor(Color.YELLOW);
			
			
		}
		else if(rand.equals(1)) {
			g.setColor(Color.BLUE);
			
		}
		else if(rand.equals(2)) {
			g.setColor(Color.RED);
			
		}
		else {
			g.setColor(Color.GREEN);
			
		}
		
		g.fillOval(x + cam.x, y + cam.y, width, height);
		g.setColor(Color.BLACK);
g.drawOval(x + cam.x, y + cam.y, width, height);
	}

	public Ball(int x, int y, int width, int height) {
		super(x, y, 25, 25);

		speed = 5;

	}

}
