package practice05oop01._01;

public class Car {
	private String model;
	private double maxSpeed;
	private int yearOfManufacture;
	
	public Car(String model, double maxSpeed, int yearOfManufacture) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.yearOfManufacture = yearOfManufacture;
	}

	public void run() {
		System.out.println(yearOfManufacture + " " + model + " is running at " + maxSpeed
				+ " maximum speed.");
	}
	
	public void stop() {
		System.out.println(model + " has crashed :(");
	}
}
