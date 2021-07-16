package lesson11.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter double numbers");
		while (true) {
			try {
				System.out.println(div(readDouble(br), readDouble(br)));
				break;
			} catch (ArithmeticException e) {
				System.out.println("You cant / 0, try again");
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = readNumber(1, 100, br);	
		}
	}

	public static double div(double x, double y) {
		if (y == 0) {
			throw new ArithmeticException("/ by zero");
		}
		return x / y;
	}

	public static double readDouble(BufferedReader br) {
		double result = 0;
		while (true) {
			try {
				result = Double.parseDouble(br.readLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Enter number");
			} catch (IOException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public static int readNumber(int start, int end, BufferedReader br){
		int result = 0;
		System.out.println("Enter number");
		while (true) {
			try {
				result = Integer.parseInt(br.readLine());
				if(result < start || result > end) {
					throw new OutOfBoundsException();
				}
				break;
			} catch (NumberFormatException e) {
				System.out.println("Enter number");
			} catch (IOException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			} catch (OutOfBoundsException e) {
				System.out.println("This number is out of bounds, try again");
			}
		}
		
		return result;
	}
	
}
