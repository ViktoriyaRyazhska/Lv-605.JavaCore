package homework2;

public class WaterVehicle extends Passengers implements Vehicle {
	
	public WaterVehicle(int passengers) {
		super(passengers);
		
	}

	public void isSailing() {
		
		System.out.println("This is a water vehicle");
	}

}
