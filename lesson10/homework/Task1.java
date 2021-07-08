package lesson10.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] words = br.readLine().split(" ");
		String longestWord = "";
		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}

		System.out.println("The longest word: " + longestWord + ", number of letters: " + longestWord.length());
		StringBuilder sb = new StringBuilder(words[1]);
		System.out.println("Second word reversed " + sb.reverse().toString());
	}
}
