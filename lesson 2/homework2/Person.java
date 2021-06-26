package homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {

	private String firstName, lastName;
	private int birthYear;
	
	// Getter & Setter
	
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
		return birthYear;
	}
	public void setBirhYear(int birhYear) {
		this.birthYear = birthYear;
	}
	
	
	
	// Constructors
	
	public Person() {	
	}
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	// Methods
	
	public int getAge() {
		return LocalDate.now().getYear() - birthYear;
	}
	
	public void changeName (String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public void input(BufferedReader br) throws IOException {
		
		System.out.println("Enter First Name");
		this.firstName = br.readLine();
		System.out.println("Enter Last Name");
		this.lastName = br.readLine();
		System.out.println("Enter The Birth Year");
		this.birthYear = Integer.parseInt(br.readLine());
	}
	
	public void output() {
		System.out.println( "The First Name is - " + firstName + "/ The Last Nme is - " + lastName  + "/ The Age is - " + this.getAge());
		}

	}

