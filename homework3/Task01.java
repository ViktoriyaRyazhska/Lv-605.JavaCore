package homework3;

import java.io.*;

public class Task01 {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		int oddNumbersCount = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// for loop which writes users input to the empty numbers array
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Please enter " + (i + 1) + " number:");
			try {
				numbers[i] = Integer.parseInt(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// foreach loop which checks every number in the array and 
		// if it is odd - outputs to the console.
		for (int i : numbers) {
			if(i % 2 != 0) {
				oddNumbersCount++;
				System.out.println(i + " is an odd number.");
			}
		}
		//Final output with the count of odd numbers
		if(oddNumbersCount == 0) {
			System.out.println("There is no odd numbers!");
		} else {
			System.out.println(oddNumbersCount + " of your numbers are odd.");
		}
		//BufferedReader closure
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
