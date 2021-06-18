package homework4;

import java.io.*;
import java.util.Arrays;

public class ArrayOfIntegers {

	public static void MaxInteger(int[] intArray) {
		Arrays.sort(intArray);
		System.out.println("The biggest integer is : " + intArray[intArray.length - 1]);
	}

	public static void SumOfPositive(int[] intArray) {
		int result = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > 0) {
				result += intArray[i];
			}
		}
		System.out.println("The sum of all positive numbers is: " + result);
	}
	
	public static int AmmountOfNegative(int[] intArray) {
		int negativeCounter = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] < 0) {
				negativeCounter++;
			}
		}
		System.out.println("The ammount of negative numbers is: " +negativeCounter);
		return negativeCounter;

	}
	
	public static void NegativeOrPositive(int[] intArray) {
		int negativeAmmount = AmmountOfNegative(intArray);
		int positiveAmmount = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > 0) {
				positiveAmmount++;
			}
		}
		if(negativeAmmount > positiveAmmount) {
			System.out.println("There are more negative numbers in array.");
		}else if(negativeAmmount < positiveAmmount){
			System.out.println("There are more positive numbers in array.");
		}else {
			System.out.println("The numbers of negative and positive are equal.");
		}
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] intArray = new int[10];
		for (int j = 0; j < intArray.length; j++) {
			System.out.println("Please enter " + (j + 1) + " number.");
			try {
				intArray[j] = Integer.parseInt(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		MaxInteger(intArray);
		SumOfPositive(intArray);
		NegativeOrPositive(intArray);
	}

}
