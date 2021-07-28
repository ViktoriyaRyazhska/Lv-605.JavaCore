package challange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	public static void main(String[] args) {
		int dollarCost = 0;
		int sumOfMoney = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter cost of dollar: ");
		try {
			dollarCost = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter sum of money in gryvna: ");
		try {
			sumOfMoney = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("You can buy " +sumOfMoney/dollarCost+ " dollars."  );
		
	}

}
