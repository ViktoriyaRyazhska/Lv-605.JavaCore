package practice03conditions._01odds;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Odds2 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the first number to check if it's odd:");
		int first = Integer.parseInt(br.readLine());

		System.out.println("Enter the second number to check if it's odd:");
		int second = Integer.parseInt(br.readLine());

		System.out.println("Enter the third number to check if it's odd:");
		int third = Integer.parseInt(br.readLine());

		if (first % 2 != 0) {
			System.out.println(first + " is odd number.");
		}

		if (second % 2 != 0) {
			System.out.println(second + " is odd number.");
		}

		if (third % 2 != 0) {
			System.out.println(third + " is even number.");
		}

	}

}
