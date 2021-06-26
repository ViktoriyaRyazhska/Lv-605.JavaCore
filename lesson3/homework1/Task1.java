package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number" +"\n");
		float a = Float.parseFloat(br.readLine());
		
		System.out.println("Enter second number" +"\n" );
		float b = Float.parseFloat(br.readLine());
		
		System.out.println("Enter the third number" +"\n");
		float c= Float.parseFloat(br.readLine());;
		
		if ( a <= 5 && a>= -5) {
			System.out.println("The first number within the range" + "\n");
		}else {
			System.out.println("The first number is out of range" + "\n");
		}
		
		if ( b <= 5 && b>= -5) {
			System.out.println("The first number within the range" + "\n");
		}else {
			System.out.println("The first number is out of range" + "\n");
		}
		
		if ( c <= 5 && c>= -5) {
			System.out.println("The first number within the range" + "\n");
		}else {
			System.out.println("The first number is out of range" + "\n");
		}
	}
}
