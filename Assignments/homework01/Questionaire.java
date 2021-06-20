package homework01;

import java.util.Scanner;

public class Questionaire {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Sup, friend. What's your name?");
		String name = scan.nextLine();
		System.out.println("Nice to meet you ;) And where do you live, " + name + '?');
		String adress = scan.nextLine();
		System.out.println("So you say your name is " + name + " and you live at " + adress + '?');
		System.out.println("Awesome!");

	}
}