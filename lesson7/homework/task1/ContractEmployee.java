package lesson7.homework.task1;

public class ContractEmployee extends Employee implements Payment {
	private int fixedMonthlyPayment;
	private int federalTaxIdmember;
	
	public ContractEmployee(String employeeID, String name, int fixedMonthlyPayment) {
		super(employeeID, name);
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	@Override
	public int calculatePay() {
		return fixedMonthlyPayment;
	}

	@Override
	public String toString() {
		return "ContractEmployee " + super.toString() + " [fixedMonthlyPayment=" + fixedMonthlyPayment + ", federalTaxIdmember="
				+ federalTaxIdmember + "]";
	}

	

	
}
