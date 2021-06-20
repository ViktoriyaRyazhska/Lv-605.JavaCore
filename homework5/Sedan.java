package homework5;

public class Sedan extends Car {
	
	public Sedan() {
	}

	public Sedan(String model) {
		this.model = model;
	}

	public Sedan(String model, int maxSpeed) {
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

	public Sedan(String model, int maxSpeed, int yearOfManufacture) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.yearOfManufacture = yearOfManufacture;
	}

	@Override
	protected void run() {
		System.out.println("Sedan run() method.");
		
	}

	@Override
	protected void stop() {
		System.out.println("Sedan stop() method.");
		
	}

}
