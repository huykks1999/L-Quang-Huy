import java.util.ArrayList;
import java.util.List;

public class Drone extends Bee {

	static List<Drone> drone = new ArrayList<>(10);

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

	@Override
	public void checkHealthStatus() {
		if (health > 50) {
			status = "Alive";
		} else {
			status = "Death";
		}
	}

	public Drone() {
		this.health = 100;
		

	}
}