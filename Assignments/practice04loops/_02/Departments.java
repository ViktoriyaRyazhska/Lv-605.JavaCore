package practice04loops._02;

public enum Departments {
//	LOGISTICS, MARKETING, SALES;
	LOGISTICS("Logistics"), MARKETING("Marketing"), SALES("Sales");

	private String deptName;

	private Departments() {}
	
	private Departments(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}
	
}
