package lesson2;

import java.io.IOException;

public class PersonTest {
	public static void main(String[] args) throws IOException{
		Person pr0 = new Person();
		Person pr1 = new Person();
		Person pr2 = new Person();
		Person pr3 = new Person("Ralphy", "Fox");
		Person pr4 = new Person("Harpreet", "Gardiner");
		
		pr0.input();
		pr1.input();
		pr2.input();
		pr3.setBirthYear(1990);
		pr4.setBirthYear(1995);
		
		pr0.output();
		pr1.output();
		pr2.output();
		pr3.output();
		pr4.output();
	}
}
