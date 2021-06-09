package softserve.academy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Perimeter {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hi I can calculate the perimeter and area of circle");
		System.out.println("Please put the radius in meters: ");
		double radius = Double.parseDouble(br.readLine());
		System.out.println("Your radius: " + radius + " meters");
		double area = Math.PI * Math.pow(radius,2) ;;
		System.out.println("Your area: " + area + " meters");
		double perimeter = 2 * Math.PI * radius;;
		System.out.println("Your perimeter: " + perimeter + " meters");
	}

}
/*
 * Flower bed is shaped like a circle.
   Calculate the perimeter and area by entering the radius. Output obtained results.
 */
