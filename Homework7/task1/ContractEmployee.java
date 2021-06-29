package lesson7.homework1task;

public class ContractEmployee extends Employee implements Payment {
int federalTaxIdmember;
int Fixedmonthlypayment;

    public ContractEmployee(String employeeID, String name, int fixedmonthlypayment) {
        super(employeeID, name);
        this.Fixedmonthlypayment = fixedmonthlypayment;
    }

    @Override
    public int calculatePay() {
        return Fixedmonthlypayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdmember=" + federalTaxIdmember +
                ", Fixedmonthlypayment=" + Fixedmonthlypayment +
                "} " + super.toString();
    }
}

