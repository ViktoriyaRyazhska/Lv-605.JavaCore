package com.company;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        dialog();
    }

    private static void dialog() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How r you?");
        System.out.println("you r " + scanner.next());

    }
}
