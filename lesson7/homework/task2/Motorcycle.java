package lesson7.homework.task2;

public class Motorcycle extends GroundVehicle {
	private int maxSpeed;

	public Motorcycle(int passengers, int maxSpeed) {
		super(passengers);
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void drive() {
		System.out.println("The motorcyle starts to drive");
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
}
