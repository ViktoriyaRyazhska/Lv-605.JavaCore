package practice11threadsIO._01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// #1
		for (int i = 0; i++ < 10;) {
			System.out.println("I study Java");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// #2
		Thread t1 = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i++ < 5;) {
					System.out.println("Hello, world");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		Thread t2 = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i++ < 5;) {
					System.out.println("Peace in the peace");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("My name is …");

		// #3
		ArrayList<String> text = new ArrayList<>();
		File file = new File("test.txt");
		String str = null;

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			while ((str = br.readLine()) != null) {
				text.add(str);
			}
		} catch (IOException e) {
			System.out.println("File not found: " + file);
		}

		// #3.1
		int longest = text.get(0).length();
		int shortest = text.get(0).length();
		for (int i = 0; i < text.size(); i++) {
			System.out.println("The number of symbols in line " + (i + 1) + " is " + text.get(i).length());

			// #3.2
			if (text.get(i).length() > longest) {
				longest = text.get(i).length();
			}

			if (text.get(i).length() < shortest) {
				shortest = text.get(i).length();
			}
		}

		System.out.println("\nThe longest line is: " + longest);
		System.out.println("The shortest line is: " + shortest);
		System.out.println();

		// #3.3
		String contains = "her";
		for (String s : text) {
			if (s.contains(contains)) {
				System.out.println(s);
			}
		}
	}
}
