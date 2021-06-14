package homework3;

import java.io.*;

public class Task02 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int dayNumber = 0;
		System.out.println("Please enter the number of the day of the week: ");
		try {
			dayNumber = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		switch(dayNumber) {
			case 1:
				System.out.println("Понеділок, Monday");
				break;
			case 2:
				System.out.println("Вівторок, Tuesday");
				break;
			case 3:
				System.out.println("Середа, Wednesday");
				break;
			case 4:
				System.out.println("Четвер, Thursday");
				break;
			case 5:
				System.out.println("П'ятниця, Friday");
				break;
			case 6:
				System.out.println("Субота, Saturday");
				break;
			case 7:
				System.out.println("Неділя, Sunday");
				break;
			default:
				System.out.println("You nave entered wrong day of the week number!");
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
