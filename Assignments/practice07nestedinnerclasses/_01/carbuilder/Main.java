package practice07nestedinnerclasses._01.carbuilder;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Car.CarBuilder testCar = Car.getCar().addModel("Aston Martin").addDateOfProduction(LocalDate.of(1969, 04, 13))
				.addColor("cyan").addPassengerCapacity(2);
		System.out.println(testCar);
	}
}
