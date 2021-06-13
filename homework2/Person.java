package homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {

	private String firstName, lastName;
	private int birthYear;
	
	
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
	
	
	public Person() {
		
	}
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		;
	}
	
	
	
	public int getAge() {
		return 2021 - birthYear;
	}
	
	public void input() throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter First Name");
		firstName = br.readLine();
		System.out.println("Enter Last Name");
		lastName = br.readLine();
		System.out.println("Enter The Birth Year");
		birthYear = Integer.parseInt(br.readLine());
	}
	
	public void output() {
		System.out.println( "The First Name is - " + firstName + " The Last Nme is -" + lastName  + "The Age is - " + this.getAge());
		}

	

}
