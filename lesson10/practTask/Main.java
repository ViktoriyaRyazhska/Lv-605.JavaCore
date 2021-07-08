package lesson10.practTask;

import java.util.regex.*;

public class Main {
	public static void main(String[] args) {
		System.out.println(task1("IT", "IT Academy"));
		task2("Roman Klymus Myronovych");
		String[] names = { "Roman", "Vasia", "Dima", "Misha", "Vika" };
		for (String n : names) {
			System.out.println(n + " " + task3(n));
		}

	}

	public static boolean task1(String one, String two) {
		return two.contains(one);
	}

	public static void task2(String name) {
		String[] names = name.split(" ");
		System.out.println(names[0] + " " + names[1].charAt(0) + "." + names[0].charAt(0) + "." + names[2].charAt(0));
		System.out.println(names[0]);
		System.out.println(names[0] + " " + names[2] + " " + names[1]);

	}

	public static boolean task3(String name) {
		String pattern = "\\w{3,15}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(name);
		return m.matches();
	}
}
