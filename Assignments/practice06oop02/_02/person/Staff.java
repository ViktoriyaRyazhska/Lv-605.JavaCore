package practice06oop02._02.person;

public abstract class Staff extends Person {
	private double salary;

	public Staff(String name, double salary) {
		super(name);
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}

	abstract void salary();

}
