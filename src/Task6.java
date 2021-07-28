import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {

	public static void main(String[] args) {
		System.out.println("Task 6 is starting");
		System.out.println("Input text and calculate number of words in this text");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int count = 0;
		System.out.println("Enter word ");
		try {
			str = br.readLine();
		} catch (IOException a) {

			System.out.println("Wrong");

		}

		if (str.length() != 0) {
			count++;

			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {

					count++;
				}
			}
		}
		System.out.println("You enter " + count + "word ");
	}
}
