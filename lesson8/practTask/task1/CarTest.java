package lesson8.practTask.task1;

import java.time.LocalDate;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car.CarBuilder().addColor("Black").addDateOfProduction(LocalDate.of(1990, 10, 12))
				.addEngineCapacity(4000).addModel("BMW").addPassengerCapacity(4).setIsAirConditioning(true).build();

		System.out.println(myCar);
	}

}
