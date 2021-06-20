package homework5;

public class CarTest {

	public static void main(String[] args) {
		Car[] cars = new Car[8];
		cars[0] = new Truck("Ford F-150", 190,  2017);
		cars[1] = new Truck("Ford Ranger", 250, 2019);
		cars[2] = new Truck("Nissan Titan", 220, 2018);
		cars[3] = new Truck("Ram 1500", 240);
		cars[4] = new Truck("Toyota Tundra");
		cars[5] = new Sedan("Audi A8", 290, 2020);
		cars[6] = new Sedan("Porsche Taycan", 280);
		cars[7] = new Sedan("Cadillac CT6-V");
		for(Car c: cars) System.out.println(c.toString());
		cars[2].run();
		cars[2].stop();
		cars[6].run();
		cars[6].stop();
	}

}
