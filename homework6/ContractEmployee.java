package homework6;

public class ContractEmployee extends Employee implements Payment {
	private int fixedMonthlyPayment;
	private int federalTaxIdmember;

	public ContractEmployee() {

	}

	public ContractEmployee(String name, String employeeId, int fixedMonthlyPayment, int federalTaxIdmember) {
		super(name, employeeId);
		this.fixedMonthlyPayment = fixedMonthlyPayment;
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public int getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}

	public void setFixedMonthlyPayment(int fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(int federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	@Override
	public String toString() {
		return "ContractEmployee [name= " + super.getName() + " ID = " + super.getEmployeeId() + " fixedMonthlyPayment=" + fixedMonthlyPayment + ", federalTaxIdmember="
				+ federalTaxIdmember + "]";
	}

	@Override
	public int calculatePay() {
		return fixedMonthlyPayment;
	}

}
