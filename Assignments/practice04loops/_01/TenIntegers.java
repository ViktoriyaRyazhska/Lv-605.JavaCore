package practice04loops._01;

//Create an array of ten integers. Display 

//the biggest of these numbers;
//the sum of positive numbers in the array;
//the amount of negative numbers in the array.
//What values there are more: negative or positive?

public class TenIntegers {

	public static void main(String[] args) {
		int[] array = { 1, -2, 3, -4, 5, 6, -7, 8, 9, -10 };
		int max = array[0];
		int sumPos = 0;
		int amoNeg = 0;
		int amoPos = 0;
		String most;

		for (int i : array) {
			if (i > max) {
				max = i;
			}
		}

		for (int i : array) {
			if (i > 0) {
				sumPos += i;
			}
		}

		for (int i : array) {
			if (i < 0) {
				amoNeg++;
			} else {
				amoPos++;
			}
		}

		System.out.println("Maximum array value is " + max + ".");
		System.out.println("Sum of the positive array numbers is " + sumPos + ".");
		System.out.println("Amount of negative numbers in the array is " + amoNeg + ".");

		if (amoPos > amoNeg) {
			System.out.println("The most values of the array are positive.");
		} else if (amoPos < amoNeg) {
			System.out.println("The most values of the array are negative.");
		} else {
			System.out.println("There are equal numbers of positive and negative values in the array.");
		}

	}

}
