package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("type radius ");
        System.out.println(flowerCounter(br.readLine()));
    }

    private static String flowerCounter(String i) {

//        double perimeter =   2 * Double.parseDouble(i) * 3.14;
//        double area = 3.14 * (Double.parseDouble(i) * Double.parseDouble(i));
//        return "perimeter is " + perimeter + "\narea is " + area   ;
    return   "perimeter is " + 2 * (Double.parseDouble(i) * 3.14) +
             "\narea is " + 3.14 * (Double.parseDouble(i) * Double.parseDouble(i));
    }
}
