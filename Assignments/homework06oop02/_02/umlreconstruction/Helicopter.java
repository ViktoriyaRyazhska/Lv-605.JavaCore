package homework06oop02._02.umlreconstruction;

public class Helicopter extends FlyingVehicle {
	private int weight;
	private int maxHeight;

	public Helicopter(int passengers, int weight, int maxHeight) {
		super(passengers);
		this.weight = weight;
		this.maxHeight = maxHeight;
	}

	@Override
	public void fly() {

	}

	@Override
	public void land() {

	}

	@Override
	public String toString() {
		return "I am a helicopter with " + getPassengers() + " passengers.";
	}
}