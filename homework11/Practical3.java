package homework11;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Practical3 {
	private static File myText = new File("homework11/mytext.txt");
	private static ArrayList<String> textFromFile = new ArrayList<String>();
	private static Set<Integer> stringLength = new TreeSet<>();

	public static void main(String[] args) {

		try (Scanner myReader = new Scanner(myText)) {
			while (myReader.hasNextLine()) {
				textFromFile.add(myReader.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.err.println("File not found!");
			e.printStackTrace();
		}

		Iterator<String> it = textFromFile.iterator();
		while (it.hasNext()) {
			String current = it.next();
			System.out.print("[String length: " + current.length() + "] ");
			System.out.println(current);
			stringLength.add(current.length());
		}
		System.out.println("The shortest line: " + stringLength.toArray()[0]);
		System.out.println("The longest line: " + stringLength.toArray()[stringLength.toArray().length - 1]);

		printLineWithWord("lay");
	}

	public static void printLineWithWord(String word) {
		Pattern p = Pattern.compile(("\\b" + word + "\\b"));
		Iterator<String> it = textFromFile.iterator();
		while (it.hasNext()) {
			String current = it.next();
			Matcher m = p.matcher(current);
			if (m.find()) {
				System.out.println(current);
			}
		}
	}
}
