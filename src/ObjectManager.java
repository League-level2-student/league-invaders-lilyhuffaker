import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

//your password is JesusChrist123!
public class ObjectManager {
	rocketship _rocket;
	ArrayList <Projectile> projectiles;
	ArrayList <Alien> aliens;
	long enemyTimer;
	int enemySpawnTime;
	
	public ObjectManager(rocketship rocket) {
		_rocket = rocket;
		projectiles = new ArrayList<Projectile>();
		aliens = new ArrayList<Alien>();
		enemyTimer = 0;
		enemySpawnTime = 1000;
	}
	
	public void update() {
		_rocket.update();
		for(Projectile p : projectiles) {
			p.update();
		}
		for(Alien a : aliens) { 
			a.update();
		}
	}
	
	public void draw(Graphics g) {
		_rocket.draw(g);
		for(Projectile p : projectiles) {
			p.draw(g);
		}
		for(Alien a : aliens) { 
			a.draw(g);
		}
	}
	
	public void manageEnemies(){
        if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
                addAlien(new Alien(new Random().nextInt(LeagueInvaders.width), 0, 50, 50));
                enemyTimer = System.currentTimeMillis();
        }
}
	
	public void addProjectile(Projectile bullet) {
		projectiles.add(bullet);
	}
	
	public void addAlien (Alien steve) {
		aliens.add(steve);
	}
	
	public void purgeObjects() {
		for(int i=aliens.size()-1; i>=0; i--) {
			if(!aliens.get(1).isAlive) {
				aliens.remove(i);
			}
		}
	}
	
}
