package colors;

import java.awt.Color;
import java.awt.Graphics;


public class youWin extends GameObject {

	public youWin(float speed,int x, int y, int height, int width) {
		super(speed,x,y,height,width);
		
		
		
	}
	public void update() {
		super.update();
		
		
		
		
	}
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(x + GamePanel.cam.x, y + GamePanel.cam.y, width, height);
		super.draw(g);
		
		
		
		
	}
}
