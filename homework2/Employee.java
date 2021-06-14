package homework2;

public class Employee {
	private String name;
	private double rate;
	private double hours;
	private static double totalSum = 0.0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public Employee() {
	}

	public Employee(String name, double rate) {
		this.name = name;
		this.rate = rate;
		Employee.totalSum += this.getSalary();
	}

	public Employee(String name, double rate, double hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		Employee.totalSum += this.getSalary();
	}

	public double getSalary() {
		return rate * hours;
	}

	public String toString() {
		return ("Employees name is: " + this.name + "\nSalary is: " + this.getSalary() + "\nRate: " + this.rate
				+ "\nHours: " + this.hours + "\n");
	}

	public void changeRate(double rate) {
		totalSum -= this.rate * hours;
		this.setRate(rate);
		totalSum += this.rate * hours;
		System.out.println(this.getName() + " new salary is: " + rate * hours + "\n");
	}

	public void getBonuses() {
		System.out.println(this.name + " bonuses (10% of salary) are: " + this.rate * this.hours * 0.1);
	}

	public static void main(String[] args) {
		Employee vasya = new Employee("Vasya", 15.0, 20.0);
		System.out.println(vasya.toString());
		Employee john = new Employee("John", 28.0, 14.0);
		System.out.println(john.toString());
		Employee andrew = new Employee("Andrew", 12.5, 40.0);
		System.out.println(andrew.toString());
		System.out.println("TotalSum is: " + totalSum);
		john.changeRate(14);
		System.out.println(john.toString());
		System.out.println("TotalSum is: " + totalSum);
		vasya.getBonuses();
		andrew.changeRate(10);
		System.out.println("TotalSum is: " + totalSum);
	}
}


