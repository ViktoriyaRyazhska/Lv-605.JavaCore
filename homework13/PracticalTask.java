package homework13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			charactersCount();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void charactersCount() throws IOException {
		int countCharacters = 0;
		String testWord;
		String character = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input word");
		testWord = br.readLine();
		System.out.println("Input character");
		character = br.readLine();
		for (int i = 0; i < testWord.length(); i++) {
			String currentCharacter = testWord.substring(i, i + 1);
			if (character.equals(currentCharacter))
				countCharacters++;
		}
		System.out.println(
				"There are " + countCharacters + " '" + character + "' characters in the word \"" + testWord + "\".");
	}
}
