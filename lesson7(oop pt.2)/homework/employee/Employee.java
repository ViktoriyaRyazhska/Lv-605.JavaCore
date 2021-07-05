package homework1;

import java.util.Comparator;

public class Employee {

	int employyeId;
	
	private static SalaryComparator salaryComparator = new SalaryComparator();
	
	
	public int getEmployyeId() {
		return employyeId;
	}

	public void setEmployyeId(int employyeId) {
		this.employyeId = employyeId;
	}

	public Employee(int employyeId) {
		this.employyeId = employyeId;
	}

	
	public static SalaryComparator getSalaryComparator() {
		
		return salaryComparator;
	}
		
	
	
	
	@Override
	public String toString() {
		return "Employee [employyeId=" + employyeId + "]";
	}

	
	
	static class SalaryComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return (((Payment)o2).calculatePay()-((Payment)o1).calculatePay());
		}
		
		
	}



	

	
}
