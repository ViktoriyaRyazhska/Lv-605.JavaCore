package homework05oop01._02.employee;

public class Employee {
	private String name;
	private int age;
	private double salary;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public void report() {
		System.out.printf("Name: %s; Age: %d; Salary: UAH %.2f.", name, age, salary);

	}
}
