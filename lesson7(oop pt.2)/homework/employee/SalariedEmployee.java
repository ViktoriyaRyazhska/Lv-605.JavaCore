package homework1;

public class SalariedEmployee extends Employee implements Payment {

	private int socialSecuriyNumber;
	private int hours;
	private int	hourRate;
	private String name;
	private String position;
	
	
	
	
	

	public int getSocialSecuriyNumber() {
		return socialSecuriyNumber;
	}

	
	public void setSocialSecuriyNumber(int socialSecuriyNumber) {
		this.socialSecuriyNumber = socialSecuriyNumber;
	}


	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}


	public int getHourRate() {
		return hourRate;
	}

	public void setHourRate(int hourRate) {
		this.hourRate = hourRate;
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





	public SalariedEmployee(int employyeId, int socialSecuriyNumber, int hours, int hourRate, String name,
			String position) {
		super(employyeId);
		this.socialSecuriyNumber = socialSecuriyNumber;
		this.hours = hours;
		this.hourRate = hourRate;
		this.name = name;
		this.position = position;
	}


	public void paymentRype() {
		
		System.out.println("Fixed payment waorker");
	}


	@Override
	public int calculatePay() {
		
		return getHourRate()*getHours();
	}
}
