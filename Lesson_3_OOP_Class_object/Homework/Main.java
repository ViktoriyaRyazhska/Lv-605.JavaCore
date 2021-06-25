package Lesson_3_OOP_Class_object.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedMap;

public class Main {
    /*
    Create Console Application project in Java.
    Add class Person to the project.
    Class Person should consist of
    three private fields: firstName, lastName and birthYear (the birthday year)
    properties for access to these fields
    default constructor and constructor with 2 parameters (first and last names)
    methods:
    getAge() - to calculate the age of person
    input() - to input information about person
    output() - to output information about person
    changeName(String fn, String ln) - to change the first name or/and last name of person
    In the method main() create 5 objects of Person type and input information about them.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter the first person the first name: ");
        String p1FirstName = br.readLine();
        System.out.println("enter the first person the last name: ");
        String p1LastName = br.readLine();
        System.out.println("enter the first person the year of birth: ");
        int p1YearOfBirth = Integer.parseInt(br.readLine());
        Person p1 = new Person();
        p1.input(p1FirstName, p1LastName, p1YearOfBirth);
        System.out.println(p1.getAge());
        System.out.println(p1.output());

        System.out.println("enter the second person the second person the first name: ");
        String p2FirstName = br.readLine();
        System.out.println("enter the second person last name: ");
        String p2LastName = br.readLine();
        System.out.println("enter the second person the year of birth: ");
        int p2YearOfBirth = Integer.parseInt(br.readLine());
        Person p2 = new Person(p2FirstName, p2LastName, p2YearOfBirth);
        System.out.println(p2.output());

        System.out.println("enter the third person the first name: ");
        String p3FirstName = br.readLine();
        System.out.println("enter the third person the last name: ");
        String p3LastName = br.readLine();
        System.out.println("enter the third person the the year of birth: ");
        int p3YearOfBirth = Integer.parseInt(br.readLine());
        Person p3 = new Person(p3FirstName, p3LastName, p3YearOfBirth);
        System.out.println(p3.output());

        System.out.println("enter the fourth person the first name: ");
        String p4FirstName = br.readLine();
        System.out.println("enter the fourth person the last name: ");
        String p4LastName = br.readLine();
        System.out.println("enter the fourth person the year of birth: ");
        int p4YearOfBirth = Integer.parseInt(br.readLine());
        Person p4 = new Person(p4FirstName, p4LastName, p4YearOfBirth);
        System.out.println(p4.output());

        System.out.println("enter the fifth person the first name: ");
        String p5FirstName = br.readLine();
        System.out.println("enter the fifth person the last name: ");
        String p5LastName = br.readLine();
        System.out.println("enter the fifth person the year of birth: ");
        int p5YearOfBirth = Integer.parseInt(br.readLine());
        Person p5 = new Person(p5FirstName, p5LastName, p5YearOfBirth);
        System.out.println(p5.output());
    }
}
