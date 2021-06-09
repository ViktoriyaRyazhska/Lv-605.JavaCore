package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type your first digit  ");
        calculate(scanner.nextInt(), scanner.nextInt());
    }

    public static void calculate(int a, int b) {
        System.out.println("a + b= " + (a + b));
        System.out.println("a - b= " + (a - b));
        System.out.println("a * b= " + a * b);
        if (b != 0) {
            System.out.println("a/ b= " + a / b);
        }
    }
}
