package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Type funds per minute " + "And call length ");
        double[] callPrise = new double[3];
        fillAndCount(callPrise);
        findSum(callPrise);

    }

    private static void findSum(double[] callPrise) {
        double sum = 0;
        for (int i = 0; i <= callPrise.length - 1; i++) {
            sum += callPrise[i];

        }
        System.out.println("Final bill is " + sum);
    }

    private static void fillAndCount(double[] callPrise) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <= callPrise.length - 1; i++) {
            callPrise[i] = Double.parseDouble(countCall(br.readLine(), br.readLine()));
        }
        int k = 1;
        for (int j = 0; j <= callPrise.length - 1; j++) {
            System.out.println("Prise for  " + k + " call is " + callPrise[j]);
            k++;

        }
    }

    private static String countCall(String funds, String time) {
        return String.valueOf(Double.parseDouble(funds) * Double.parseDouble(time));
    }
}
