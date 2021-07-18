package homework09stringregexps._01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		// 01
		// Enter in the console sentence of five words.
		// display the longest word in the sentence
		// determine the number of its letters
		// bring the second word in reverse order
		System.out.println("Please enter the sentence of five words:");
		String sentence = br.readLine();
		String[] splitSentence = sentence.split(" ");
		int length;
		String longest = null;
		for (int i = 0; i < splitSentence.length; i++) {
			if (splitSentence[i].length() >= 0) {
				length = splitSentence[i].length();
				longest = splitSentence[i];
			}
		}
		System.out.println("The longest word is " + longest);

		// 02
		// Enter a sentence that contains the words between more than one space.
		// Convert all spaces, consecutive, one.
		// For example, if we introduce the sentence
		// "I am learning Java Core», we have to get the "I'm learning Java Core»
		String str00 = "I    am      learning     Java   Core.";
		String str01 = str00.replaceAll(" {2,}", " ");
		String str02 = str01.replace("I am", "I'm");
		System.out.println(str02);

		// 03
		// Implement a pattern for US currency: the first symbol "$",
		// then any number of digits, dot and two digits after the dot.
		// Enter the text from the console that contains several occurrences of US
		// currency.
		// Display all occurrences on the screen.
		String text = "$4.411.45 $011124,211,45 $0 $34.2"; // output: $4.41 $011124,21 $0 $34.2
		Matcher m = Pattern.compile("\\$(\\d*)(\\.\\d{0,2})*(\\,\\d{0,2})*").matcher(text);
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
