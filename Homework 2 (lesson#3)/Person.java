package homework2;

public class Person {

	private String firstName, lastName;
	private int birhYear;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirhYear() {
		return birhYear;
	}
	public void setBirhYear(int birhYear) {
		this.birhYear = birhYear;
	}
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		;
	}
	
	public int getAge() {
		return 2021 - birhYear;
	}
	public String input() {
	return firstName + lastName + birhYear;
	}
	
	public String output() {
		return firstName + lastName + getAge();
		}
	
	/*public String changeName (String fn, String In)
	return;
	}
	*/

	

}
