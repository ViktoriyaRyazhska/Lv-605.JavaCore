package lesson10.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

public class Task3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Pattern p = Pattern.compile("[$]{1}[\\d]+[\\.]{1}[\\d]{2}");
		System.out.println("Enter text:");
		String text = br.readLine();
		Matcher m = p.matcher(text);
		while (m.find()) {
			System.out.print(text.substring(m.start(), m.end()) + " ");
		}
	}
}
