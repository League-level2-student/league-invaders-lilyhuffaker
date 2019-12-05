import java.awt.Color;
import java.awt.Graphics;

//your password is JesusChrist123!
public class Alien extends GameObject {

	public Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
	
	public void update() {
		super.update();
    	_y++;
    }
    
	public void draw(Graphics g) { 
		g.setColor(Color.GREEN);
		g.drawImage(gamePanel.alienImg, _x, _y, _width, _height, null);
    }
}
