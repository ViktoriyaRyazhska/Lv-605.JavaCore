package homework1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Employee[] employees = {

				new SalariedEmployee(5423, 548534, 160, 250, "Ihor", "Java Middle Developer"),
				new SalariedEmployee(4578, 547845, 140, 400, "Halyna", "Java Middle Developer"),
				new SalariedEmployee(3654, 543485, 160, 300, "Ostap", "Java Middle Developer"),
				new ContractEmployee(5555, 757382, 35000, "Olha", "Java Junior Developer"),
				new ContractEmployee(5551, 141534, 40000, "Vasyl", "Java Junior Developer"),
				new ContractEmployee(5552, 143531, 15000, "Sophia", "Java Trainee")
						
		};
		
		Arrays.sort(employees, Employee.getSalaryComparator());
		
		
		for (Employee employee: employees) {
			
			System.out.println(employee);
			System.out.println(((Payment) employee).calculatePay());
		}
		}

	}


