import java.util.ArrayList;
import java.util.List;

public class Queen extends Bee {

	static List<Queen> queen = new ArrayList<>(10);
    
	//override void Damage Bee of Queen để tấn công ong loại Queen
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
	
	
	// Override void checkHealthStatus of Bee để xem con Queen còn sống hay hẹo
	@Override
	public void checkHealthStatus() {
		if (health > 20) {
			status = "Alive";
		} else {
			status = "Death";
		}
	}

	
	// construcster begin for blood = 100 
	public Queen() {
		this.health = 100;
		
	}

}
