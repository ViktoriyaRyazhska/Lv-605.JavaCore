package hm3;

import java.util.ArrayList;

public class Main {
	
	
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student("Ostap", 2));
		students.add(new Student("Ivan", 3));
		students.add(new Student("Bohdan", 2));
		students.add(new Student("Roman", 3));
		students.add(new Student("Vasyl", 5));
		
		students.sort(Student:: compareByName);
		System.out.println(students);
		
		students.sort(Student :: compareByCourse);
		System.out.println(students);
	}
}
