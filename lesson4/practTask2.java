package lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practTask2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of the day: ");
		int dayNumber = Integer.parseInt(br.readLine());
		switch (dayNumber) {
		case 1:
			System.out.println("Monday, ��������, �����������");
			break;
		case 2:
			System.out.println("Tuesdat, ³������, �������");
			break;
		case 3:
			System.out.println("Wedensday, ������, �����");
			break;
		case 4:
			System.out.println("Thursday, ������, �������");
			break;
		case 5:
			System.out.println("Friday, �������, �������");
			break;
		case 6:
			System.out.println("Saturday, ������, �������");
			break;
		case 7:
			System.out.println("Sunday, �����, �����������");
			break;
		default:
			System.out.println("You entered the wrong number!");
			break;
		}
	}
}
