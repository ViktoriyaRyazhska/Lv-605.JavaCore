package homework06oop02._02.umlreconstruction;

public abstract class FlyingVehicle extends Passengers {

	public FlyingVehicle(int passengers) {
		super(passengers);
	}

	public abstract void fly();

	public abstract void land();
}
