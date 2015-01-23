
public class Project {

	public static void main(String[] args) {
		
		//Instantiate Hero
		Hero hero = new Hero("Big Man");
		hero.fight();
		hero.run();
		hero.showAbilities();
		
		//Instantiate Villian
		Villian villian = new Villian("Sly Man");
		villian.run();
		villian.steals();
		villian.showAbilities();
	}

}
