package homework10.Task2;

import java.io.*;

public class Task2 {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		int start = 1;
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(start = readNumber(start, 100));
			} catch (OutOfRangeException e) {
				System.err.println(e.getMessage());
			} 
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int readNumber(int start, int end) throws OutOfRangeException {
		int number = 0;
		System.out.println("Please enter a number [" + start + ", " + end + "] :");
		try {
			number = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			System.err.println("IOException!");
		} catch(NumberFormatException e) {
			System.err.println("Not a number!!!");
		}
		if (number >= start && number <= end) {
			return number;
		}
		throw new OutOfRangeException("You have entered out of the defined range number!");
	}
}
