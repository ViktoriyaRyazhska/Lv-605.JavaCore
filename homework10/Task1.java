package homework10;

import java.io.*;

public class Task1 {

	public static void main(String[] args) {
		double a = 0, b = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Please enter first number: ");
			a = Double.parseDouble(br.readLine());
			System.out.println("Please enter second number: ");
			b = Double.parseDouble(br.readLine());
		} catch (NumberFormatException e) {
			System.err.println("You have entered not a number!");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("IO Exception!");
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			System.out.println("Result = " + div(a, b));
		} catch (ArithmeticException e){
			System.err.println("You can not divide by 0!");
			e.printStackTrace();
		}
		
	}

	public static double div(double a, double b) throws ArithmeticException {
		if(a ==0 || b==0) {
			throw new ArithmeticException();
		}
		return a / b;
	}
}
