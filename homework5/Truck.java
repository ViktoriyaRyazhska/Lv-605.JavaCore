package homework5;

public class Truck extends Car {
	
	public Truck() {
	}

	public Truck(String model) {
		this.model = model;
	}

	public Truck(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

	public Truck(String model, int maxSpeed, int yearOfManufacture) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.yearOfManufacture = yearOfManufacture;
	}

	@Override
	protected void run() {
		System.out.println("Truck run() method.");

	}

	@Override
	protected void stop() {
		System.out.println("Truck stop method.");

	}

}
