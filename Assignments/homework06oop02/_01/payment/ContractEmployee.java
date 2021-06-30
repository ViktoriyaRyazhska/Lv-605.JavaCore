package homework06oop02._01.payment;

public class ContractEmployee extends Employee implements Payment {
	private double hourlyRate;
	private double workTime;
	private int federalTaxIdNumber;

	public ContractEmployee(String employeeId, double hourlyRate, double workTime, int fedId) {
		super(employeeId);
		this.hourlyRate = hourlyRate;
		this.workTime = workTime;
		federalTaxIdNumber = fedId;
	}

	public double calculatePayment() {
		return hourlyRate * workTime;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append("ContractEmployee\nHourly rate: ").append(hourlyRate).append("; work time: ").append(workTime)
				.append("; federal tax id number: ").append(federalTaxIdNumber).append("; payment: ")
				.append(calculatePayment()).append("; ").append(super.toString()).append(".").toString();
	}
}
