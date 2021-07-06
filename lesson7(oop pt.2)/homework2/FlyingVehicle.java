package homework2;

public class FlyingVehicle extends Passengers implements Vehicle{

	public FlyingVehicle(int passengers) {
		super(passengers);
		
	}
	
	public void fly() {
		
		System.out.println("This is a flying vehicle");
	}
	
	public void land() {
		System.out.println("This vehicle lands from sky on the land");
	}

}
