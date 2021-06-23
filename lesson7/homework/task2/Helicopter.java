package lesson7.homework.task2;

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
		System.out.println("The helicopter starts to fly");
	}

	@Override
	public void land() {
		System.out.println("The helicopter starts to land");
	}

	
	
	
}
