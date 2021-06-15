package homework02_Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;

public class Person {
//	private static int presentYear = 2021;
	private static int count = 1;
	private int id;
	private String firstName;
	private String lastName;
	private int birthYear = 0;

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

	public Person() {
		id = count;
		count++;
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		id = count;
		count++;
	}

	public int getAge() {
		return LocalDate.now().getYear() - birthYear;
	}

	public void input(BufferedReader buff) throws IOException {
		if (firstName == null) {
			System.out.println("Please enter the first name of a person ID " + id + ":");
			firstName = buff.readLine();
		}
		if (lastName == null) {
			System.out.println("Please enter the last name of a person ID " + id + ":");
			lastName = buff.readLine();
		}
		if (birthYear == 0) {
			System.out.println("Please enter the year of birth of a person ID " + id + ":");
			birthYear = Integer.parseInt(buff.readLine());
		}
	}

	public void output() {
		System.out.println(
				"Person ID: " + id + ". First name: " + firstName + ". Last name: " + lastName + ". Age: " + getAge());
	}

	public void changeName(String fn, String ln) {
		if (fn != null) {
			setFirstName(fn);
		}
		if (ln != null) {
			setLastName(ln);
		}
	}

//	public String toString() {
//		return "Person ID: " + id + ". First name: " + firstName + ". Last name: " + lastName + ". Age: " + getAge();
//	}

}
