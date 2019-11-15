import java.awt.Color;
import java.awt.Graphics;

//your password is JesusChrist123!
public class rocketship extends GameObject {
	int speed;

	public rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		speed = 25;
	} 
	 public void update() {
	    	
	    }
	    
	 public void draw(Graphics g) {
		 super.update();
		 g.setColor(Color.BLUE);
	     g.fillRect(_x, _y, _width, _height);
	    }
	
}