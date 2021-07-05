package employee;

public class Developer extends Employee {
	
	String position;
	
	public Developer(String name, String position, int age, double salary) {
		super (name, age, salary);
		this.position = position;
	}

	@Override
	public String report() {
		
		return "Name - " + super.getName() + "\n" +"Age - " +super.getAges() + "\n" + "Position  - " + position + "Salary - " + super.getSalary();
	}

	


	
	
}