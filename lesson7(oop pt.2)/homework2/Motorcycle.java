package homework2;

public class Motorcycle extends GroungVEhicle{
	
	private int maxSpeed;

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Motorcycle(int passengers, int maxSpeed) {
		super(passengers);
		this.maxSpeed = maxSpeed;
	}
	
	

}
