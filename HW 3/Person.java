
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Person {
		
		private String firstName;
		private String lastName;
		private int birthYear;
		
	

		public Person() 
		{
		
		}

		public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		}
		

		public String getFirstName () {
		return firstName ;
		}

		public void setFirstName (String firstName ) {
		this.firstName = firstName ;
		}
		
		public String getLastName () {
			return lastName ;
			}

			public void setLastName (String lastName ) {
			this.lastName = lastName ;
			}
			
			public int getBirthYear () {
				return birthYear ;
				}

				public void setBirthYear (int birthYear ) {
				this.birthYear = birthYear ;
				}
				
				public int getAge () {
					return (2021 - birthYear);
					
			
				}
			public void changeName (String fn, String ln)
			{
				this.firstName = fn;
				this.lastName = ln;
			
				
			}
public void output()   
{ System.out.println(firstName);
System.out.println( lastName);
System.out.println( getAge());
	


}
public void input() throws IOException 
{BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.print("First name");
this.firstName = br.readLine();
System.out.print("Last name");
this.lastName = br.readLine();

System.out.print("Birth Year");
this.birthYear = Integer.parseInt (br.readLine());
	
}
}
		



		