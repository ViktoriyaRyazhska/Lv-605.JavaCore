package lesson6.practTasks.task1;

public class Truck extends Car {
	public Truck(String model, int maxSpeed, int yearOfManufacture) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.yearOfManufacture = yearOfManufacture;
	}
	
	@Override
	public void run() {
		System.out.println("Truck run");

	}
	@Override
	public void stop() {
		System.out.println("Truck stop");

	}

	@Override
	public String toString() {
		return "Truck [model=" + model + ", maxSpeed=" + maxSpeed + ", yearOfManufacture=" + yearOfManufacture + "]";
	}

	

}
