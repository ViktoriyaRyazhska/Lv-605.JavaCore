package softserveJavaCore.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;
		System.out.println("Enter a: ");
		a = Integer.parseInt(br.readLine());
		System.out.println("Enter b: ");
		b = Integer.parseInt(br.readLine());
		System.out.println("A = " + a +
						"\nB = " + b +
						"\nA+B = " + (a+b) +
						"\nA-B = " + (a-b) +
						"\nA*B = " + (a*b) +
						"\nA/B = " + (a/b));
	}

}
