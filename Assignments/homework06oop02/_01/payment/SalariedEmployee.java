package homework06oop02._01.payment;

public class SalariedEmployee extends Employee implements Payment {
	private double salary;
	private int socialSecurityNumber;

	public SalariedEmployee(String employeeId, double salary, int socialId) {
		super(employeeId);
		this.salary = salary;
		socialSecurityNumber = socialId;
	}

	public double calculatePayment() {
		return salary;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append("SalariedEmployee\nSalary: ").append(salary).append("; social security number: ")
				.append(socialSecurityNumber).append("; payment: ").append(calculatePayment()).append("; ")
				.append(super.toString()).append(".").toString();
	}
}
