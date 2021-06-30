package homework06oop02._01.payment;

import java.util.Arrays;

//Create Payment interface with the method calculatePay(), the base class Employee with a string variable employeeId.
//Create two classes SalariedEmployee and ContractEmployee, which implement interface and are inherited from the base class. 
//Describe hourly paid workers in the relevant classes (one of the children), and fixed paid workers (second child). 
//Describe the string variable socialSecurityNumber in the class SalariedEmployee .
//Include a description of federalTaxIdNumber in the class of ContractEmployee.

//The calculation formula for the “time-worker” is: the average monthly
//salary = hourly rate * number of hours worked
//For employees with a fixed payment the formula is: the average monthly salary = fixed monthly payment
//Create an array of employees and add the employees with different form of payment.
//Arrange the entire sequence of workers descending the average monthly wage.
//Output the employee ID, name, and the average monthly wage for all elements of the list.

public class Main {

	public static void main(String[] args) {
		Employee[] employees = new Employee[5];
		employees[0] = new SalariedEmployee("g346hyk", 2138, 942136987);
		employees[1] = new ContractEmployee("785btui", 20, 40, 359462184);
		employees[2] = new SalariedEmployee("390f5ka", 3500, 521698732);
		employees[3] = new ContractEmployee("rn4m9j1", 26, 31, 541369854);
		employees[4] = new SalariedEmployee("59rt1aq", 1550, 49826570);

		System.out.println("UNSORTED");
		for (Employee e : employees) {
			System.out.println(e);
		}

		Arrays.sort(employees, Employee.getPaymentComparator());
		System.out.println();

		System.out.println("SORTED BY PAYMENT AMOUNT");
		for (Employee e : employees) {
			System.out.println(e);
		}
	}
}
