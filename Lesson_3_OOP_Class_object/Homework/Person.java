package Lesson_3_OOP_Class_object.Homework;

import java.time.LocalDate;
import java.util.Calendar;

public class Person {
    private String firstName, lastName;
    private int birhYear;

    //<editor-fold desc="Constructor">
    public Person() {
    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int birhYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birhYear = birhYear;
    }
    //</editor-fold>

    //<editor-fold desc="Getter&Setter">
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

    public int getBirhYear() {
        return birhYear;
    }

    public void setBirhYear(int birhYear) {
        this.birhYear = birhYear;
    }
    //</editor-fold>

    public String getAge() {
        int age = getCurrentYear() - getBirhYear();
    return String.format("number of year %d", age);
    }

    public void input(String firstName, String lastName, int birhYear) {
        setFirstName(firstName); setLastName(lastName);setBirhYear(birhYear);
    }

    public String output() {
        return String.format("first name: %s, last name: %s " +
                "birthday: %d ",getFirstName(),getLastName(),getBirhYear());
    }

	public void changeName (String fn, String ln){
        setFirstName(fn); setLastName(ln);
	}
	public int getCurrentYear(){
        return LocalDate.now().getYear();
    }

}
