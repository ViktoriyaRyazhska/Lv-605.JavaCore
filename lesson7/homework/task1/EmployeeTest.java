package lesson7.homework.task1;

import java.util.Arrays;

import lesson7.homework.task1.Employee.WageComparator;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] employees = {
				new SalariedEmployee("12", "Vasya", 3000, 10, 13331),
				new SalariedEmployee("16", "Mykola", 4000, 8, 46578),
				new ContractEmployee("19", "Taras", 10000),
				new ContractEmployee("25", "Roman", 8000)
		};
		
		Arrays.sort(employees, Employee.getWageComparator());
		
		for(Employee employee: employees) {
			System.out.println(employee);
			System.out.println(((Payment)employee).calculatePay());
		}
	}

}
