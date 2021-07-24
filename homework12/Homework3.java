package homework12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Homework3 {

	public static void main(String[] args) {
		//testing the method:
		System.out.println(isValidStrict("01.12.215"));
		System.out.println(isValidStrict("01.12.21"));
		System.out.println(isValidStrict("1.12.21"));
		System.out.println(isValidStrict("01.1.21"));
		System.out.println(isValidStrict("01.12.14"));
	}
	
	public static boolean isValidStrict(String input) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
		try {
			LocalDate.parse(input, formatter);
			return true;
		}catch (DateTimeParseException e){
			System.err.print("Date is not valid! ");
		}
		return false;
	}
}
