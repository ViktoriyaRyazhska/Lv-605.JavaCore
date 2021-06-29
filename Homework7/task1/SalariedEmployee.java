package lesson7.homework1task;

public class SalariedEmployee extends Employee implements Payment{
    int socialSecurityNumber;
    int hourlyRate;
    int numberOfHoursWorked;

    public SalariedEmployee(String employeeID, String name, int socialSecurityNumber, int hourlyRate, int numberOfHoursWorked) {
        super(employeeID, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public int calculatePay() {
        return hourlyRate*numberOfHoursWorked;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber=" + socialSecurityNumber +
                ", hourlyRate=" + hourlyRate +
                ", numberOfHoursWorked=" + numberOfHoursWorked +
                "} " + super.toString();
    }
}
