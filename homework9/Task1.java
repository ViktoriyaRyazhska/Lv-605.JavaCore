package homework9;

import java.io.*;

public class Task1 {
	private static String input;

	public static void main(String[] args) throws IOException {

		userInput();

		stringProcessor();

	}

	public static void userInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a sentence of five words: ");
		input = br.readLine();
		System.out.println(input);
		br.close();
	}

	public static void stringProcessor() {
		String[] strArr;
		strArr = input.split(" ");
		String theLongest = strArr[0];
		for (int i = 1; i < strArr.length; i++) {
			if (strArr[i].length() > theLongest.length()) {
				theLongest = strArr[i];
			}
		}
		System.out.println("The longest word is: " + theLongest);
		System.out.println("Number of letters: " + theLongest.length());
		if (strArr.length > 1) {
			StringBuilder stringBuilder = new StringBuilder(strArr[1]);
			System.out.println("Second word in reversed order: " + stringBuilder.reverse());
		} else {
			System.err.println("There are less than 2 words!");
			throw new IndexOutOfBoundsException();
		}
	}
}
