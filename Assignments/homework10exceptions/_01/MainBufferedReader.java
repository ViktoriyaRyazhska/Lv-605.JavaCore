package homework10exceptions._01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainBufferedReader {

	public static void main(String[] args) {
		int[] intArray = new int[10];

		// div(); method
//		try {
//			System.out.println(div(3.1, 0));
//		} catch (ArithmeticException e) {
//			System.err.println("Division by 0 is allowed in some other universe =(");
//		}

		// readNumber(int start, int end); method
		for (int i = 0; i < intArray.length; i++) {
			try {
				intArray[i] = readNumber(1, 100);
			} catch (NotInBoundsException e) {
				System.err.println(e.getMessage());
			}
		}
		
	}

//	public static double div(double a, double b) throws ArithmeticException {
//		if (b == 0) {
//			throw new ArithmeticException();
//		}
//		return a / b;
//	}

	public static int readNumber(int start, int end) throws NotInBoundsException {
		int input = 0;
		System.out.println("Please enter a number to check if it's in the bounds you've defined:");
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			input = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			System.err.println("Numbers input only!");
		}

		if ((input < start) || (input > end)) {
			throw new NotInBoundsException("The number you've entered doesn't match the bounds.");
		} else {
			System.out.println("Yup! " + input + " is in the bounds from " + start + " to " + end + ".");
			return input;
		}

	}
}
