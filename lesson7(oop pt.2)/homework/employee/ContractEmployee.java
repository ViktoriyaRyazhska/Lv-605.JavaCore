package homework1;

public class ContractEmployee extends Employee implements Payment{

	private int federalTaxIdmember;
	private int averageSal;
	private String name;
	private String position;
	


	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}



	public void setFederalTaxIdmember(int federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}



	public int getAverageSal() {
		return averageSal;
	}



	public void setAverageSal(int averageSal) {
		this.averageSal = averageSal;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	public ContractEmployee(int employyeId, int federalTaxIdmember, int averageSal, String name, String position) {
		super(employyeId);
		this.federalTaxIdmember = federalTaxIdmember;
		this.averageSal = averageSal;
		this.name = name;
		this.position = position;
	}



	public void paymentType() {
		
		System.out.println("Hourly paid worker");
	}

	@Override	
	public int calculatePay() {
		
		return getAverageSal();
	}
	
	
}
