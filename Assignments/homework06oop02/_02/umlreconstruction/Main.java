package homework06oop02._02.umlreconstruction;

public class Main {

	public static void main(String[] args) {
		Passengers[] passengers = new Passengers[7];
		passengers[0] = new Boat(2, 4);
		passengers[1] = new Bus(16, "Clevelend - Oklahoma");
		passengers[2] = new Car(3, "Toyota Corolla");
		passengers[3] = new Helicopter(5, 3180, 5300);
		passengers[4] = new Liner(120, 3);
		passengers[5] = new Motorcycle(1, 260);
		passengers[6] = new Plane(4, 410);

		for (Passengers psngrs : passengers) {
			System.out.println(psngrs);
		}
	}
}
