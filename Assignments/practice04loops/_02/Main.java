package practice04loops._02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.Arrays;

//Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
//all employees of a certain department (enter department number in the console);
//arrange workers by the field salary in descending order.

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {

		Employee[] employees = new Employee[5];
		employees[0] = new Employee("John", Departments.LOGISTICS, 9500);
		employees[1] = new Employee("Jane", 10050);
		employees[2] = new Employee("Anny", Departments.MARKETING, 9800);
		employees[3] = new Employee("Harry", 11000);
		employees[4] = new Employee("Joe", Departments.SALES, 8900);

		for (Employee i : employees) {
			if (i.getDept() == null) {
				i.setDept(br);
			}
		}

		System.out.println("Please enter the department name to print out it's employees:");
		Departments dept = Departments.valueOf(br.readLine().toUpperCase());
		System.out.println("People from this department:");
		for (Employee j : employees) {
			if (dept == j.getDept()) {
				System.out.println(j.getName());
			}
		}

		Employee temp;
		for (int i = 0; i < employees.length - 1; i++) {
			for (int j = i + 1; j < employees.length; j++) {
				if (employees[i].getSalary() < employees[j].getSalary()) {
					temp = employees[j];
					employees[j] = employees[i];
					employees[i] = temp;
				}
			}
		}
		System.out.println("\nEmployees sorted by salary in dedcending order:");
		for (Employee i : employees) {
			System.out.println(i);
		}

	}
}
