package homework04loops._03.fiveintegers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

//	Enter 5 integer numbers. Find 
//	position of the second positive number;
//	minimum and its position in the array.
//	Organize entering integers until the first negative number. Count the product of all entered even numbers.

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] integers = { -2, -4, 1, 5, 3 };
		int secondPos = 0;
		int secondPosCount = 0;
		int min = 0;
		int minPos = 0;
//		int inputCount = 0;
		double input = 0;
		double inputProd = 1;

		for (int i = 0; i < integers.length; i++) {
			if (integers[i] > 0) {
				secondPos = integers[i];
				secondPosCount++;
				if (secondPosCount == 2) {
					break;
				}
			}
		}

		for (int j = 0; j < integers.length; j++) {
			if (integers[j] < min) {
				min = integers[j];
				minPos = j;
			}
		}

		System.out.println("Position of the second positive number is: " + secondPos + ".");
		System.out.println("Minimum number in the array is: " + min + " and it's position is: " + minPos + ".");

		while (input >= 0) {
			System.out.println("Please enter some numbers. You can use negative ones ;-)");
			input = Double.parseDouble(br.readLine());
//			inputCount++;
			if (input % 2 == 0) {
				inputProd *= input;
				if (input < 0) {
					break;
				}
			}
		}
//		System.out.println(inputCount);
		System.out.println("Product of all entered even numbers is: " + inputProd + ".");
	}
}
