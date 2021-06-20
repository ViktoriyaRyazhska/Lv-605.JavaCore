package practice03conditions._02weekdays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Weekdays {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of the day of the week");

		String input = br.readLine();

		switch (input) {
		case "1":
			System.out.println("Sunday / HegiJI9I / BockpeceHbe");
			break;
		case "2":
			System.out.println("Monday / /7oHegiJIok / /7oHegeJIbHuk");
			break;
		case "3":
			System.out.println("Tuesday / BiBTopok / BTopHuk");
			break;
		case "4":
			System.out.println("Wednessday / Cepega / Cpega");
			break;
		case "5":
			System.out.println("Thursday / 4etBep / 4eTBePr");
			break;
		case "6":
			System.out.println("Friday / /7\'9ITHuL|9 / /79ITHuL|a");
			break;
		case "7":
			System.out.println("Saturday / Cy6oTa / Cy66oTa");
			break;
		default:
			System.out.println("ERROR! / /7OMuJIKA! / OLL|u6KA!");
			break;
		}
	}

}
