import java.util.ArrayList;
import java.util.List;

public class Drone extends Bee {

	static List<Drone> drone = new ArrayList<>(10);

	//override void Damage Bee of Drone để tấn công ong loại Drone
	@Override
	public void damage(int damage) {
		super.damage(damage);
		super.damage(damage);
		if (health < 50) {
			health = health;
		} else {
			health = health - damage;
		}

		if (health < 0) {
			health = 0;
		}
	}
    
	// Override void checkHealthStatus of Bee để xem con Drone còn sống hay hẹo
	@Override
	public void checkHealthStatus() {
		if (health > 50) {
			status = "Alive";
		} else {
			status = "Death";
		}
	}
    
	// construcster begin for blood = 100 
	public Drone() {
		this.health = 100;
		

	}
}