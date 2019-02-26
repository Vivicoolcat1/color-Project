package colors;

import java.awt.Color;
import java.awt.Graphics;

import org.omg.Messaging.SyncScopeHelper;


public class youWin extends GameObject {

	public youWin(int x, int y, int height, int width) {
		super(0,-x,-y,height,width);
		
		
		
	}
	public void update() {
		super.update();
		
		
		
		
	}
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		super.draw(g);
		g.fillRect(x+ GamePanel.cam.x, y + GamePanel.cam.y, width, height);
		
		
		
	}
}
