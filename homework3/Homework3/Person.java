package Homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    // робимо три приватні поля.
    private String firstName;
    private String lastName;
    private int birthYear;
//    створюємо два конструктора, дефалтний і з двома полями.
    public Person(){
    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getAge() {
        return (2021 - this.birthYear);
    }
    public void replace(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }
    public void input() throws IOException {
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
    // тут були гетери й сетери але я їх прибрав, бо не зрозумів навіщо вони при читанні з буфера
}
