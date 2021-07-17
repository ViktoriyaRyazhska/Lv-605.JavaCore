package practice07nestedinnerclasses._01.carbuilder;

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
		private Car car;

		private CarBuilder() {
			car = new Car();
		}

		public CarBuilder addModel(String model) {
			car.model = model;
			return this;
		}

		public CarBuilder addDateOfProduction(LocalDate dateOfProduction) {
			car.dateOfProduction = dateOfProduction;
			return this;
		}

		public CarBuilder addEgineCapacity(double engineCapacity) {
			car.engineCapacity = engineCapacity;
			return this;
		}

		public CarBuilder addColor(String color) {
			car.color = color;
			return this;
		}

		public CarBuilder addPassengerCapacity(int passengerCapacity) {
			car.passengerCapacity = passengerCapacity;
			return this;
		}

		public CarBuilder addIsAirConditioning(boolean isAirConditioning) {
			car.isAirConditioning = isAirConditioning;
			return this;
		}

		public Car buildCar() {
			return car;
		}
	}
}
