package lesson8.practTask.task1;

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



	static class CarBuilder{
		private Car newCar;
		
		public CarBuilder() {
			newCar = new Car();
		};
		
		public CarBuilder addModel(String model) {
			newCar.model = model;
			return this;
		}
		public CarBuilder addDateOfProduction(LocalDate date) {
			newCar.dateOfProduction = date;
			return this;
		}
		public CarBuilder addEngineCapacity(double capacity) {
			newCar.engineCapacity = capacity;
			return this;
		}
		public CarBuilder addColor(String color) {
			newCar.color = color;
			return this;
		}
		public CarBuilder addPassengerCapacity(int capacity) {
			newCar.passengerCapacity = capacity;
			return this;
		}
		public CarBuilder setIsAirConditioning(boolean condition) {
			newCar.isAirConditioning = condition;
			return this;
		}
		
		public Car build() {
			return newCar;
		}
		
	}
}
