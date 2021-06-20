package practice02classes;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Johnny");
		e1.setRate(2);
		e1.setHours(44);

		Employee e2 = new Employee("Coraline", 7);
		e2.setHours(35);

		Employee e3 = new Employee("Mariloyster", 6, 41);

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

		Employee.getTotalSum();

		e1.changeRate(7);

		Employee.getTotalSum();
	}
}
