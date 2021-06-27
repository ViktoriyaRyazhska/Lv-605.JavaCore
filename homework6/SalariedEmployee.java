package homework6;

public class SalariedEmployee extends Employee implements Payment {
	private int hourlyRate;
	private int numberOfHoursWorked;
	private String socialSecurityNumber;

	public SalariedEmployee() {
	}

	public SalariedEmployee(String name, String employeeId, int hourlyRate, 
			int numberOfHoursWorked, String socialSecurityNumber) {
		super(name, employeeId);
		this.hourlyRate = hourlyRate;
		this.numberOfHoursWorked = numberOfHoursWorked;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}

	public void setNumberOfHoursWorked(int numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [name= " + super.getName() + " ID = " + super.getEmployeeId() + " hourlyRate=" + hourlyRate + ", numberOfHoursWorked=" + numberOfHoursWorked
				+ ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}

	@Override
	public int calculatePay() {
		return hourlyRate * numberOfHoursWorked;
	}

}
