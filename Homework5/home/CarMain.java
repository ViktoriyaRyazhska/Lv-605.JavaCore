package Lesson5;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars
//certain model year  (enter year in the console);
//ordered by the field year.
public class CarMain {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Car[] cars = {
                new Car("Bus", 1985, 3000),
                new Car("Truck", 2010, 2000),
                new Car("crossover", 1999, 2500),
                new Car("motocycle", 2019, 1400),
        };
        getAllcarsYearofproduction(cars, getneededyear(cars, br));
        System.out.println("Sorted cars by Year:");
        getSortedByYear(cars);

    }
    public static int getneededyear(Car[] cars, BufferedReader br) throws IOException{
        int caryear;
        while (true){
            System.out.print(" Please enter year: ");
            caryear = Integer.parseInt(br.readLine());
            for (Car e: cars){
                if (e.getYearofproduction()==caryear){
                    return caryear;
                }
            }
            System.out.println("You entered wrong year, try again.");
        }
    }
    public static void getAllcarsYearofproduction(Car[] cars, int yearProduct) {

            System.out.print("Here's what we found this year:  ");
            for(Car e: cars) {
                if (e.getYearofproduction()==yearProduct)
                    System.out.println(e);
            }
        }
    public static void getSortedByYear(Car[] cars) {
        Car temp;
        for(int i = 0; i < cars.length; i++) {
            for(int j = i+1; j < cars.length; j++) {
                if(cars[i].getYearofproduction()<cars[j].getYearofproduction()) {
                    temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
        for(Car e: cars) {
            System.out.println(e.toString());
        }
    }
    }

