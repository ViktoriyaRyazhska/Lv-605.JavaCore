package homework9;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Task3 {
	private static String input;

	public static void main(String[] args) throws IOException {

		userInput();

		usCurrencyFormatter();

	}

	public static void userInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a text with US currency occurrences: ");
		input = br.readLine();
		System.out.println(input);
		br.close();
	}

	public static void usCurrencyFormatter() {
		Pattern pattern = Pattern.compile("[\\$][\\d]+.[\\d]{2}"); 
		Matcher matcher = pattern.matcher(input);
		List<String> matches = new ArrayList<String>();
		while (matcher.find()) {
			matches.add(input.substring(matcher.start(), matcher.end()));
		}
		System.out.println(matches); 
	}
}
