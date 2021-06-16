package homework3;

import java.io.*;

public class MaxAndMin {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] intArr = new int[3];
		for (int i = 0; i < intArr.length; i++) {
			System.out.println("Please enter " + (i + 1) + " number: ");
			try {
				intArr[i] = Integer.parseInt(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// max number output
		int max = intArr[0];
		for (int i = 1; i < intArr.length; i++) {
			if (intArr[i] > max) {
				max = intArr[i];
			}
		}
		System.out.println("Max number is: " + max);
		// min number output
		int min = intArr[0];
		for (int i = 1; i < intArr.length; i++) {
			if (intArr[i] < min) {
				min = intArr[i];
			}
		}
		System.out.println("Min number is: " + min);
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
