package colors;

import java.awt.Graphics;

public class Allobsticles {
	Obsticle[] obsticles;
	int y;
	int Space = 200;

	Allobsticles(int y) {
		this.y = y;
		obsticles = new Obsticle[10];
		for (int i = 0; i < obsticles.length; i++) {
			obsticles[i] = new Obsticle(0, y + Space * i);

		}

	}

	void draw(Graphics g) {
		for (Obsticle obsticle : obsticles) {
			obsticle.draw(g);
		}
	}

	void update() {
		for (Obsticle obsticle : obsticles) {
			obsticle.update();
		}
	}

}
