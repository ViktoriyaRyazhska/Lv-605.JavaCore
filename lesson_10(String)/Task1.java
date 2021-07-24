package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Task1 {


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the five words to make a sentance");

		String[] sentence = br.readLine().split(" ");
		//System.out.println(sentence);
		String theLongestWord = "";
		
		for (String word : sentence) {
			if ( word.length() > theLongestWord.length()) {
				theLongestWord = word;
			}
		}
		
		System.out.println("The Longest word in sentence is - " + theLongestWord + " it's amout of letter is - " + theLongestWord.length());
		StringBuilder reverseW = new StringBuilder(sentence[1]);
		System.out.println("The second word in sentence written in reverse - " + reverseW.reverse());

	}

}
