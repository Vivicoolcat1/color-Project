package colors;


	import java.awt.Color;
	import java.awt.Graphics;
import java.util.Random;

	public class ball extends GameObjects {
		int speed;
		public void update() {
	super.update();
		}

		public void draw(Graphics g) {
			Random rand = new Random();
			float r = rand.nextFloat();
			float h = rand.nextFloat();
			float b = rand.nextFloat();
			Color randomColor = new Color(r, h, b);
			g.setColor(randomColor);
			g.fillRect(x, y, width, height);


		}

		public ball(int x, int y, int width, int height) {
			//super(x,y,width,height);
	speed=5;

		}

	}

