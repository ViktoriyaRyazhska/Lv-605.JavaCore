package lesson5.practTasks;

public class Employee {
	private String name;
	private int departmentNumber;
	private int salary;
	
	public Employee(String name, int department_number, int salary) {
		this.name = name;
		this.departmentNumber = department_number;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int department_number) {
		this.departmentNumber = department_number;
	}

	public int getSalary() {
		return salary;
	}
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department_number=" + departmentNumber + ", salary=" + salary + "]";
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
