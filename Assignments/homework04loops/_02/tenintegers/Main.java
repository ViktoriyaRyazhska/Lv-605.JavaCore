package homework04loops._02.tenintegers;

public class Main {

//Enter 10 integer numbers.
//Calculate the sum of first 5 elements if they are positive
//or product of last 5 element in the other case.

	public static void main(String[] args) {
		int[] integers = { 0, -5, -1, 6, 2, -7, -3, 8, 4, -9 };
		int firstFive = 0;
		int lastFive = 1;

		for (int i = 0; i < 5; i++) {
			if (integers[i] > 0) {
				firstFive += integers[i];
			}
		}

		for (int i = integers.length - 5; i < integers.length; i++) {
			lastFive *= integers[i];
		}
		
		if (firstFive > 0) {
			System.out.println("Sum of the first 5 elements is: " + firstFive + ".");
		} else {
			System.out.println("Product of the last 5 elements is: " + lastFive + ".");
		}
	}
}
