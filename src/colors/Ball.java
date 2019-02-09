

package colors;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ball extends GameObject {
	float speed = -5;
	float gravity = .3f;
	int minY;
	Random rand = new Random();
	Boolean startOfGame = true;
	Color c;
	int rand2;
	Allobsticles ao;

	public void update() {

		System.out.println("Cb =" + this.collisionBox);
		System.out.println(this.c);
		super.update();
		speed += gravity;
		y += speed;
		
		
		for (Obsticle obsticle : ao.obsticles) {
			
			if (obsticle.a.collisionBox.intersects(this.collisionBox)) {
				System.out.println("COLLISION");
				if (!obsticle.a.c.equals(this.c)) {
					GamePanel.currentState = GamePanel.END_STATE;
				
				}
			}
			if (obsticle.b.collisionBox.intersects(this.collisionBox)) {
				System.out.println("COLLISION");
				if (!obsticle.b.c.equals(this.c)) {
					GamePanel.currentState = GamePanel.END_STATE;
				}
			}
			if (obsticle.c.collisionBox.intersects(this.collisionBox)) {
				System.out.println("COLLISION");
				if (!obsticle.c.c.equals(this.c)) {
					GamePanel.currentState = GamePanel.END_STATE;
				}
			}
			if (obsticle.d.collisionBox.intersects(this.collisionBox)) {
				System.out.println("COLLISION");
				if (!obsticle.d.c.equals(this.c)) {
					GamePanel.currentState = GamePanel.END_STATE;
				}
			}
			if (obsticle.e.collisionBox.intersects(this.collisionBox)) {
				System.out.println("COLLISION");
				if (!obsticle.e.c.equals(this.c)) {
					GamePanel.currentState = GamePanel.END_STATE;
				}
			}
		
		}
if(GamePanel.finish.collisionBox.intersects(this.collisionBox)) {
	System.out.println("They hit");
}
		if (y < minY && y < -500) {
			minY = y;
			GamePanel.moveCamera(y);
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
			{

				if (!startOfGame && y > GamePanel.startingY) {
					isAlive = false;
				}
				if (!isAlive) {
					GamePanel.currentState = GamePanel.END_STATE;
				}

			}
		}
	}

	public void draw(Graphics g) {

		g.setColor(c);
		g.fillOval(x + GamePanel.cam.x, y + GamePanel.cam.y, width, height);
		g.setColor(Color.BLACK);
		g.drawOval(x + GamePanel.cam.x, y + GamePanel.cam.y, width, height);
		g.setColor(c);
		super.draw(g);
	}

	public Ball(float speed, int x, int y, int width, int height) {
		
		super(speed, x, y, 25, 25);
		
		rand2 = rand.nextInt(4);
		speed = -5;
		if (rand2 == 0) {
			c = (Color.YELLOW);

		} else if (rand2 == 1) {
			c = (Color.BLUE);

		} else if (rand2 == 2) {
			c = (Color.RED);

		} else if (rand2 ==3){
			c = (Color.GREEN);
		}
		else {
			c = (Color.MAGENTA);
		}
		

	}

}
