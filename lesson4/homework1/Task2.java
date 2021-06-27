package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first number");
		int a = Integer.parseInt(br.readLine());
		System.out.println("Enter the second number");
		int b = Integer.parseInt(br.readLine());
		System.out.println("Enter the third numer");
		int c = Integer.parseInt(br.readLine());
		
		int bigNumber = 0;
		
		if(bigNumber <= a) {
			bigNumber = a;
		}if (bigNumber <= b){
			bigNumber = b;
			
		}if (bigNumber <=c) {
			bigNumber = c;
		}
		System.out.println("The biggest number is " + bigNumber);
		
	
	}
	
	
}
