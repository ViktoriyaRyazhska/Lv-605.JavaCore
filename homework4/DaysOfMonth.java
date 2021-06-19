package homework4;

import java.io.*;

public class DaysOfMonth {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.println("Please enter the number of month: ");
		try {
			System.out.println("Amount of days in this month: " 
					+ daysInMonth[Integer.parseInt(br.readLine())-1]);
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
