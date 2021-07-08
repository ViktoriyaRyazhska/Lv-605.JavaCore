package lesson10.homework;

import java.io.IOException;

public class Task2 {
	public static void main(String[] args) throws IOException {
		String s = "I   lo    ve       Java";
		System.out.println(s.replaceAll("[ ]{2,}", " "));
	}
}
