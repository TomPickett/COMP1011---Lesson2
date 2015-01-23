
public class Villian extends Hero {

	//Constructor*****************************
	public Villian(String name) {
		super(name);	
	}
	
	//Public Methods**************************
	public void steals() {
		System.out.println(this.name + " is stealing");
	}
	
	
	public void kills() {
		System.out.println(this.name + " is going around killing");
	}

}
