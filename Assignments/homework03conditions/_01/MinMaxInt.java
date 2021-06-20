package homework03conditions._01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//read 3 integer numbers and write max and min of them

public class MinMaxInt {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any 3 numbers and you'll become very rich:");
		int one = Integer.parseInt(br.readLine());
		int two = Integer.parseInt(br.readLine());
		int three = Integer.parseInt(br.readLine());

		int max = one;
		int min = one;

		if (two > max) {
			max = two;
		} else {
			min = two;
		}
		if (three > max) {
			max = three;
		} else {
			min = three;
		}
		
		System.out.println(max + " is the maximum number.");
		System.out.println(min + " is the minimum number.");
	}

}
