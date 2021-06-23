package Lesson_3_OOP_Class_object.Task;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Create Console Application project in Java.
Add class Employee to the project.
Class Employee should consist of
	three private fields: name, rate and hours;
	static field totalSum
	properties for access to these fields;
	default constructor, constructor with 2 parameters (name and rate)
	and constructor with 3 parameters;
	methods:
getSalary() - to calculate the salary of person (rate * hours)
toString() - to output information about employee
changeRate(int rate) - to change the rate of some employee and recalculate his salary
getBonuses() – to calculate 10% from salary
In the method main() create 3 objects of Employee type. Input information about them.
Display the total salary of all workers to screen
 */
public class Employee {
    private String name;
    private double rate, hours, bonus = 0;
    private static double totalSum = 0;

    //<editor-fold desc="Constructor">

    public Employee() {
        totalSum += getTotalSum() * getHours();
    }

    public Employee(String name) {
        this.name = name;
        totalSum += getRate() * getHours();
    }

    public Employee(String name, double rate) {
        this.name = name;
        totalSum += (this.rate = rate) * getHours();
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += rate * hours;
    }

    //</editor-fold>

    //<editor-fold desc="Getter&Setter">

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
        totalSum += rate * getHours();
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
         this.hours = hours;
        totalSum += getRate() * hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;

    }

    //</editor-fold>

    public double getSalary() {

        return getRate() * getHours();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public void changeRate(int rate) {
        setRate(rate);
    }

    public double getBonuses() {
        if(getHours()>8){
        bonus = getSalary() * 0.1;}
        return bonus;
    }

}
