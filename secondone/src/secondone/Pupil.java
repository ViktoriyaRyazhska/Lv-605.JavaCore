package secondone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pupil {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Person p1 = new Person();
		p1.setFirstName("Lana");
		p1.setLastName("Kopotun");
		p1.setBirthYear(2000);
		
		Person p2 = new Person();
		p2.setFirstName("Stepan");
		p2.setLastName("Romanov");
		p2.setBirthYear(1993);
		
		Person p3 = new Person();
		p3.setFirstName("Diana");
		p3.setLastName("Yavorska");
		p3.setBirthYear(1998);
		
		Person p4 = new Person();
		p4.setFirstName("Glib");
		p4.setLastName("Vodvud");
		p4.setBirthYear(1989);
		
		Person p5 = new Person();
		p5.setFirstName("Nataliia");
		p5.setLastName("Lazorenko");
		p5.setBirthYear(2003);
		
		System.out.println("The name of first person is " + p1.getFirstName() + ", the last name of first person is " + p1.getLastName() + ", " + p1.getAge() + " years old");
		System.out.println("The name of first person is " + p2.getFirstName() + ", the last name of first person is " + p2.getLastName() + ", " + p2.getAge() + " years old");
		System.out.println("The name of first person is " + p3.getFirstName() + ", the last name of first person is " + p3.getLastName() + ", " + p3.getAge() + " years old");
		System.out.println("The name of first person is " + p4.getFirstName() + ", the last name of first person is " + p4.getLastName() + ", " + p4.getAge() + " years old");
		System.out.println("The name of first person is " + p5.getFirstName() + ", the last name of first person is " + p5.getLastName() + ", " + p5.getAge() + " years old");
	}

}
