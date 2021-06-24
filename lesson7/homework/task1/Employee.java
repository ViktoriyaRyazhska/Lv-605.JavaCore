package lesson7.homework.task1;

import java.util.Comparator;

public abstract class Employee {
	private String employeeID;
	private String name;
	static WageComparator wageComparator = new WageComparator();
	
	public Employee(String employeeID, String name) {
		this.employeeID = employeeID;
		this.name = name;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public String getName() {
		return name;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return " [employeeID=" + employeeID + ", name=" + name + "]";
	}
	
	
	public static WageComparator getWageComparator() {
		return wageComparator;
	}

	static class WageComparator implements Comparator{
		@Override
		public int compare(Object o1, Object o2) {
			return (((Payment)o1).calculatePay()-((Payment)o2).calculatePay())*-1;	
		}
	}
	
}

