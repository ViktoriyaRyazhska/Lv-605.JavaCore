package forthone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fiveInteg {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
		int[] fnumb = new int[5];

		for (int i = 0; i < fnumb.length; i++) {
			System.out.println("Enter");
			fnumb[i] = Integer.parseInt(br.readLine());
			if (fnumb[i] < 0) {
				break;
			}
		}
		
		for (int i = 0; i < fnumb.length; i++) {
			if (fnumb[i] > 0 && i < 2 && i > 0) {
			System.out.println("Second positive number: " + fnumb[i] + ". Index: " + i);
			}
		}
		
		int min = fnumb[0];
		int minIndex = 0;
		for (int i = 0; i < fnumb.length; i++) {
			if (min > fnumb[i]) {
				min = fnumb[i];
				minIndex = i; {
				System.out.println("Minimum: " + min + " and it's index: "+ minIndex);
			}
			}
			else {
				System.out.println("Minimum: " + fnumb[0] + " and it's index: " + minIndex);
			}
		}
		
		int product = 1;
		for(int i = 0; i < fnumb.length; i++) {
			if (fnumb[i] % 2 == 0) {
			product *= fnumb[i]; {
			System.out.println("The product of 5 numbers: " + product + ".");
			}
		}
	}
}
}