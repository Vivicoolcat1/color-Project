package colors;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;


import javax.swing.JPanel;
import javax.swing.Timer;



public class GamePanel extends JPanel implements ActionListener , KeyListener {
	
	Timer t;
	Font titleFont1;
	Font titleFont2;
	Font titleFont3;
	Font titleFont4;
	Font titleFont5;
	Font titleFont6;
	Font titleFont7;
	Font titleFont8;
	final int MENU_STATE = 0;

	final int GAME_STATE = 1;

	final int END_STATE = 2;

	final int INSTRUCTION_STATE =3;
	int currentState = MENU_STATE;
	

	@Override

	public void paintComponent(Graphics g) {

		if (currentState == MENU_STATE) {

			drawMenuState(g);

		} else if (currentState == GAME_STATE) {

			drawGameState(g);

		} else if (currentState == END_STATE) {

			drawEndState(g);

		}
		else if(currentState == INSTRUCTION_STATE) {
			drawInstructionState(g);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Test1");
		
		
		if (currentState == MENU_STATE) {

			updateMenuState();

		} else if (currentState == GAME_STATE) {

		
			updateGameState();

		} else if (currentState == END_STATE) {

			updateEndState();

		}
		else if (currentState == INSTRUCTION_STATE) {
			updateInstructionState();
		}
repaint();
	}

	public GamePanel() {
		t = new Timer(1000 / 60, this);
		titleFont1 = new Font("Ariel", Font.PLAIN, 48);
		titleFont2 = new Font("Ariel", Font.PLAIN, 30);
		titleFont3 = new Font("Ariel", Font.PLAIN, 30);
		titleFont4 = new Font("Ariel", Font.PLAIN, 60);
		titleFont5 = new Font("Ariel", Font.PLAIN, 30);
		titleFont6 = new Font("Ariel", Font.PLAIN, 35);
		titleFont7 = new Font("Ariel", Font.PLAIN, 60);
		titleFont8 = new Font("Ariel", Font.PLAIN, 35);
		
		  

       


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
			
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE && currentState == MENU_STATE) {
			currentState = INSTRUCTION_STATE;
		}

	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void updateMenuState() {

	}

	public void updateGameState() {
			
	}

	public void updateEndState() {

	}
	public void updateInstructionState() {
		
	}

	public void drawMenuState(Graphics g) {
		g.setColor(Color.CYAN);

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
		g.setColor(Color.BLACK);



	
	}

	public void drawEndState(Graphics g) {
		g.setColor(Color.DARK_GRAY);

		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setFont(titleFont4);
		g.setColor(Color.WHITE);
		g.drawString("You Died! ¯\\_(ツ)_/¯", 50, 200);
		g.setFont(titleFont5);
		g.setColor(Color.WHITE);
		g.drawString("your score is " , 50, 400);
		g.setFont(titleFont6);
		g.setColor(Color.WHITE);
		g.drawString("Press ENTER to restart", 50, 600);
}
public void drawInstructionState (Graphics g) {
	g.setColor(Color.LIGHT_GRAY);
	g.fillRect(0, 0, WIDTH, HEIGHT);
	g.setFont(titleFont7);
	g.setColor(Color.WHITE);
	g.drawString("INSTRUCTIONS", 50, 200);
	g.setFont(titleFont8);
	g.setColor(Color.WHITE);
	g.drawString("The object of the game is to get points as you can. \n 1 star = 1 point. There is a catch though, you have to be the same color as the thing you are going through or else you DIE! \n To fly press the up arrow key DONT hold it you will fall. \n GOOD LUCK ;D " , 50, 400);
}
	
	
}
