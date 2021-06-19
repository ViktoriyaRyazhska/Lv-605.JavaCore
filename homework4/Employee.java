package homework4;

import java.io.*;

public class Employee {
	private String name;
	private int depNumber;
	private int salary;

	public Employee() {
	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(String name, int depNumber) {
		this.name = name;
		this.depNumber = depNumber;
	}

	public Employee(String name, int depNumber, int salary) {
		this.name = name;
		this.depNumber = depNumber;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepNumber() {
		return depNumber;
	}

	public void setDepNumber(int depNumber) {
		this.depNumber = depNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void input(BufferedReader br, int i) {
		System.out.println("Please enter employee " + (i + 1) + " name.");
		try {
			this.name = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Please enter employee " + (i + 1) + " department number.");
		try {
			this.depNumber = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Please enter employee " + (i + 1) + " salary.");
		try {
			this.salary = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void EmployeesOfDep(int dep, Employee[] empArray) {
		System.out.print("All employees of department " + dep + " are: ");
		for (Employee e : empArray) {
			if (e.depNumber == dep) {
				System.out.print(e.name + " ");
			}
		}
		System.out.println();
	}

	public static void SortBySalary(Employee[] empArray) {
		Employee tmp;
		for (int i = 0; i < empArray.length; i++) {
			for (int j = i + 1; j < empArray.length; j++) {
				if(empArray[i].getSalary() < empArray[j].getSalary()) {
					tmp = empArray[i];
					empArray[i] = empArray[j];
					empArray[j] = tmp;
				}
			}
		}
		for(Employee e : empArray) {
			System.out.print(e.name + " " + e.salary);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee[] empArray = new Employee[5];
		int depNumber = 0;
		for (int i = 0; i < empArray.length; i++) {
			empArray[i] = new Employee();
		}
		for (int i = 0; i < empArray.length; i++) {
			empArray[i].input(br, i);
		}
		System.out.println("Please enter department number: ");
		try {
			depNumber = Integer.parseInt(br.readLine());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		EmployeesOfDep(depNumber, empArray);
		SortBySalary(empArray);
		
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
