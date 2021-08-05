package forthone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class amOfDays {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number of month you want to discover an amount of days:");
		int amountOfDays = Integer.parseInt(br.readLine());
		
		int monthDays[] = new int[12];
		monthDays[0] = 31;
		monthDays[1] = 28;
		monthDays[2] = 31;
		monthDays[3] = 30;
		monthDays[4] = 31;
		monthDays[5] = 30;
		monthDays[6] = 31;
		monthDays[7] = 31;
		monthDays[8] = 30;
		monthDays[9] = 31;
		monthDays[10] = 30;
		monthDays[11] = 31;
		
		switch (amountOfDays) {
		case 1:
			System.out.println("In the " + amountOfDays + " month is " + monthDays[0] + " days, and it's January.");
			break;
		case 2:
			System.out.println("In the " + amountOfDays + " month is " + monthDays[1] + " days, and it's February.");
			break;
		case 3:
			System.out.println("In the " + amountOfDays + " month is " + monthDays[2] + " days, and it's March.");
			break;
		case 4:
			System.out.println("In the " + amountOfDays + " month is " + monthDays[3] + " days, and it's April.");
			break;
		case 5:
			System.out.println("In the " + amountOfDays + " month is " + monthDays[4] + " days, and it's May.");
			break;
		case 6:
			System.out.println("In the " + amountOfDays + " month is " + monthDays[5] + " days, and it's June.");
			break;
		case 7:
			System.out.println("In the " + amountOfDays + " month is " + monthDays[6] + " days, and it's July.");
			break;
		case 8:
			System.out.println("In the " + amountOfDays + " month is " + monthDays[7] + " days, and it's August.");
			break;
		case 9:
			System.out.println("In the " + amountOfDays + " month is " + monthDays[8] + " days, and it's September.");
			break;
		case 10:
			System.out.println("In the " + amountOfDays + " month is " + monthDays[9] + " days, and it's October.");
			break;
		case 11:
			System.out.println("In the " + amountOfDays + " month is " + monthDays[10] + " days, and it's Nuvember.");
			break;
		case 12:
			System.out.println("In the " + amountOfDays + " month is " + monthDays[11] + " days, and it's December.");
			break;
		}
	}
}
