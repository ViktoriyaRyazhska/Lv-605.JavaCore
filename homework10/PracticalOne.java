package homework10;

import java.io.*;

class NegativeValueException extends Exception {
	public NegativeValueException() {
	}
	public NegativeValueException(String msg) {
		super(msg);
	}
}

public class PracticalOne {
	public static int squareRectangle(int a, int b) throws NegativeValueException {
		if (a >= 0 && b >= 0) {
			return a * b;
		} else {
			throw new NegativeValueException("Negative value!");
		}
	}

	public static void main(String[] args) {
		int a = 0, b = 0;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Please enter a: ");
			a = Integer.parseInt(br.readLine());
			System.out.println("Please enter b: ");
			b = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.err.println("Number format exception!!!");
			e.printStackTrace();
		}
		try {
			System.out.println("Result: " + PracticalOne.squareRectangle(a, b));
		} catch (NegativeValueException e) {
			System.err.println("You have entered negative value!");
			e.printStackTrace();
		}
	}

}
