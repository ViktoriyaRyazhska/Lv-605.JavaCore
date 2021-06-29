package secondone;

import java.io.BufferedReader;

public class Person {

		private String firstName;
		private String lastName;
		private int birthYear;
		private int ourYear = 2021;
		
		public Person() {
		}
		
		public Person(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
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
		
		@Override
		public String toString() {
			return "Person [firstName = " + firstName + ", lastName = " + lastName + ", " + "Age " + getAge() + "]";
		}
		
		public int getAge() {
			return (ourYear - birthYear);
		}
		
		public void changeName(String fn, String ln) {
			this.firstName = fn;
			this.lastName = ln;
		}

	}
