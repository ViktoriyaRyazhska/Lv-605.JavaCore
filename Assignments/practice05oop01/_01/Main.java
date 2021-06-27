package practice05oop01._01;

//Create abstract class Car with model, maxSpeed and yearOfManufacture properties and run() and stop() methods.
//Develop classes Truck and Sedan which extend class Car.
//In main method create array of Car’s objects. Add to this array some trucks and sedans and print info about it
public class Main {

	public static void main(String[] args) {
		Car[] cars = { new Truck("Freightliner M2", 80, 2002), new Car("Mazda Miata", 115, 1989),
				new Truck("Mack Titan", 65, 1995), new Car("Lexus GS 450h F Sport", 155, 2012) };
		for (Car c : cars) {
			c.run();
			c.stop();
		}
	}
}
