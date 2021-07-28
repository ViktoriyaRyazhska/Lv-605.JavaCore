import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11 {
	public static void main(String[] args) {
		System.out.println("Task11 start");
		try {
			checkCardNumber();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Task11 end");
	}

	private static void checkCardNumber() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter 16-digit card number without spaces:");
		if(verifyNumber(br.readLine())) {
			System.out.println("This is right number");
			return;
		} 
		System.out.println("This is wrong number");
	}

	private static boolean verifyNumber(String cardNumber) {
		if (cardNumber.length() != 16) {
			return false;
		}
		String[] numbersInString = cardNumber.split("");
		int[] numbers = new int[numbersInString.length];
		int temp;
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(numbersInString[i]);
		}
		for (int i = 0; i < numbers.length - 1; i += 2) {
			numbers[i] *= 2;
			if (numbers[i] > 9) {
				temp = numbers[i];
				numbers[i] = temp % 10;
				temp /= 10;
				numbers[i] += temp % 10;
			}
		}

		for (int n : numbers) {
			sum += n;
		}
		if (sum % 10 == 0) {
			return true;
		}
		return false;
	}

}
