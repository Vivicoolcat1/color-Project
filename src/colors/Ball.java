package colors;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ball extends GameObject {
	float speed =-5;
	float gravity = .3f;
	int minY;
	Random rand = new Random();
	Boolean startOfGame = true;
	Color c;
	int rand2 ;
	public void update() {

		super.update();
		speed += gravity;
		y += speed;

		if (y < minY && y < -500) {
			minY = y;
			GamePanel.cam.y = y * -1 + 200;
		}
		if (startOfGame) {

			if (y > GamePanel.startingY) {
				y = GamePanel.startingY;
				speed = 0;
			}

			if (y + GamePanel.cam.y < -500) {
				startOfGame = false;

			}
		} else {

		}
		if (!startOfGame && y > GamePanel.startingY) {
			isAlive = false;
		}
		if (!isAlive) {
			GamePanel.currentState = GamePanel.END_STATE;
		}
		
	
	
	
	
	}

	
	
	public void draw(Graphics g, camera cam) {	
	
g.setColor(c);
		g.fillOval(x + cam.x, y + cam.y, width, height);
		g.setColor(Color.BLACK);
		g.drawOval(x + cam.x, y + cam.y, width, height);
		g.setColor(c);
	}

	public Ball(float speed,int x, int y, int width, int height) {
		super(speed,x, y, 25, 25);
		rand2 =rand.nextInt(3);
		speed = -5;
		if (rand2== 0) {
			c=(Color.YELLOW);

			} else if (rand2 ==1) {
				c=(Color.BLUE);

			} else if (rand2==2) {
				c=(Color.RED);

			} else {
				c=(Color.GREEN);
			}

	}

}
