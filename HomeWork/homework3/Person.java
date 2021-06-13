import java.time.LocalDate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Person {
	
	private String firstName ;
	private String lastName;
	private int birthYear = 0;
	
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
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
	
	public int getAge() {
		LocalDate date = LocalDate.now();
		return date.getYear()-this.birthYear;
	}
	
	public void input() throws IOException {
		
		System.out.println("Please put informacion about person:");
		System.out.println("Last Name: ");
		this.lastName = br.readLine();
		System.out.println("Firs Name: ");
		this.firstName = br.readLine();
		System.out.println("Date of Birthday: ");
		this.birthYear = Integer.parseInt(br.readLine());
		
	}
	
	public void output() {
		System.out.println("First name:" + firstName );
		System.out.println("Last Name " + lastName );
		System.out.println("Date of birthday:" + birthYear );
				            
	}
	
	public void changeName(String fn, String ln) {
		 this.firstName = fn;
		 this.lastName = ln;
		
	}

}
