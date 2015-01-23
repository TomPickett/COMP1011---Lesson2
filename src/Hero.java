public class Hero extends Entity{
	
	//Private Property************************
	protected int strength;
	protected int speed;
	private int health;
	
	//Public Properties***********************
	public String name;
	
	//Getters*********************************
	public int getStrength() {
		return strength;
	}
	
	public int getSpeed() {
		return speed;
	}

	public int getHealth() {
		return health;
	}

	//Constructor*****************************
	public Hero(String name) {
		this.name = name;
		
		generateAbilities();
	}
	
	
	//Public Methods*************************
	public void showAbilities() {
		System.out.println("***************************");
		System.out.println("Strength: " + this.strength);
		System.out.println("Speed: " + this.speed);
		System.out.println("Health: " + this.health);
		System.out.println("***************************");
	}
	
	public void fight() {
		System.out.println(this.name + " is fighting");		
	}
	
	public void run() {
		System.out.println(this.name + " is running");
	}	
	
	//Private Methods*************************
	private void generateAbilities() {
		this.strength = (int)(Math.random() * 100 + 1);
		this.speed = (int)(Math.random() * 100 + 1);
		this.health = (int)(Math.random() * 100 + 1);
	}
	
}
