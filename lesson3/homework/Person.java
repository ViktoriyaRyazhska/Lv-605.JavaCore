package lesson2;

public class Person {
	private String firstName;
	private String lastName;
	private int birthYear;
	//constructors
	public Person() {}
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	//methods
	public int getAge() {
		return 2021-this.birthYear;
	}
	public void input(String firstName, String lastName, int birthYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}
	public void output() {
		System.out.println("firstName = " + firstName +
						   ", lastName = " + lastName +
						   ", birthYear = " + birthYear +
						   ", age = " + this.getAge());
	}
	public void changeName(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}
	
	//set and get
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
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
}
