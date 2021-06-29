package secondone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pupil {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Person p1 = new Person();
		p1.input(br);
		System.out.println(p1);
		
		Person p2 = new Person();
		p2.input(br);
		System.out.println(p2);
		
		Person p3 = new Person();
		p3.input(br);
		System.out.println(p3);
		
		Person p4 = new Person();
		p4.input(br);
		System.out.println(p4);
		
		Person p5 = new Person();
		p5.input(br);
		System.out.println(p5);
	}

}
