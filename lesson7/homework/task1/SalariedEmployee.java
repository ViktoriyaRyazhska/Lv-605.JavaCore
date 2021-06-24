package lesson7.homework.task1;

public class SalariedEmployee extends Employee implements Payment {
	private int hourlyRate;
	private int numberOfHoursWorked;
	private int socialSecurityNumber;
	
	public SalariedEmployee(String employeeID, String name, int hourlyRate, int numberOfHoursWorked, int socialSecurityNumber) {
		super(employeeID, name);
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWorked = numberOfHoursWorked;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public int calculatePay() {
		return hourlyRate*numberOfHoursWorked;
	}

	@Override
	public String toString() {
		return "SalariedEmployee " + super.toString() +  " [hourlyRate=" + hourlyRate + ", numberOfHoursWorked=" + numberOfHoursWorked
				+ ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}

	
	
	
}
