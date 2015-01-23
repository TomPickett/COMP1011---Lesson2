
public class Project {

	public static void main(String[] args) {
		
		//Instantiate Hero
		StrongMan strongman = new StrongMan("Big Man");
		strongman.fight();
		strongman.run();
		strongman.showAbilities();
		
		//Instantiate Villain
		Villian villian = new Villian("Sly Man");
		villian.run();
		villian.steals();
		villian.showAbilities();
		
		//Instantiate Vigilante
		Vigilate vigilate = new Vigilate("Ms. Savage");
		vigilate.run();
		vigilate.steals();
		vigilate.dealsJustice();
		vigilate.showAbilities();
	}

}
