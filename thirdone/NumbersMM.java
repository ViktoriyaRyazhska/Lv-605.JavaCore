package thirdone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersMM {

	public static void main(String[] args) throws IOException {
		
		int n1;
		int n2;
		int n3;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number: ");
		n1 = Integer.parseInt(br.readLine());
		System.out.println("Enter second number: ");
		n2 = Integer.parseInt(br.readLine());
		System.out.println("Enter third number: ");
		n3 = Integer.parseInt(br.readLine());
		
		{
			if (n1 > n2 && n1 > n3 && n3 > n2) {
				System.out.println(n1 + " is a max; " + n2 + " is a min.");
		}
		}
			
		{
			if (n2 > n1 && n2 > n3 && n3 > n1) {
				System.out.println(n2 + " is a max; " + n1 + " is a min.");
			}
		}
			
		{
			if (n3 > n1 && n3 > n2 && n2 > n1) {
				System.out.println(n3 + " is a max; " + n1 + " is a min.");
			}
		}
		
		{
			if (n1 > n2 && n1 > n3 && n2 > n3) {
				System.out.println(n1 + " is a max; " + n3 + " is a min.");
			}
		}
		
		{
			if (n2 > n1 && n2 > n3 && n1 > n3) {
				System.out.println(n2 + " is a max; " + n3 + " is a min.");
			}
		}
		
		{
			if (n3 > n1 && n3 > n2 && n1 > n2) {
				System.out.println(n3 + " is a max; " + n2 + " is a min.");
			}
		}
			
	}
}
