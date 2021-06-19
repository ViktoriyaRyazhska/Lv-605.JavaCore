package lesson6.homework.task2;

public class Developer extends Employee {
	String position;
	public Developer(String name, int age, double salary, String position) {
		super(name, age, salary);
		this.position = position;
	}
	@Override
	public String report() {
		return "Name: " + super.getName() + ", Age: " + super.getAge() + ", Position: " + position + ", Salary: " + super.getSalary();
	} 
}
