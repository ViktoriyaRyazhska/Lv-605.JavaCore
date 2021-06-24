package practice04loops._02;

import java.io.BufferedReader;

public class Employee {
	private String name;
	private Departments dept;
	private double salary;
	private int id = 0;
	private static int counter = 1;

	public Employee(String name, Departments deptNum, double salary) {
		this.name = name;
		this.dept = deptNum;
		this.salary = salary;
		id = counter;
		counter++;
	}

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		id = counter;
		counter++;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Departments getDept() {
		return dept;
	}

	public void setDept(BufferedReader deptNum) throws Exception{
		System.out.println("Enter the name of deparment of the person #" + id + " (" + name + "): LOGISTICS, MARKETING, or SALES");
		this.dept = Departments.valueOf(deptNum.readLine().toUpperCase());
	}

	public double getSalary() {
		return salary;
	}

	public String toString() {
		return name + "\t" + dept + "\t" + salary;
	}

}
