//your password is JesusChrist123!
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class gamePanel extends JPanel implements ActionListener, KeyListener{  
	Timer timer;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;
	Font largerFont;
	rocketship ship;
	
	public gamePanel(){
		timer = new Timer(1000/60, this);
		titleFont = new Font("Arial", Font.PLAIN, 40);
		largerFont = new Font("Arial", Font.PLAIN, 35);
		ship = new rocketship(250, 700, 50, 50);
	}
	
	void updateMenuState() {
		
	}
	
	void updateGameState() {
		ship.update();
	}
	
	void updateEndState() {
		
	}
	
	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.width, LeagueInvaders.height);    
		g.setFont(titleFont);
		g.setColor(Color.black);
		g.drawString("Ralph Invaders", 130, 100);
		g.drawString("Press the enter key to begin", 10, 350);
		g.drawString("Space for instuctions", 5, 730);
	}
	
	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0,0, LeagueInvaders.width, LeagueInvaders.height);
		ship.draw(g);
	}
	
	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0,0, LeagueInvaders.width, LeagueInvaders.height);
		g.setFont(largerFont);
		g.setColor(Color.MAGENTA);
		g.drawString("Game over man, Game over", 30, 100);
		g.drawString("You did murder of dis many:", 10, 300);
		g.drawString("Press the enter to murder more", 10, 500);
	}
	
	void startGame() {
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		 if(currentState == MENU_STATE){
             updateMenuState();
             }
	 else if(currentState == GAME_STATE){
             updateGameState();     
             }
     else if(currentState == END_STATE){
             updateEndState();
     }
	}
	
	@Override

	public void paintComponent(Graphics g){
		 if(currentState == MENU_STATE){
             drawMenuState(g);
     }
	else if(currentState == GAME_STATE){
             drawGameState(g);
     }
     else if(currentState == END_STATE){
             drawEndState(g);
     }
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("your toes, hand 'em over");
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState++;
			if(currentState > END_STATE){
                currentState = MENU_STATE;
        }
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("jesus is coooool, jesus is gooooood");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("gimmie some cheese");
	}	
}