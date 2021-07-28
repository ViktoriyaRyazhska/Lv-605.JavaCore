import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		System.out.println("Task2 start");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word to check if it's a palindrome:");
		String string = sc.nextLine();
		boolean flag = true;

		string = string.toLowerCase();

		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.print(string + " is a palindrome");
		} else {
			System.out.print(string + " is not a palindrome");
		}

		System.out.println("\nTask2 end");
	}
}
