package com.edu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondClass2 {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Name: ");

String name = br.readLine();
System.out.println(name);

System.out.print("Age: ");
int age = Integer.parseInt(br.readLine());
System.out.println("age: " + age);
  }
}
