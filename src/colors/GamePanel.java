package colors;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {

	Timer t;
	Font titleFont1;
	Font titleFont2;
	Font titleFont3;
	Font titleFont4;
	Font titleFont5;
	Font titleFont6;
	Font titleFont7;
	Font titleFont8;
	Font titleFont9;
	Ball ball  = new Ball(300, 0, 25, 25);
	ObjectManager om  = new ObjectManager(ball);
	Obsticle ob;
	Obsticle ob2;
	Obsticle ob3;
	Obsticle ob4;
	boolean moveUp;
	static camera cam;
	static final int startingY = 0;

	static final int MENU_STATE = 0;

	static final int GAME_STATE = 1;

	static final int END_STATE = 2;

	static final int INSTRUCTION_STATE = 3;
	static int currentState = MENU_STATE;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Test1");

		repaint();
		if (currentState == MENU_STATE) {

			updateMenuState();

		} else if (currentState == GAME_STATE) {

			updateGameState();

			System.out.println(ball.y);
			System.out.println(startingY);
			System.out.println(cam.y);
			System.out.println(ball.gravity);
			System.out.println(ball.speed);
		} else if (currentState == END_STATE) {

			updateEndState();

		} else if (currentState == INSTRUCTION_STATE) {
			updateInstructionState();
		}

	}

	@Override

	public void paintComponent(Graphics g) {
		System.out.println("test3");
		if (currentState == MENU_STATE) {

			drawMenuState(g);

		} else if (currentState == GAME_STATE) {

			drawGameState(g);

		} else if (currentState == END_STATE) {

			drawEndState(g);

		} else if (currentState == INSTRUCTION_STATE) {
			drawInstructionState(g);
		}

	}

	public GamePanel() {
		t = new Timer(1000 / 60, this);
		titleFont1 = new Font("Impact", Font.PLAIN, 48);
		titleFont2 = new Font("Comic Sans MS", Font.PLAIN, 30);
		titleFont3 = new Font("Comic Sans MS", Font.PLAIN, 30);
		titleFont4 = new Font("Impact", Font.PLAIN, 60);
		titleFont5 = new Font("Comic Sans MS", Font.PLAIN, 30);
		titleFont6 = new Font("Comic Sans MS", Font.PLAIN, 35);
		titleFont7 = new Font("Impact", Font.PLAIN, 60);
		titleFont8 = new Font("Comic Sans MS", Font.PLAIN, 20);
		titleFont9 = new Font("Comic Sans MS", Font.PLAIN, 40);
		cam = new camera(0, 650);
		ball.isAlive = true;
		
		ob = new Obsticle(0, 200, 200, 20);
		ob2 = new Obsticle(ob.x + ob.width, ob.y, ob.width, 20);
		ob3 = new Obsticle(ob2.x + ob.width, ob.y, ob2.width, 20);
		ob4 = new Obsticle(ob3.x + ob.width, ob.y, ob3.width, 20);
		}

	public void startGame() {
		t.start();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER && currentState == MENU_STATE) {
			currentState = GAME_STATE;
		} else if (e.getKeyCode() == KeyEvent.VK_ENTER && currentState == GAME_STATE) {
			currentState = END_STATE;

		} else if (e.getKeyCode() == KeyEvent.VK_ENTER && currentState == END_STATE) {
			currentState = MENU_STATE;

		} else if (e.getKeyCode() == KeyEvent.VK_SPACE && currentState == MENU_STATE) {
			currentState = INSTRUCTION_STATE;
		} else if (e.getKeyCode() == KeyEvent.VK_ENTER && currentState == INSTRUCTION_STATE) {
			currentState = MENU_STATE;

		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			moveUp = true;

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			moveUp = false;

			;
		}
	}

	public void updateMenuState() {

	}

	public void updateGameState() {
		if (moveUp) {
			ball.speed = -5;

			System.out.println("Test 5");
		}
		ball.update();
		
			
		om.obs.add(ob);
		om.obs.add(ob2);
		om.obs.add(ob3);
		om.obs.add(ob4);
		
	}

	public void updateEndState() {

	}

	public void updateInstructionState() {

	}

	public void drawMenuState(Graphics g) {

		this.setBackground(Color.CYAN);

		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setFont(titleFont1);
		g.setColor(Color.WHITE);
		g.drawString("COLOR MATCH", 50, 200);
		g.setFont(titleFont2);
		g.setColor(Color.WHITE);
		g.drawString("Press 	ENTER to start", 50, 400);
		g.setFont(titleFont3);
		g.setColor(Color.WHITE);
		g.drawString("Press SPACE for instructions", 50, 600);
		System.out.println("test2");

	}

	public void drawGameState(Graphics g) {
		this.setBackground(Color.BLACK);
ball.draw(g,cam);
ob.draw(g,cam);

om.draw(g, cam);
	
	}

	public void drawEndState(Graphics g) {
		this.setBackground(Color.DARK_GRAY);

		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setFont(titleFont4);
		g.setColor(Color.WHITE);
		g.drawString("You Died! ¯\\_(ツ)_/¯", 50, 200);
		g.setFont(titleFont5);
		g.setColor(Color.WHITE);
		g.drawString("your score is ", 50, 400);
		g.setFont(titleFont6);
		g.setColor(Color.WHITE);
		g.drawString("Press ENTER to restart", 50, 600);
	}

	public void drawInstructionState(Graphics g) {
		this.setBackground(Color.GREEN);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setFont(titleFont7);
		g.setColor(Color.WHITE);
		g.drawString("INSTRUCTIONS", 50, 200);
		g.setFont(titleFont8);
		g.setColor(Color.WHITE);
		g.drawString("The object of the game is to get points as you can.", 50, 400);
		g.drawString("1 star = 1 point. There is a catch though, ", 50, 440);
		g.drawString("you have to be the same color as the thing you are going through or else you DIE!", 50, 480);
		g.drawString("To fly press the up arrow key .", 50, 520);
		g.drawString("GOOD LUCK! ;D", 50, 560);
		g.setFont(titleFont9);
		g.setColor(Color.WHITE);
		g.drawString("Press ENTER to go back to the menu", 50, 700);

	}

}
