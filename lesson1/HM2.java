package lesson1;

import java.io.*;

public class HM2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name, address;
		System.out.print("What is your name? ");
		name = br.readLine();
		System.out.print("Where are you live, "+name+"? ");
		address = br.readLine();
		System.out.println("You live at "+address+", "+name+"!");
	}
}
