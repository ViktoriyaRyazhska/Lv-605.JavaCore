package homework12java8._02.crypt;

import java.util.stream.Collectors;

// Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
// Method encrypt should take a string and return coded string where every letter is moved
// on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should return decoded value

public class Main {

	public static String encrypt(String s, int n) {
		String encrypted = s.chars().mapToObj(e -> ((char) (e + n))).map(String::valueOf).collect(Collectors.joining());
		return encrypted;
	}

	public static String decrypt(String s, int n) {
		String decrypted = s.chars().mapToObj(e -> ((char) (e - n))).map(String::valueOf).collect(Collectors.joining());
		return decrypted;
	}

	public static void main(String[] args) {

		int offset = 3;
		String phrase = "abc";
		String encrypt = encrypt(phrase, offset);
		String decrypt = decrypt(encrypt, offset);

		System.out.println(encrypt);
		System.out.println(decrypt);
	}
}
