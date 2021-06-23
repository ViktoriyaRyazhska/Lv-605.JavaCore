package homework04loops._04.car;

public class Car {
	private CarType type;
	private int yearOfProduction;
	private float engineCapacity;

	public CarType getType() {
		return type;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public float getEngineCapacity() {
		return engineCapacity;
	}

	public Car(CarType type, int yearOfProduction, float engineCapacity) {
		this.type = type;
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;
	}
	
	@Override
	public String toString() {
		return "Car [type=" + type + ", yearOfProduction=" + yearOfProduction + ", engineCapacity=" + engineCapacity
				+ "]";
	}
}