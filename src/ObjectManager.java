import java.awt.Graphics;
import java.util.ArrayList;

//your password is JesusChrist123!
public class ObjectManager {
	rocketship _rocket;
	ArrayList <Projectile> projectiles;
	
	public ObjectManager(rocketship rocket) {
		_rocket = rocket;
		projectiles = new ArrayList<Projectile>();
	}
	
	public void update() {
		_rocket.update();
		for(Projectile p : projectiles) {
			p.update();
		}
	}
	
	public void draw(Graphics g) {
		_rocket.draw(g);
		for(Projectile p : projectiles) {
			p.draw(g);
		}
	}
	
	public void addProjectile(Projectile bullet) {
		
	}
}
