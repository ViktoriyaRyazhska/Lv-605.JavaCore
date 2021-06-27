package homework05oop01._02.employee;

public class Developer extends Employee {
	private Positions position;

	public Positions getPosition() {
		return position;
	}

	public Developer(String name, int age, Positions position, double salary) {
		super(name, age, salary);
		this.position = position;
	}

	public void report() {
		System.out.printf("Name: %s; Age: %d; Position: %s; Salary: UAH %.2f.", getName(), getAge(), getPosition(),
				getSalary());

	}
}
