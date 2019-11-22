import java.awt.Color;
import java.awt.Graphics;

//your password is JesusChrist123!
public class Projectile extends GameObject{
	int speed;
	
	public Projectile(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed = 10;
		
	}
	public void update() {
		super.update();
    	_y -= speed;
    	if(_y < 0) {
    		isAlive = false;
    	}
    }
     
	public void draw(Graphics g) { 
		g.setColor(Color.YELLOW);
		g.fillRect(_x, _y, _width, _height);
    }
	
}
