package homework2;

public class Car extends GroungVEhicle{
	
	private String model;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Car(int passengers, String model) {
		super(passengers);
		this.model = model;
	}
	
	
	

}
