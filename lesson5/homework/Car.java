package lesson5.homework;

public class Car {
	private String type;
	private int productionYear;
	private int engineCapacity;
	
	public Car(String type, int productionYear, int engineCapacity) {
		this.type = type;
		this.productionYear = productionYear;
		this.engineCapacity = engineCapacity;
	}
	

	public String getType() {
		return type;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", productionYear=" + productionYear + ", engineCapacity=" + engineCapacity + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + engineCapacity;
		result = prime * result + productionYear;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (engineCapacity != other.engineCapacity)
			return false;
		if (productionYear != other.productionYear)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
}
