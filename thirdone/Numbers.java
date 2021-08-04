package thirdone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {

	public static void main(String[] args) throws IOException {
		
		float n1;
		float n2;
		float n3;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number: ");
		n1 = Integer.parseInt(br.readLine());
		System.out.println("Enter second number: ");
		n2 = Integer.parseInt(br.readLine());
		System.out.println("Enter third number: ");
		n3 = Integer.parseInt(br.readLine());
		
		{
			if (n1 >= -5 & n1 <= 5) {
				System.out.println("The first number is belongs to the range [-5,5].");
			} else {
				System.out.println("The first number isn't belongs to the range [-5,5].");
			}
		}
		
		{
			if (n2 >= -5 & n2 <= 5) {
				System.out.println("The second number is belongs to the range [-5,5].");
			} else {
				System.out.println("The second number isn't belongs to the range [-5,5].");
			}
		}
		
		{
			if (n3 >= -5 & n3 <= 5) {
				System.out.println("The third number is belongs to the range [-5,5].");
			} else {
				System.out.println("The third numbers isn't belongs to the range [-5,5].");
			}
		}
	}

}
