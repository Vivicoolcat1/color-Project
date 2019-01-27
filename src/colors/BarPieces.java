package colors;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class BarPieces extends GameObject  {
	
	Random rand = new Random();
	Color c;
	int rand2 ;
	
public  BarPieces(float speed, int x, int y, int height, int width ) {
	super(speed,x,y,height,width);
	
	
	rand2 =rand.nextInt(3);
	if (rand2==0) {
		c=(Color.YELLOW);

	} else if (rand2==1) {
		c=(Color.BLUE);

	} else if (rand2==2) {
		c=(Color.RED);

	} else {
		c=(Color.GREEN);}
}


	public void update() {
		super.update();
		x += speed;
		System.out.println("CB 2 = " + this.collisionBox);
		System.out.println(this.c);
	}
	
	public void draw(Graphics g) {
		
		g.setColor(c);
		g.fillRect(x + GamePanel.cam.x, -y + GamePanel.cam.y , width, height);
		g.setColor(Color.BLACK);
		g.drawRect(x + GamePanel.cam.x, -y + GamePanel.cam.y, width, height);
		System.out.println(GamePanel.cam.x);
	    System.out.println(GamePanel.cam.y);
	    System.out.println(x);
	    System.out.println(y);
	    super.draw(g);
	}
	
	
	
}
