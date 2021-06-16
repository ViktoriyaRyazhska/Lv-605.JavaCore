package lesson5.practTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeTest {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee[] emp = {
				new Employee("Vasya", 1, 5000),
				new Employee("Igor", 2, 4000),
				new Employee("Mykola", 2, 3000),
				new Employee("Dima", 1, 9000),
				new Employee("Roman", 3, 10000)
		};
		
		System.out.print("Enter department number: "); //викликаю методи(див нище)
		getAllWorkersFromDepartment(emp, Integer.parseInt(br.readLine()));
		
		System.out.println("Sorted Employee array by salary:");
		getSortedEmpArray(emp);
		
	}
	//приймаю масив типу Employee і номер департаменту
	public static void getAllWorkersFromDepartment(Employee[] emp, int depNum) {
		System.out.println("Employees at this department: ");
		for(Employee e: emp) { //перебираю всі і виводжу ті які співпадають по номеру департаменту
			if(e.getDepartmentNumber()==depNum) System.out.println(e.toString());
		}
	}
	//приймаю масив типу Employee
	public static void getSortedEmpArray(Employee[] emp) {
		Employee temp; //буферна змінна для перестановки
		for(int i = 0; i < emp.length; i++) { //звичаний алгоритм сортировки бульбашкою (див презентацію)
			for(int j = i+1; j < emp.length; j++) {
				if(emp[i].getSalary()<emp[j].getSalary()) {
					temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}
		}
		//виводжу посортований масив
		for(Employee e: emp) {
			System.out.println(e.toString());
		}
	}
}
