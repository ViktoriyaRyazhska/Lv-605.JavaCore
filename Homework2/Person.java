package homework2;

import java.io.BufferedReader;
import java.io.IOException;

//class
public class Person {
    //fields
       private String firstName;
       private String lastName;
       private int birthYear;
       //constructor
       public Person() {
       }
       public Person(String firstName) {
              this.firstName = (firstName);
       }
       public Person(String firstName, String lastName) {
              this.firstName = firstName;
              this.lastName = lastName ;
       }
       public Person(String firstName, String lastName, int birthYear) {
           this.firstName = firstName;
           this.lastName = lastName;
           this.birthYear = birthYear;
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
//methods
      public int getAge() { //calculate age
              return 2021 - birthYear;
       }
       public void input (BufferedReader br) throws IOException { //input info
           System.out.println("Name : ");
           this.firstName= br.readLine();
           System.out.println("Surname : ");
           this.lastName= br.readLine();
           System.out.println("Year of birth : ");
           this.birthYear = Integer.parseInt(br.readLine());
       }
    @Override //output info
       public String toString() {
              return "Person[firstName=" + firstName +", lastName=" + lastName +", birthYear=" + birthYear +"," +
                      " age=" + this.getAge() +"]";
       }
       public void change(String newfirstName, String newlastName) {
           this.firstName=newfirstName;
           this.lastName=newlastName;
       }

}


