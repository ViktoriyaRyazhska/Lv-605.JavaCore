package homework06oop02._01.payment;

import java.util.Comparator;

public class Employee {
	private String employeeId;
	private static PaymentComparator paymentComparator = new PaymentComparator();

	public static PaymentComparator getPaymentComparator() {
		return paymentComparator;
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
			if (((Payment) p1).calculatePayment() < ((Payment) p2).calculatePayment()) {
				return -1;
			} else if (((Payment) p1).calculatePayment() == ((Payment) p2).calculatePayment()) {
				return 0;
			} else {
				return 1;
			}
		}
	}
}
