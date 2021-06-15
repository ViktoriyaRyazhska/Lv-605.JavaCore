package lesson4.practTask3;

public enum Continent {
	EURASIA("Ukraine", "Russia", "Belarus"), 
	AFRICA("Nigeria", "Ethiopia", "Egypt"), 
	NORTH_AMERICA("USA", "Canada", "Texas"), 
	SOUTH_AMERICA("Brazil", "Colombia", "Peru"), 
	AUSTRALIA("Australia", "Papua New Guinea"), 
	ANTARCTICA("Antarctica"); //���������� ���������� � ����� � ���
	

	private String[] countries; //����� � ���� ����������� ������ �����, �� ���� �����������
	
	//�����������, ���� ������ ����� � ���� ���� � ������ �� � countries[]
	Continent(String... countries){  				  
		this.countries = countries;					  
	}
	//����� ���� ������ ����� ����� � �������� �� �������� ���� � ���� ������
	public boolean isCountryOn(String country) {
		for(String c:countries) { //���� for each
			if(c.toLowerCase().equals(country.toLowerCase())) { //������� �������� � ����� � ������ ������
				return true;
			}
		}
		return false;
	}
}
