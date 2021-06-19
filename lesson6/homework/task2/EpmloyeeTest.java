package lesson6.homework.task2;

public class EpmloyeeTest {

	public static void main(String[] args) {
		Employee[] emp = {
				new Employee("Vasya", 25, 5000),
				new Employee("Roman", 30, 9000),
				new Developer("Misha", 24, 10000, "Dev"),
				new Developer("Misha", 24, 10000, "Test")
		};
		for(Employee e:emp) {
			System.out.println(e.report());
		}
	}

}
