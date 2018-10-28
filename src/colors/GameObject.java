package colors;

import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
boolean isAlive = true;
int collisionBox;

 
	public GameObject(int x, int y, int width, int height,int collisionBox) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.collisionBox= collisionBox;

	}

	public void update() {
		

	}

	public void draw(Graphics g) {

	}

}


