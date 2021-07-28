import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Task 7 is starting");
		System.out.println("Input number n and calculate n! (e.g. 5! = 1*2*3*4*5 = 120)");
		System.out.println("======================================================");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = 0;
		System.out.println("Enter numbers");
		try {
			number = Integer.parseInt(br.readLine());
		} catch (IOException a) {

			System.out.println("Wrong");

		}
		System.out.println(number);
		int product = 1;
		int y = 1;
		if (number != 0) {
			for (int i = 0; i < number; i++) {

				product = product * y;
				y++;
			}
		}
		System.out.println("answer is " + product);

	}

}
