package lesson4.practTask3;

public enum Continent {
	EURASIA("Ukraine", "Russia", "Belarus"), 
	AFRICA("Nigeria", "Ethiopia", "Egypt"), 
	NORTH_AMERICA("USA", "Canada", "Texas"), 
	SOUTH_AMERICA("Brazil", "Colombia", "Peru"), 
	AUSTRALIA("Australia", "Papua New Guinea"), 
	ANTARCTICA("Antarctica"); //Перечисляю континенти і країни в них
	

	private String[] countries; //масив в який конструктор записує країни, які йому передаються
	
	//конструктор, який приймає масив з назв країн і записує їх в countries[]
	Continent(String... countries){  				  
		this.countries = countries;					  
	}
	//метод який приймає назву країни і перевіряє чи присутня вона у обєкті классу
	public boolean isCountryOn(String country) {
		for(String c:countries) { //цикл for each
			if(c.toLowerCase().equals(country.toLowerCase())) { //порівнюю значення в масиві з назвою крахни
				return true;
			}
		}
		return false;
	}
}
