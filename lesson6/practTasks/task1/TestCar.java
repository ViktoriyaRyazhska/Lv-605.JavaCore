package lesson6.practTasks.task1;

public class TestCar {
	public static void main(String[] args) {
		Car[] cars = {
			new Truck("aaa", 100, 2002),
			new Truck("bbb", 120, 2005),
			new Sedan("ccc", 90, 2003),
			new Sedan("ddd", 130, 2012)
		};
		for(Car c:cars) { 
			System.out.println(c);
			c.run();
			c.stop();
		}
	}
}
