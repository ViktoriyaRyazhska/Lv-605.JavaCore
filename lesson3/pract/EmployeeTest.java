package lesson3.pract;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee firstEmp = new Employee("Roman", 15, 5000);
		Employee secondEmp = new Employee("Taras", 10, 4000);
		Employee thirdEmp = new Employee("Vasya", 15, 5000);
		System.out.println(firstEmp);
		System.out.println(secondEmp);
		System.out.println(thirdEmp);
	}
}
