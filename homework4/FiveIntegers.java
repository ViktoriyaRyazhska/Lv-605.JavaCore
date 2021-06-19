package homework4;

import java.io.*;

public class FiveIntegers {

	public static void secondPositive(int[] intArray) {
		int posCounter = 0;
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > 0) {
				if(posCounter++ == 1) {
					System.out.println("Position of second positive number is: " + i);
					break;
				}
			}
		}
		if(posCounter < 2) {
			System.out.println("There are less then 2 positive numbers.");
		}
	}
	
	public static void min(int[] intArray) {
		int min = intArray[0];
		int minPos = 0;
		for (int i = 1; i < intArray.length; i++) {
			if (intArray[i] < min) {
				min = intArray[i];
				minPos = i;
			}
		}
		System.out.println("Minimum is: " + min + ". It's position is: " + minPos);
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] intArray = new int[5];
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Please enter [" + i + "] integer: ");
			try {
				intArray[i] = Integer.parseInt(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		secondPositive(intArray);
		min(intArray);
		
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
