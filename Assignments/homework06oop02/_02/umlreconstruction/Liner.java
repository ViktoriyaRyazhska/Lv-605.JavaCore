package homework06oop02._02.umlreconstruction;

public class Liner extends WaterVehicle {
	private int floors;

	public Liner(int passengers, int floors) {
		super(passengers);
		this.floors = floors;
	}

	@Override
	public void isSailing() {

	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	@Override
	public String toString() {
		return "I am a liner with " + getPassengers() + " passengers.";
	}
}