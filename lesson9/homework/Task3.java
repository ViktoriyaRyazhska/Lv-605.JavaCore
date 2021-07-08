package lesson9.homework;

import java.util.ArrayList;

public class Task3 {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Roman", 4));
		students.add(new Student("Vasia", 3));
		students.add(new Student("Vika", 2));
		students.add(new Student("Dima", 4));
		students.add(new Student("Sasha", 1));

		students.sort(Student::compareToByName);
		System.out.println(students);

		students.sort(Student::compareToByCourse);
		System.out.println(students);
	}
}
