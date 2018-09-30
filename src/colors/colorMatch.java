package colors;

import java.awt.Dimension;

import javax.swing.JFrame;

public class colorMatch {
	JFrame frame;
	static final int WIDTH= 800;
	static final int HEIGHT= 800;
	GamePanel b;
public static void main(String[] args) {
	colorMatch a = new colorMatch();
	a.setup();
}
public colorMatch(){
	frame = new JFrame();
	b = new GamePanel();
}
void setup(){
	frame.add(b);
	frame.setSize(WIDTH,HEIGHT);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
frame.pack();
b.startGame();
frame.addKeyListener(b);
	
	
}
}
