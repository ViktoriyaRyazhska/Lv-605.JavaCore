package homework2;

public class Liner extends WaterVehicle{
	
	private int floor;

	public Liner(int passengers, int floor) {
		super(passengers);
		this.floor = floor;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	

}
