package lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class Person {
    private String FirstName, LastName;
    private int birthYear;


    public Person() {
    }

    public Person(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }

    public int getAge() {
        return LocalDate.now().getYear() - this.birthYear;
    }

    public void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input firstName: ");
        FirstName = br.readLine();
        System.out.print("Input lastName: ");
        LastName = br.readLine();
        System.out.print("Input birthYear: ");
        birthYear = Integer.parseInt(br.readLine());
    }

    public void output() {
        System.out.println("FirstName = " + FirstName +
                ", LastName = " + LastName +
                ", BirthYear = " + birthYear +
                ", Age = " + this.getAge());
    }

    public void changeName(String fn, String ln) {
        FirstName = fn;
        LastName = ln;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }


}
