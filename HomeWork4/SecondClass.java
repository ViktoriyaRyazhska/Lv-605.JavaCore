package com.edu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondClass {
  public static void main (String[] args) throws IOException {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

System.out.println("Time");
double time = Integer.parseInt(br.readLine());
System.out.println("Coast");
int coast = Integer.parseInt(br.readLine());

System.out.println((coast * time));  

 }
}



