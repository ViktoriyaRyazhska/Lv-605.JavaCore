package employee;

public class Employee {

	private String name;
	private int ages;
	private double salary;
	
	
	public Employee(String name, int ages, double salary) {
		this.name = name;
		this.ages = ages;
		this.salary = salary;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAges() {
		return ages;
	}



	public void setAges(int ages) {
		this.ages = ages;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String report() {
		
	return "Name -" + name + "\n" + "Age - " + '\n' + "Salary - " + salary;
	}
}
