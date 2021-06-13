package homework1;

import java.io.*;

public class Task03 {

	public static void main(String[] args) {
		double c1 = 0.0, c2 = 0.0, c3 = 0.0;
		double t1 = 0.0, t2 = 0.0, t3 = 0.0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Please enter the price for a phone calls from Ukraine (units per minute): ");
			c1 = Double.parseDouble(br.readLine());
			System.out.println("Please enter the price for a phone calls from USA (units per minute): ");
			c2 = Double.parseDouble(br.readLine());
			System.out.println("Please enter the price for a phone calls from Australia (units per minute): ");
			c3 = Double.parseDouble(br.readLine());
			System.out.println("Please enter the duration for all the phone calls from Ukraine (minutes): ");
			t1 = Double.parseDouble(br.readLine());
			System.out.println("Please enter the duration for all the phone calls from USA (minutes): ");
			t2 = Double.parseDouble(br.readLine());
			System.out.println("Please enter the duration for all the phone calls from Australia (minutes): ");
			t3 = Double.parseDouble(br.readLine());
			System.out.println("The cost of the calls from Ukraine is " + c1 * t1 + ".");
			System.out.println("The cost of the calls from USA is " + c2 * t2 + ".");
			System.out.println("The cost of the calls from Australia is " + c3 * t3 + ".");
			System.out.println("The cost of all the calls together is " +((c1 * t1)+(c2 * t2)+(c3 * t3))+ ".");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
