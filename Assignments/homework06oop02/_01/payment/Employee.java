package homework06oop02._01.payment;

import java.util.Comparator;

public class Employee implements Cloneable {
	private String employeeId;
	private static PaymentComparator payCompare = new PaymentComparator();

	public double calculatePayment() {
		return 0;
	}

	public static PaymentComparator getPayCompare() {
		return payCompare;
	}

	public Employee(String employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append("Employee ID: ").append(employeeId).toString();
	}

	static class PaymentComparator implements Comparator<Employee> {

		@Override
		public int compare(Employee p1, Employee p2) {
			if (p1.calculatePayment() < p2.calculatePayment()) {
				return -1;
			} else if (p1.calculatePayment() == p2.calculatePayment()) {
				return 0;
			} else {
				return 1;
			}
		}
	}
}
