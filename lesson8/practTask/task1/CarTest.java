package lesson8.practTask.task1;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car.CarBuilder().addColor("Black").addDateOfProduction(null).addEngineCapacity(4000)
				.addModel("BMW").addPassengerCapacity(4).setIsAirConditioning(true).build();
		System.out.println(myCar);
	}

}
