import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {

	public static void main(String[] args) {
		System.out.println("Task 7 is starting");
		System.out.println("Input numberber in range from 1 to 1 000 000 and output this numberber in English");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = 0;
		int len = 0;

		System.out.println("Enter numberbers");
		try {
			number = Integer.parseInt(br.readLine());
		} catch (IOException a) {

			System.out.println("Wrong");

		}
		len = getCounts(number);
		System.out.println(len);
		String[] ones = { "", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten",
				" eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen",
				" nineteen" };
		String[] tens = { "", "", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty",
				" ninety" };
		String hundred = "hundred";
		String to = "hundred";
		String million = "million";

		if (number == 0) {
			System.out.println("zero");
		}

		if (number < 20) {

			System.out.println(ones[number]);
		}

		if (len == 3) {
			System.out.println();
		}
	}

	public static int getCounts(int number) {
		return String.valueOf(Math.abs(number)).length();
	}

}
