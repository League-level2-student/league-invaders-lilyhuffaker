//your password is JesusChrist123!
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class gamePanel extends JPanel implements ActionListener, KeyListener{  
	Timer timer;
	GameObject gameObject;
	
	public gamePanel(){
		timer = new Timer(1000/60, this);
		gameObject = new GameObject(50, 50, 20, 20);
	}
	
	void startGame() {
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		gameObject.update();
		repaint();
	}
	
	@Override

	public void paintComponent(Graphics g){
		gameObject.draw(g);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("your toes, hand 'em over");
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