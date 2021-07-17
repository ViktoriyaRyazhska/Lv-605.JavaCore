package homework08collections._03.student;

//Write class Student that provides information about the name of the student and his course. Class Student should consist of
//properties for access to these fields
//constructor with parameters
//method printStudents (List students, Integer course), which receives a list of students and the course number
//and prints to the console the names of the students from the list, which are taught in this course (use an iterator)
//methods to compare students by name and by course
//In the main() method 
//declare List students and add to the list five different students
//display the list of students ordered by name
//display the list of students ordered by course.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Student[] studentsArray = { new Student("Willie", 1), new Student("Rachel", 2), new Student("Olena", 1),
				new Student("James", 2), new Student("Kate", 1) };

		List<Student> studentsList = new ArrayList<>();
		Collections.addAll(studentsList, studentsArray);
		
		System.out.println("Printing initial list of students:");
		for (Student s : studentsList) {
			System.out.println(s);
		}

		System.out.println();
		System.out.println("Printing students enrolled in course 1:");
		Student.printStudents(studentsList, 1);
		
		System.out.println();
		System.out.println("Printing students enrolled in course 2:");
		Student.printStudents(studentsList, 2);
		
		Collections.sort(studentsList, Student.getNameComparator());
		
		System.out.println();
		System.out.println("Printing student sorted by name:");
		for (Student s : studentsList) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Printing student sorted by course:");
		Collections.sort(studentsList, Student.getCourseComparator());
		for (Student s : studentsList) {
			System.out.println(s);
		}
	}
}
