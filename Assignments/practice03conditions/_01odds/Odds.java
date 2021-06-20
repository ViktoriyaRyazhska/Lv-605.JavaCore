package practice03conditions._01odds;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Odds {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a number to check if it's even or odd:");
		if (Integer.parseInt(br.readLine()) % 2 == 0) {
			System.out.println("It is even number.");
		} else {
			System.out.println("It is odd number.");
		}

		System.out.println("Enter a number to check if it's even or odd:");
		if (Integer.parseInt(br.readLine()) % 2 == 0) {
			System.out.println("It is even number.");
		} else {
			System.out.println("It is odd number.");
		}

		System.out.println("Enter a number to check if it's even or odd:");
		if (Integer.parseInt(br.readLine()) % 2 == 0) {
			System.out.println("It is even number.");
		} else {
			System.out.println("It is odd number.");
		}
	}

}
