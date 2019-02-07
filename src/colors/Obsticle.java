package colors;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class Obsticle {

	BarPieces a;
	BarPieces b;
	BarPieces c;
	BarPieces d;
	BarPieces e;
Random gen = new Random();
int rand;
	int x;
	int y;

	public Obsticle(int speed,int x, int y) {
		this.x = x;
		this.y = y;
ArrayList <Color> colors = new ArrayList <Color>();
colors.add(Color.red);
colors.add(Color.blue);
colors.add(Color.yellow);
colors.add(Color.green);
colors.add(Color.magenta);

rand = gen.nextInt(colors.size());
		a = new BarPieces(5, x, y - 2500, 200, 20);
		a.setColor(colors.get(rand));
		colors.remove(rand);
		e = new BarPieces(a.speed, x - a.width, a.y, a.width, a.height);
		rand = gen.nextInt(colors.size());
		e.setColor(colors.get(rand));
		colors.remove(rand);
		b = new BarPieces(a.speed, a.x + a.width, a.y, a.width, a.height);
		rand = gen.nextInt(colors.size());
		b.setColor(colors.get(rand));
		colors.remove(rand);
		c = new BarPieces(a.speed, b.x + a.width, b.y, a.width, a.height);
		rand = gen.nextInt(colors.size());
		c.setColor(colors.get(rand));
		colors.remove(rand);
		d = new BarPieces(a.speed, c.x + a.width, c.y, a.width, a.height);
		rand = gen.nextInt(colors.size());
		d.setColor(colors.get(rand));
		colors.remove(rand);
	}

	public void draw(Graphics g) {
		a.draw(g);
		b.draw(g);
		c.draw(g);
		d.draw(g);
		e.draw(g);

	}

	public void update() {
		a.update();
		b.update();
		c.update();
		d.update();
		e.update();

		if (a.x + a.width == colorMatch.WIDTH) {
			b.x = 0 - b.width;

		}
		if (b.x + b.width == colorMatch.WIDTH) {
			c.x = 0 - c.width;

		}
		if (c.x + c.width == colorMatch.WIDTH) {
			d.x = 0 - d.width;

		}
		if (d.x + d.width == colorMatch.WIDTH) {
			e.x = 0 - e.width;

		}
		if (e.x + e.width == colorMatch.WIDTH) {
			a.x = 0 - a.width;

		}
		if (a.c == b.c) {

		}
	}
}
