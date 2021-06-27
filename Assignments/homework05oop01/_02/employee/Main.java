package homework05oop01._02.employee;

//Suppose we have a class Employee
//Create a Developer class that extends the Employee class.
//Creates a String field and a constructor to initialize all fields in the Developer class.
//Also in the Developer class, override the method report()
//so that it returns a string with information about the developer, for example:
//Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
//If necessary, modify the employee's class so that it meets the principles of encapsulation and inheritance.
//Create an instance of the Employee and Developer class and print in the console information about them using report() method. 

public class Main {

	public static void main(String[] args) {
		Employee[] employees = new Employee[4];
		employees[0] = new Employee("Vasyl", 31, 17400);
		employees[1] = new Developer("Danylo", 36, Positions.JUNIOR, 24679);
		employees[2] = new Employee("Olena", 29, 14850);
		employees[3] = new Developer("Jane", 33, Positions.valueOf("MIDDLE"), 35760);

		for (Employee e : employees) {
			e.report();
			System.out.println();
		}

	}
}
