package homework06oop02._02.umlreconstruction;

public class Boat extends WaterVehicle {
	private int volume;

	public Boat(int passengers, int volume) {
		super(passengers);
		this.volume = volume;
	}

	public int getFloors() {
		return volume;
	}

	public void setFloors(int volume) {
		this.volume = volume;
	}

	@Override
	public void isSailing() {

	}

	@Override
	public String toString() {
		return "I am a boat with " + getPassengers() + " passengers.";
	}
}