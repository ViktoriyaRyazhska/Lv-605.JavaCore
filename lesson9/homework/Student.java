package lesson9.homework;

import java.util.List;

public class Student {
	private String name;
	private int course;

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public static void printStudents(List<Student> students, Integer course) {
		for (Student student : students) {
			if (student.getCourse() == course) {
				System.out.print(student.getName() + " ");
			}
		}
	}

	public int compareToByName(Student s) {
		return this.name.compareToIgnoreCase(s.getName());
	}

	public int compareToByCourse(Student s) {
		return this.course - s.getCourse();
	}

	public String getName() {
		return name;
	}

	public int getCourse() {
		return course;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", course=" + course + "]";
	}

}
