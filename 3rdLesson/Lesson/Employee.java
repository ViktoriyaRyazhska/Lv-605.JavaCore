package com.company;
// is it okay? PLease check 
public class Employee {
    static double totalSum;
    private String name;
    private double rate;
    private double hours;

    Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary() + getBonus();

    }

    Employee(String name, double rate) {
        this(name, rate, 0d);
    }

    Employee(double rate) {
        this(null, rate, 0d);
    }

    Employee(String name) {
        this(name, 0d, 0d);
    }

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
        totalSum -= getSalary() + getBonus();
        this.rate = rate;
        totalSum += getSalary() + getBonus();
    }

    public double getHours() {

        return hours;
    }

    public void setHours(double hours) {
        totalSum -= getSalary() + getBonus();
        this.hours = hours;
        totalSum += getSalary() + getBonus();
    }

    public double getSalary() {

        return rate * hours;

    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ".rate = " + rate + " hours =" +
                hours + " sallary = " + getSalary() + " bonus " + getBonus() + "]";
    }

    public double changeRate(double newRate) {
        totalSum -= getSalary() + getBonus();
        totalSum += (newRate * hours) + (newRate * hours) * 0.1;
        return this.rate = newRate;
    }

    public double getBonus() {
        return this.getSalary() * 0.1;
    }
}
