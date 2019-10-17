import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LeagueInvaders {
	JFrame frame;
	final int width = 500;
	final int height = 800;
	
	gamePanel panelGame;
	
	public static void main(String[] args) {
		new LeagueInvaders().setup();
		
	}
	LeagueInvaders(){
		frame = new JFrame();
		panelGame = new gamePanel();
	}
	void setup() {
		frame.add(panelGame);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(width, height);
		frame.pack();
		panelGame.startGame();
	}
}
