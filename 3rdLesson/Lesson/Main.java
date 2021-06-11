package com.company;

public class Main {

    public static void main(String[] args) {
     Employee paul = new Employee("Paul",10,20);
     Employee ann = new Employee(20);
     Employee vik = new Employee("Vil",10);
     Employee winston = new Employee("Winston");
      ann.setName("Ann");
      ann.setHours(4);
      vik.setHours(5);
      winston.setRate(8);
      winston.setHours(20);
      paul.changeRate(5);


        System.out.println(paul);
        System.out.println(ann);
        System.out.println(vik);
        System.out.println(winston);
        System.out.println(Employee.totalSum);

    }
}
