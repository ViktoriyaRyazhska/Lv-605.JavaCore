package lesson12.practTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\R\\git\\Lv-605.JavaCore\\input");

		BufferedReader br = new BufferedReader(new FileReader(file));

		List<String> listOfLines = new ArrayList<>();
		String line;
		try {
			while ((line = br.readLine()) != null) {
				listOfLines.add(line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		int i = 1;
		for (String l : listOfLines) {
			System.out.println("Line №" + i + ", number of symbols:" + countSymbolsInLine(l));
			i++;
		}
		System.out.println("№ of longest: " + (findLongestLine(listOfLines) + 1));
		System.out.println("№ of shortest: " + (findShortestLine(listOfLines) + 1));
		findLinesWithWord(listOfLines, "Lorem");
	}

	public static int countSymbolsInLine(String line) {
		Pattern p = Pattern.compile("\\S+");
		Matcher m = null;
		int numberOfSymbols;
		m = p.matcher(line);
		numberOfSymbols = 0;
		while (m.find()) {
			numberOfSymbols += m.group().length();
		}
		return numberOfSymbols;
	}

	public static int findLongestLine(List<String> lines) {
		int longestIndex = 0;
		for (int i = 0; i < lines.size(); i++) {
			if (lines.get(i).length() > lines.get(longestIndex).length()) {
				longestIndex = i;
			}
		}
		return longestIndex;
	}

	public static int findShortestLine(List<String> lines) {
		int shortestIndex = 0;
		for (int i = 0; i < lines.size(); i++) {
			if (lines.get(i).length() < lines.get(shortestIndex).length()) {
				shortestIndex = i;
			}
		}
		return shortestIndex;
	}

	public static void findLinesWithWord(List<String> lines, String word) {
		Pattern p = Pattern.compile("\\w+");
		Matcher m = null;
		boolean hasAWordInLine;
		for (String line : lines) {
			hasAWordInLine = true;
			m = p.matcher(line);
			while (m.find()) {
				if (!m.group().equals(word)) {
					hasAWordInLine = false;
					break;
				}
			}
			if (!hasAWordInLine) {
				continue;
			}
			System.out.println(line);
		}

	}
}
