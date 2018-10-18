package colors;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class ball extends GameObjects {
	float speed;
	float gravity = 0.1f;

	public void update() {
		super.update();
		speed += gravity;
		y += speed;
		if(y >=650) {
			y = 650;
		}
	}

	Random rand = new Random();
	float r = rand.nextFloat();
	float h = rand.nextFloat();
	float b = rand.nextFloat();
	Color randomColor = new Color(r, h, b);

	public void draw(Graphics g, camera c) {

		g.setColor(randomColor);
		g.fillOval(x + c.x, y + c.y, width, height);

	}

	public ball(int x, int y, int width, int height) {
		super(x, y, 50, 50);

		speed = 5;

	}

}
