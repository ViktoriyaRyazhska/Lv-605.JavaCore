package lesson2;

import java.time.LocalDate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		return LocalDate.now().getYear()-this.birthYear;
	}
	public void input() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input firstName: ");
		firstName = br.readLine();
		System.out.print("Input lastName: ");
		lastName = br.readLine();
		System.out.print("Input birthYear: ");
		birthYear = Integer.parseInt(br.readLine()) ;
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
