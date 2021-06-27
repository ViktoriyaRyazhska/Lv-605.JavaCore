package homewrok1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task1 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("Enter the number of the month");
		int monthN = Integer.parseInt(br.readLine());
		
		switch (monthN) {
		case 1:
			System.out.println("The amount of days in this month " + days[0] );
		break;
		case 2:
			System.out.println("The amount of days in this month " + days[1] );
			break;
		case 3:
			System.out.println("The amount of days in this month " + days[2] );
			break;
		case 4:
			System.out.println("The amount of days in this month " + days[3] );
			break;
		case 5:
			System.out.println("The amount of days in this month " + days[4] );
			break;
		case 6:
			System.out.println("The amount of days in this month " + days[5] );
			break;
		case 7:
			System.out.println("The amount of days in this month " + days[6] );
		break;
		case 8:
			System.out.println("The amount of days in this month " + days[7] );
			break;
		case 9:
			System.out.println("The amount of days in this month " + days[8] );
			break;
		case 10:
			System.out.println("The amount of days in this month " + days[9] );
			break;
		case 11:
			System.out.println("The amount of days in this month " + days[10] );
			break;
		case 12:
			System.out.println("The amount of days in this month " + days[11] );
			break;
			default:
				System.out.println("There isn't month with this number");
				break;
				
				
				
		}
	
		
	}
}
