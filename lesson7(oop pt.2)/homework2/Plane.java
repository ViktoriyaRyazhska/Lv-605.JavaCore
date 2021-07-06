package homework2;

public class Plane extends FlyingVehicle {
	
	private int maxDistance;

	public int getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}

	public Plane(int passengers, int maxDistance) {
		super(passengers);
		this.maxDistance = maxDistance;
	}

	
}
