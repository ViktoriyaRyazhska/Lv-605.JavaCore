package lesson7.homework.task2;

public class Car extends GroundVehicle {
	private String model;

	public Car(int passengers, String model) {
		super(passengers);
		this.model = model;
	}

	@Override
	public void drive() {
		System.out.println("The car starts to drive");
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
