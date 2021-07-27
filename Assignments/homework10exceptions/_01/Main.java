package homework10exceptions._01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {

		// div(); method
		try {
			System.out.println(div(3.1, 0));
		} catch (ArithmeticException e) {
			System.err.println("Division by 0 is allowed in some other universe =(");
		}

		// readNumber(int start, int end); method
		int start = 1;
		for (int i = 0; i < 10; i++) {
			start = readNumber(start, 100);
			System.out.println();
		}
	}

	public static double div(double a, double b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a / b;
	}

	public static int readNumber(int start, int end) {
		int input = 0;
		while (true) {
			System.out.println(
					"Please enter a number to check if it's in the bounds between " + start + " and " + end + ":");
			try {
				input = Integer.parseInt(br.readLine());
				if ((input >= end) || (input <= start)) {
					System.err.println("The number you've entered doesn't match the bounds.\n");
				} else {
					break;
				}
			} catch (IOException | NumberFormatException e) {
				System.err.println("Numbers input only!\n");
			}
		}
		System.out.println("Yup! " + input + " is in the bounds between " + start + " and " + end + ".");
		return input;
	}

}
