package homework4;

import java.io.*;

public class TenIntNumbers {
	
	public static boolean CheckFirstFive(int[] intArray) {
		boolean isPositive = true;
		for (int i = 0; i < 5; i++) {
			if(intArray[i] < 0) {
				isPositive = false;
				break;
			}
		}
		return isPositive;
	}
	
	public static void Sum(int[] intArray) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += intArray[i];
		}
		System.out.println("The sum of first five is: " + sum);
	}
	
	public static void ProductOfLastFive(int[] intArray) {
		int prod = 1;
		for (int i = 5; i < intArray.length; i++) {
			prod *= intArray[i];
		}
		System.out.println("The product of last 5 elements is: " + prod);
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] intArray = new int[10];
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Please enter " + (i + 1) + " integer: ");
			try {
				intArray[i] = Integer.parseInt(br.readLine());
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(CheckFirstFive(intArray)) {
			Sum(intArray);
		}else {
			ProductOfLastFive(intArray);
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
