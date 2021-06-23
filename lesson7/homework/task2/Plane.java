package lesson7.homework.task2;

public class Plane extends FlyingVehicle {
	private int maxDistance;

	public Plane(int passengers, int maxDistance) {
		super(passengers);
		this.maxDistance = maxDistance;
	}

	@Override
	public void fly() {
		System.out.println("The plane starts to fly");
	}

	@Override
	public void land() {
		System.out.println("The plane starts to land");
	}

	public int getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(int maxDistance) {
		this.maxDistance = maxDistance;
	}
	
	
}
