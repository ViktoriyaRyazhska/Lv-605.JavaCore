package homework2;

import java.io.*;
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

	public void input() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter persons first name: ");
		try {
			this.firstName = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Please enter persons last name: ");
		try {
			this.lastName = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Please enter persons year of birth: ");
		try {
			this.birthYear = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
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
	
	public static Person getPerson() {
		return new Person();
	}

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		
		person1.input();
		person2.input();
		person3.input();
		person4.input();
		person5.input();
		
		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();
	}
}
