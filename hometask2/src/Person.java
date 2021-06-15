import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

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
            return LocalDate.now().getYear() - this.birthYear;
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

    public void input(BufferedReader br) throws IOException {
        System.out.println("Enter the first name of the person: ");
        this.firstName = br.readLine();
        System.out.println("Enter the last name of the person: ");
        this.lastName = br.readLine();
        System.out.println("Enter the year of birth of the person: ");
        this.birthYear = Integer.parseInt(br.readLine());
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
