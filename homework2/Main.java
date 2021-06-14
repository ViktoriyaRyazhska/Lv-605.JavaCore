package homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main (String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
				
		Person p1 = new Person();
		p1.input(br);		
		
		Person p2 = new Person();
		p2.input(br);
				
		Person p3 = new Person();		
		p3.input(br);
		
		Person p4 = new Person();
		p4.input(br);
		p4.changeName("Oleg", "Makara");// changeName method
		
		Person p5 = new Person();
		p5.input(br);
		
		p1.output();
		p2.output();
		p3.output();
		
		p4.output();
		p5.output();
	}
	
	
}
