package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.print.attribute.SetOfIntegerSyntax;

public class Task2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name");
		String name = br.readLine();
		System.out.println("Where do you live,   "  + name);
		String address = br.readLine();
		System.out.println("Your name is - " + name + ", you are from " + address);
	}
}
