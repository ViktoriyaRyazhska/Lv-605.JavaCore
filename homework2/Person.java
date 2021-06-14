package homework2;

import java.util.Calendar;

public class Person {
	private String firstName, lastName;
	private int birthYear = 0;

	public Person() {
	};

	public Person(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

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

	public void getAge() {
		System.out.println(this.firstName + " age is: " + (Calendar.getInstance().get(Calendar.YEAR) - this.birthYear));
	}

	public void input(String fn) {
		this.firstName = fn;
	}

	public void input(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	public void input(String fn, String ln, int by) {
		this.firstName = fn;
		this.lastName = ln;
		this.birthYear = by;
	}
	
	public void output() {
		System.out.println("Person name is: " + this.firstName + " " + this.lastName + ".");
		System.out.println("Year of birth: " + this.birthYear);
		this.getAge();
	}
	
	public void changeName(String fn) {
		this.firstName = fn;
	}
	
	public void changeName(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	public static void main(String[] args) {
		Person per = new Person("Pavlo", "Skolozdra");
		per.setBirthYear(1991);
		per.getAge();
		per.output();
		per.input("Petro",  "Teteruk", 1994);
		per.output();
		per.changeName("Igor", "Smelyanets");
		per.output();
		Person per2 = new Person("Olena", "Petrenko");
		per2.setBirthYear(1980);
		Person per3 = new Person("Iryna", "Kosyk");
		per3.setBirthYear(1995);
		Person per4 = new Person("Marta", "Karpinska");
		per4.setBirthYear(1958);
		Person per5 = new Person("Oleg", "Terletskiy");
		per5.setBirthYear(1966);
		per2.output();
		per3.output();
		per4.output();
		per5.output();
	}

}
