package homework04loops._01.months;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

//Ask user to enter the number of month.
//Read the value and write the amount of days in this month
//(create array with the amount of days of each month).

	public static void main(String[] args) throws Exception{
		int[] monthsDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the month's number:");
		int monthNumber = Integer.parseInt(br.readLine());
		
		if (monthNumber <= monthsDays.length && monthNumber > 0) {
			System.out.println("There are " + monthsDays[monthNumber - 1] + " days in this month.");
		} else {
			System.out.println("There is no month with such number.");
		}
	}
}