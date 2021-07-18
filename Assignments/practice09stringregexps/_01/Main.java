package practice09stringregexps._01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		// 01
		String str01 = "IT";
		String str02 = "IT Academy";
		System.out.println(str02.contains(str01));

		// 02
		System.out.println();
		System.out.println("Please enter full name (Surname Name Middle name):");
		String fullName = br.readLine();
		String[] splitedFullName = fullName.split(" ");
		System.out
				.println(splitedFullName[0] + " " + splitedFullName[1].charAt(0) + " " + splitedFullName[2].charAt(0));
		System.out.println(splitedFullName[1]);
		System.out.println(splitedFullName[1] + " " + splitedFullName[2] + " " + splitedFullName[0]);

		// 03
		System.out.println();
		userNameValidation("Cresco1999"); // true
		userNameValidation("8SlVY4V%"); // false
		userNameValidation("@VKcVQ2YU#m#pzTN"); // false
		userNameValidation("07172021"); // true
		userNameValidation("Go"); // false
	}

	// method of practice task03
	public static void userNameValidation(String name) {
		boolean validity = Pattern.matches("\\w{3,15}", name);
		System.out.println("Validity of the username is " + validity);
	}
}
