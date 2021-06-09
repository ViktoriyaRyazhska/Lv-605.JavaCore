package edu.boxtest;

import javax.swing.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PseudoColumnUsage;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter radius: ");
        double radius = Double.parseDouble(br.readLine());
//        double pi = 3.14;
//        double per = 2*pi*radius;
        System.out.println("Area by flower is: " + 2*Math.PI*radius);


        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("Where are you live, (name)?");
        String city = br.readLine();


        System.out.println("Hello " + name);
        System.out.println("You live in " + city);



       int c1, c2, c3;
       int t1, t2, t3;
       int sum=0;
        System.out.println("Enter source data: ");
        System.out.println("Enter c1: ");
        c1 = Integer.parseInt(br.readLine());
        System.out.println("Enter c2: ");
        c2 = Integer.parseInt(br.readLine());
        System.out.println("Enter c3: ");
        c3 = Integer.parseInt(br.readLine());
        System.out.println("Enter t1: ");
        t1 = Integer.parseInt(br.readLine());
        System.out.println("Enter t2: ");
        t2 = Integer.parseInt(br.readLine());
        System.out.println("Enter t3: ");
        t3 = Integer.parseInt(br.readLine());
        System.out.println("First talk: " + c1*t1);
        sum += c1*t1;
        System.out.println("Second talk: " + c2*t2);
        sum += c2*t2;
        System.out.println("Third talk: " + c3*t3);
        sum += c3*t3;

        System.out.println("All talks together: " + sum);


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int a = Integer.parseInt(br.readLine());
//        int b = Integer.parseInt(br.readLine());
//        System.out.println("Result :" +  (a+b));
//        System.out.println("Result :" +  (a-b));
//        System.out.println("Result :" +  (a*b));
//        System.out.println("Result :" +  (a/b));



    }
}