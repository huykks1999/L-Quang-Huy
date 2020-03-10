import java.util.ArrayList;
import java.util.List;

public class Queen extends Bee {

	static List<Queen> queen = new ArrayList<>(10);

	@Override
	public void damage(int damage) {
		super.damage(damage);
		if (health < 20) {
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
		if (health > 20) {
			status = "Alive";
		} else {
			status = "Death";
		}
	}

	public Queen() {
		this.health = 100;
		
	}

}
