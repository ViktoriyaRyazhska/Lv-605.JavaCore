package lesson12.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lesson12.practTask.Task3;

public class Task4 {
	public static void main(String[] args) throws IOException {
		File file1 = new File("C:\\Users\\R\\git\\Lv-605.JavaCore\\file1");
		File file2 = new File("C:\\Users\\R\\git\\Lv-605.JavaCore\\file2");
		System.out.println(file2.createNewFile());
		BufferedReader br = new BufferedReader(new FileReader(file1));
		BufferedWriter writer = new BufferedWriter(new FileWriter(file2));

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

		writer.append("Number of lines: " + listOfLines.size()).append(System.lineSeparator())
				// Тут я звертаюсь до методу з файлу Task3 в пакеті lesson12.practTask, який
				// повертає індекс найдошої строки
				.append(listOfLines.get(Task3.findLongestLine(listOfLines))).append(System.lineSeparator())
				.append("Name: " + findName(listOfLines)).append(System.lineSeparator())
				.append("Birthday date: " + findBirthdayDate(listOfLines)).close();
	}

	public static String findName(List<String> lines) {
		Pattern p = Pattern.compile("(?<=name is )\\w+");
		Matcher m = null;
		for (String line : lines) {
			m = p.matcher(line);
			if (m.find()) {
				return m.group();
			}
		}
		return null;
	}

	public static String findBirthdayDate(List<String> lines) {
		Pattern p = Pattern.compile("\\d{2}.\\d{2}.\\d{4}");
		Matcher m = null;
		for (String line : lines) {
			m = p.matcher(line);
			if (m.find()) {
				return m.group();
			}
		}
		return null;
	}
}
