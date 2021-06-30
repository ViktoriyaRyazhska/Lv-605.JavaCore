package homework06oop02._02.umlreconstruction;

public class Motorcycle extends GroundVehicle {
	private int maxSpeed;

	public Motorcycle(int passengers, int maxSpeed) {
		super(passengers);
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void drive() {

	}

	@Override
	public String toString() {
		return "I am a motorcycle with " + getPassengers() + " passengers.";
	}
}