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
			System.out.println("Monday, Понеділок, Понедельник");
		      break;
		case 2:
		      System.out.println("Tuesdat, Вівторок, Вторник");
		      break;
		case 3:
		      System.out.println("Wedensday, Середа, Среда");
		      break;
		case 4:
		      System.out.println("Thursday, Четвер, Четверг");
		      break;
		case 5:
		      System.out.println("Friday, Пятниця, Пятница");
		      break;
		case 6:
		      System.out.println("Saturday, Субота, Суббота");
		      break;
		case 7:
		      System.out.println("Sunday, Неділя, Воскресение");
		      break;
		default:
		      System.out.println("You entered the wrong number!");
			break;
		}
	}
}
