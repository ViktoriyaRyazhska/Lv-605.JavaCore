package homework06oop02._01.paymentint;

import java.util.Comparator;

public class Employee {
	private String employeeId;
	private static PaymentComparator payCompare = new PaymentComparator();

	public Employee(String employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append("Employee ID: ").append(employeeId).toString();
	}

	private static class PaymentComparator implements Comparator<Payment> {

		@Override
		public int compare(Payment p1, Payment p2) {
			return (p1.calculatePayment() - p2.calculatePayment());
		}
	}

	public static PaymentComparator getPayCompare() {
		return payCompare;
	}
}
