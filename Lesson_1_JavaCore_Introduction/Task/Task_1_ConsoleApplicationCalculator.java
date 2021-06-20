package Lesson_1_JavaCore_Introduction.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleApplicationCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double chyslo1, chyslo2, rezultat;
        String diya;

        System.out.println("Enter first number...");
        chyslo1 = Double.parseDouble(br.readLine());

        System.out.println("Enter second number...");
        chyslo2 = Double.parseDouble(br.readLine());

        System.out.println("Enter an action (+-*/):");
        diya = br.readLine();

        if (diya.equals("/") && chyslo2 == 0) {
            System.out.println("Ah-ah, cannot by divided by zero");
            return;
        }

        if (diya.equals("+") || diya.equals("adding")) {
            rezultat = chyslo1 + chyslo2;
        } else if (diya.equals("-") || diya.equals("subtraction")) {
            rezultat = chyslo1 - chyslo2;
        } else if (diya.equals("*") || diya.equals("multiplication")) {
            rezultat = chyslo1 * chyslo2;
        } else if (diya.equals("/") || diya.equals("division")) {
            rezultat = chyslo1 / chyslo2;
        } else {
            rezultat = 0;
        }
        System.out.println("Result: " + rezultat);


    }
}
