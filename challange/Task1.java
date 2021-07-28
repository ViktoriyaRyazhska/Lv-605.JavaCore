package challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
	
	
	static	int n1 = 0;
	static	int n2 = 1;
	int sum =0;
	public static void generFi (int inputNumber ) {
		
		for (int i=0; i<inputNumber; i++) {
			int sum = n1 +n2;
			System.out.println(sum + " ");
			n1 = n2;
			n2 = sum;
			
	}		
}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number for Fibonacci sequence");
		int inputNumber = Integer.parseInt(br.readLine());
		generFi(inputNumber);
		
		
	}
	
	
}