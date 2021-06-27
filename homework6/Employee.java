package homework6;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private String employeeId;
	private String name;
	private static NameComparator nameComparator = new NameComparator();
	private static idComparator idComparator = new idComparator();

	public Employee() {
	};

	public Employee(String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static NameComparator getNameComparator() {
		return nameComparator;
	}

	public static idComparator getIdComparator() {
		return idComparator;
	}

	@Override
	public String toString() {
		return "Employee [employeeId= " + employeeId + ", name= " + name + "]";
	}

	@Override
	public int compareTo(Employee e) {
		return ((Payment) e).calculatePay() - ((Payment) this).calculatePay();
	}
	
	static class NameComparator implements Comparator<Employee> {
		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}

	}
	
	static class idComparator implements Comparator<Employee> {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getEmployeeId().compareTo(o2.getEmployeeId());
		}
	}

}
