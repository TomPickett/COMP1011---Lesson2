
public class StrongMan extends Hero {

	//Constructor
	public StrongMan(String name) {
		super(name);
		this.boostStrength();	
	}
	
	//Private Methods
	private void boostStrength() {
		this.strength += 50;
		if (this.strength > 100) {
			this.strength = 100;
		}
	}
}
