package firstone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class flowerbed {

	public static void main(String[] args) throws IOException {
		int x = 2;
		double pi = 3.14159;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a radius: ");
		int y = Integer.parseInt(br.readLine());
		
		System.out.println("Perimeter: " + x * pi * y);
		System.out.println("Area: " + y * y * pi);
		
	}
}