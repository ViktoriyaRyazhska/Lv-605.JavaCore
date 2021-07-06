package homework2;

public class GroungVEhicle extends Passengers implements Vehicle{

	public GroungVEhicle(int passengers) {
		super(passengers);
		
	}
	
	public void drive() {
		
		System.out.println("This vehicle can only drive on the ground");
	}

}
