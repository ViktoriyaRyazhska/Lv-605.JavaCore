package homework6;

import java.util.Arrays;

public class EmployeeTest {
	
	static void output(Employee[] employees) {
		for(Employee e : employees) {
			System.out.println("employee ID: " + e.getEmployeeId() + 
					" name: " + e.getName() + " wage: " + ((Payment) e).calculatePay());
		}
	}

	public static void main(String[] args) {
		Employee[] employees = new Employee[4];
		
		employees[0] = new SalariedEmployee("Vasya", "1", 150, 160, "16515");
		employees[1] = new SalariedEmployee("Petya", "2", 95, 120, "68421");
		employees[2] = new ContractEmployee("Olya", "3", 58000, 861651);
		employees[3] = new ContractEmployee("Marta", "4", 45000, 516479);

		Arrays.sort(employees);
		EmployeeTest.output(employees);
		System.out.println("----------------Sort by name-----------------");
		Arrays.sort(employees, Employee.getNameComparator());
		EmployeeTest.output(employees);
		System.out.println("----------------Sort by ID-------------------");
		Arrays.sort(employees, Employee.getIdComparator());
		EmployeeTest.output(employees);
	}
	
}