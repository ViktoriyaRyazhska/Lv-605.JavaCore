package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class HomeTask2 {
    public static void main(String[] args) throws IOException {
        presentation();
    }

    private static void presentation() throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("Where do you live " + name );
        String town =br.readLine();
        System.out.println("Your name is " +name + "\n" + "Your town is " + town);

    }
}
