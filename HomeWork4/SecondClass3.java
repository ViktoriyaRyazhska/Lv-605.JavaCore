package com.edu;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class SecondClass3 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("What is your name?");

String name = br.readLine();
System.out.println(" Where are you live, " + name + "?");


String adress = br.readLine();
System.out.println(adress + name);
  
  }
}
