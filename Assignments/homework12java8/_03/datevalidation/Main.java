package homework12java8._03.datevalidation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class Main {

	public static boolean dateValidator(String date) {

		boolean valid = false;

		try {
			LocalDate.parse(date, DateTimeFormatter.ofPattern("MM.dd.uu").withResolverStyle(ResolverStyle.STRICT));
			valid = true;
		} catch (DateTimeParseException e) {
			System.err.println(e.getMessage());
			valid = false;
		}
		return valid;
	}

	public static void main(String[] args) {
		System.out.println(dateValidator("10.31.89"));
	}
}