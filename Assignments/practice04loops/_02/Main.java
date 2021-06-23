package practice04loops._02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.Arrays;

//Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
//all employees of a certain department (enter department number in the console);
//arrange workers by the field salary in descending order.

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee[] employees = new Employee[5];
		employees[0] = new Employee("John", 1, 9500);
		employees[1] = new Employee("Jane", 2, 10050);
		employees[2] = new Employee("Anny", 1, 9800);
		employees[3] = new Employee("Harry", 1, 11000);
		employees[4] = new Employee("Joe", 2, 8900);

		System.out.println("Please enter the department number to print out it's employees:");
		int deptNum = Integer.parseInt(br.readLine());
		if (deptNum <= 2 && deptNum >= 1) {
			System.out.println("People from this department:");
			for (Employee i : employees) {
				if (i.getDeptNum() == deptNum) {
					System.out.println(i.getName());
				}
			}
		} else {
			System.out.println("There is no such department number.");
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

//		Employees[1].setDeptNum(br.readLine());

//		for (Employee i : Employees) {
//			Employees[i].setDeptNum(br.readLine());
//		}
	}
}
