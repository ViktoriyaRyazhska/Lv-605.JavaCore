package homework8.Student;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Petro", 2));
		students.add(new Student("Maria", 4));
		students.add(new Student("Denys", 4));
		students.add(new Student("Anna", 3));
		students.add(new Student("Ludovic", 1));
		
		students.sort(new Student.NameComparator());
		System.out.println(students);
		students.sort(new Student.CourseComparator());
		System.out.println(students);
		
		Student.printStudents(students, 4);
	}
}
