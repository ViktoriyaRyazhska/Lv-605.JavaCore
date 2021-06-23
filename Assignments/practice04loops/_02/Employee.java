package practice04loops._02;

//import java.io.BufferedReader;

public class Employee {
	private String name;
	private int deptNum;
	private double salary;

	public Employee(String name, int deptNum, double salary) {
		this.name = name;
		this.deptNum = deptNum;
		this.salary = salary;
	}

//	public Employee(String name, double salary) {
//		this.name = name;
//		this.salary = salary;
//	}

	public String getName() {
		return name;
	}
	
	public int getDeptNum() {
		return deptNum;
	}

//	public void setDeptNum(BufferedReader br) throws Exception {
//		if (deptNum == null) {
//			System.out.println("Enter the name of deparment this person belongs to: LOGISTICS, MARKETING, or SALES");
//			this.deptNum = Departments.valueOf(br.readLine());
//		}
//	}

	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		return name + "\t" + deptNum + "\t" + salary;
	}


}
