package homework12;
/**
 * Copyright (c) Non Existing Company ;=)
 * @author Pavlo
 */
public class Homework2 {
	public static void main(String[] args) {
		// Test strings:
		String simple = "My simple string to encrypt.";
		String mainString = "One morning, when Gregor Samsa woke from troubled dreams, "
				+ "he found himself transformed in his bed into a horrible vermin. "
				+ "He lay on his armour-like back, and if he lifted his head a little "
				+ "he could see his brown belly, slightly domed and divided by arches "
				+ "into stiff sections. The bedding was hardly able to cover "
				+ "it and seemed ready to slide off any moment.";
		try {
			simple = encrypt(simple, 10);
			System.out.println(simple);

			mainString = encrypt(mainString, 14);
			System.out.println(mainString);

			simple = decrypt(simple, 10);
			System.out.println(simple);

			mainString = decrypt(mainString, 14);
			System.out.println(mainString);

		} catch (WrongKeyException e) {
			e.getMessage();
			e.printStackTrace();
		}

	}
	/**
	 * <i>This method encrypts string by a Caesar cipher.</i>
	 * @param s initial string
	 * @param n is a key for encrypting.
	 * n should be from 1 to 25 because in other cases 
	 * encryption doesn't make sense.
	 * @return encrypted input string.
	 * @throws WrongKeyException
	 */
	public static String encrypt(String s, int n) throws WrongKeyException {
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		if ((n < 0) || (n > 25)) {
			throw new WrongKeyException("n should be from 1 to 25");
		}
		String result = "";
		for (char c : s.toCharArray()) {
			// A-Z -> 65 - 90
			if ((c >= 65) && (c <= 90)) {
				result += upperCase.charAt((c - 65 + n) % upperCase.length());
				// a-z -> 97 - 122
			} else if ((c >= 97) && (c <= 122)) {
				result += lowerCase.charAt((c - 97 + n) % lowerCase.length());
			} else {
				result += c;
			}
		}
		return result;
	}

	public static String decrypt(String s, int n) throws WrongKeyException {
		// To decrypt we can use the same encrypt method with different parameters
		// making a circle through all the alphabet:
		return encrypt(s, 26 - n);
	}
}

class WrongKeyException extends Exception {
	WrongKeyException(String msg) {
		super(msg);
	}
}
