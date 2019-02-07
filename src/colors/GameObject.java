package colors;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	float speed;
boolean isAlive = true;
Rectangle collisionBox;

 
	public GameObject(float speed,int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.speed = speed;
collisionBox = new Rectangle();
	}

	public void update() {
		collisionBox.setBounds(x +GamePanel.cam.x , y + GamePanel.cam.y, width, height);
		
	}

	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawRect(x + GamePanel.cam.x, y + GamePanel.cam.y, width, height);
		
	}

}


