package homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Task1 {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the values of redius - ");
		double r = Integer.parseInt(br.readLine());
		double pi = 3.14;
		double p = 2*pi*r;
		double s = pi*r*r;
		System.out.println("The square is - " + s);
		System.out.println("The perimetr  is - " + p);
	}

}