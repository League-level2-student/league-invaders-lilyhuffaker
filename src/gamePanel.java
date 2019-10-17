//your password is JesusChrist123!
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class gamePanel extends JPanel implements ActionListener{  
	Timer timer;
	
	public gamePanel(){
		timer = new Timer(1000/60, this);
	}
	
	void startGame() {
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}
	
	@Override

	public void paintComponent(Graphics g){
		g.fillRect(10, 10, 100, 100);         
	}	
}