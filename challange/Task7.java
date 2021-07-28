package challange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
	public static void main(String[] args) {
		int number = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter number: ");
		try {
			number = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		calculateFactorial(number);

	}
	public static void calculateFactorial(int number) {
		int result = 1;
		for(int i=1; i<=number; i++) {
			result *= i;
		}
		System.out.println(result);
		
	}
}
