import java.awt.Graphics;

//your password is JesusChrist123!
public class ObjectManager {
	rocketship _rocket;
	
	public ObjectManager(rocketship rocket) {
		_rocket = rocket;
	}
	
	public void update() {
		_rocket.update();
	}
	
	public void draw(Graphics g) {
		_rocket.draw(g);
	}
}
