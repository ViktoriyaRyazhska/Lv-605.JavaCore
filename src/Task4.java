import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		System.out.println("Task2 start");

		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = sc.nextLine();

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
				count++;
			}
		}
		System.out.print("Number of vowels in the given sentence is " + count + ".");

		System.out.println("\nTask2 end");
	}
}
