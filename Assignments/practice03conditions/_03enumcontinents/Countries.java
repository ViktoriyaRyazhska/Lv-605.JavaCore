package practice03conditions._03enumcontinents;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Countries {

	public static void main(String[] args) throws Exception {

		System.out.println();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the name of a country to check it's continent:");

		String country = br.readLine();

		switch (country.toLowerCase()) {
		case "nigeria":
		case "ethiopia":
		case "gypt":
			System.out.println("The continent is " + Continents.AFRICA + ".");
			break;
		case "japan":
		case "china":
		case "indonesia":
			System.out.println("The continent is " + Continents.ASIA + ".");
			break;
		case "russia":
		case "germany":
		case "united kingdom":
			System.out.println("The continent is " + Continents.EUROPE + ".");
			break;
		case "united states":
		case "usa":
		case "mexico":
		case "canada":
			System.out.println("The continent is " + Continents.NORTH_AMERICA + ".");
			break;
		case "brazil":
		case "columbia":
		case "argentina":
			System.out.println("The continent is " + Continents.SOUTH_AMERICA + ".");
			break;
		default:
			System.out.println("There is no such country in on my list :(");

		}
	}

}
