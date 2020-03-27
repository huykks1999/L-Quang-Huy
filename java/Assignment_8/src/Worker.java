import java.util.ArrayList;
import java.util.List;

public class Worker extends Bee {
	static List<Worker> worker = new ArrayList<>(10);
    
	
	//override void Damage Bee of Worker để tấn công ong loại Queen
	@Override
	public void damage(int damage) {
		super.damage(damage);
		if (health < 70) {
			health = health;
		} else {
			health = health - damage;
		}

		if (health < 0) {
			health = 0;
		}

	}
	
	// Override void checkHealthStatus of Bee để xem con Worker còn sống hay hẹo

	@Override
	public void checkHealthStatus() {
		if (health > 70) {
			status = "Alive";
		} else {
			status = "Death";
		}
	}

	
	// construcster begin for blood = 100 
	public Worker() {
		this.health = 100;
		
	}

}
