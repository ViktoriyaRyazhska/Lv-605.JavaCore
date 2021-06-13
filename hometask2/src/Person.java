import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    public String firstName;
    public String lastName;
    public int birthYear;

    Person() {
    }

    Person(String firstName, String lastName) {
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
        if (this.birthYear >= 1950 && this.birthYear <= 2021)
            return 2021 - this.birthYear;
        else {
            System.out.println("Age of person is not right");
            return 0;
        }
    }

    public String output() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public void input() throws IOException {
        String firstName;
        String lastName;
        int birthYear;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first name of the person: ");
        firstName = br.readLine();
        System.out.println("Enter the last name of the person: ");
        lastName = br.readLine();
        System.out.println("Enter the year of birth of the person: ");
        birthYear = Integer.parseInt(br.readLine());
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
