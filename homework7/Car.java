

import java.time.LocalDate;

public class Car {
	private String model;
	private LocalDate dateOfProduction;
	private double engineCapacity;
	private String color;
	private int passengerCapacity;
	private boolean isAirConditioning;

	private Car() {
	}

	public static CarBuilder getCar() {
		return new CarBuilder();
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", dateOfProduction=" + dateOfProduction + ", engineCapacity=" + engineCapacity
				+ ", color=" + color + ", passengerCapacity=" + passengerCapacity + ", isAirConditioning="
				+ isAirConditioning + "]";
	}

	public static class CarBuilder {
		private Car car = new Car();
		private CarBuilder() {
		}

		public CarBuilder addModel(String model) {
			car.model = model;
			return this;
		}
		
		public CarBuilder addDateOFProduction(LocalDate date) {
			car.dateOfProduction = date;
			return this;
		}
		
		public CarBuilder addEngineCapacity(double engine) {
			car.engineCapacity = engine;
			return this;
		}
		
		public CarBuilder addColor(String color) {
			car.color = color;
			return this;
		}
		
		public CarBuilder addPassengerCapacity(int pas) {
			car.passengerCapacity = pas;
			return this;
		}
		
		public CarBuilder setIsAirConditioning(boolean b) {
			car.isAirConditioning = b;
			return this;
		}
		
		public Car build() {
			return this.car;
		}
	}
	
	public static void main(String[] args) {
		CarBuilder test = Car.getCar();
		test.addModel("SomeCar");
		test.addDateOFProduction(LocalDate.of(1914, 7, 28));
		test.addEngineCapacity(2.8);
		test.addColor("Pink");
		test.addPassengerCapacity(5);
		test.setIsAirConditioning(true);

		Car car2 = Car.getCar().
				addModel("Ford").
				addDateOFProduction(LocalDate.of(1999, 10, 10)).
				addEngineCapacity(2.0).
				addColor("blue").
				addPassengerCapacity(4).
				setIsAirConditioning(true).
				build();
		
		System.out.println(test.build());
		System.out.println(car2);
	}
}
