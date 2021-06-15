package com.company;

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    private String firstName;
    private String lastName;
    private String birthYear;

    Person() {

    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws IOException {
        this.firstName = checkField(firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws IOException {

        this.lastName = checkField(lastName);
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public void inPut(String name, String surName, String year) throws IOException {
        System.out.println("Type name, surname and year of birth");
        setFirstName(name);
        setLastName(surName);
        setBirthYear(year);
    }

    public void outPut() {
        System.out.println("name is " + firstName + " surname  is " + lastName + " Year of birth " + birthYear);
    }

    public void changeName(String name, String surName) throws IOException {
        setFirstName(name);

        setLastName(surName);
    }

    public static void infoForName() {
        System.out.println("Type the name");
    }

    public static void infoForLastName() {
        System.out.println("Type the surname");
    }

    public static void info() {
        System.out.println("Type the name and surname");
    }

    public static void infoWithYear() {
        System.out.println("Type the name,surname & year ");
    }

    public static String checkField(String string) throws IOException {
        String checkedLine = string;
        if (string.isEmpty() | ArrayCheck(checkedLine)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (checkedLine.isEmpty() | ArrayCheck(checkedLine) ) {
                System.out.println("field is incorrect, retype please");
                checkedLine = reader.readLine();
            }
        }

        return checkedLine;
    }
    public static boolean ArrayCheck(String line){
        char [] arr = new char[line.length()];
        for (int i = 0; i < line.length(); i++) {
            arr[i] = line.charAt(i);
            if(Character.isDigit(arr[i])){
                return true;
            }
        }
        return false;
    }

}
