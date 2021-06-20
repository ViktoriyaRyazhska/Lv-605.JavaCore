package homework03conditions._01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//read 3 float numbers and check: are they all belong to the range [-5,5];

public class FloatsCheck {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number! Any float number! Actually 3 of them, please:");
		float one = Float.parseFloat(br.readLine());
		float two = Float.parseFloat(br.readLine());
		float three = Float.parseFloat(br.readLine());
		if (one >= -5 && one <= 5 && two >= -5 && two <= 5 && three >= -5 && three <= 5) {
			System.out.println("BINGO!");
		} else {
			System.out.println("Too bad, try another time =(");
		}

	}

}
