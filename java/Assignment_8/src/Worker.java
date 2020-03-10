import java.util.ArrayList;
import java.util.List;

public class Worker extends Bee {
	static List<Worker> worker = new ArrayList<>(10);

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

	@Override
	public void checkHealthStatus() {
		if (health > 70) {
			status = "Alive";
		} else {
			status = "Death";
		}
	}

	public Worker() {
		this.health = 100;
		
	}

}
