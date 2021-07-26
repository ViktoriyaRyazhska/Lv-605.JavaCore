package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task {


	public static double div (double a, double b) throws ArithmeticException {
		
		if(b < 0) {
			
			throw new ArithmeticException("You can't divide by negative number");
		}
		try {
			return a/b;	
			
		}catch( ArithmeticException e) {
			
			System.out.println("Divide be zero is forbidden");
			return 0;
		}catch (NumberFormatException e) {
			System.out.println("Enter the number, not a letter");
			return 0;
		}
		
	}



	public static void main(String[] args) throws IOException {
	
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first values");
		double a = Integer.parseInt(br.readLine());
		System.out.println("Enter the second value");
		double b = Integer.parseInt(br.readLine());
		
		try {
		System.out.println(div(a,b));
		
	}catch(ArithmeticException e) {
		System.err.print(e);
	}

}
}
