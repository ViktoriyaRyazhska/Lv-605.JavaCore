package homework08collections._03.student;

import java.util.Comparator;
import java.util.List;

public class Student {
	private String name;
	private Integer course;

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}
	
	public static NameComparator getNameComparator() {
		return new NameComparator();
	}
	
	public static CourseComparator getCourseComparator() {
		return new CourseComparator();
	}

	private static class NameComparator implements Comparator<Student> {

		@Override
		public int compare(Student s1, Student s2) {
			return (s1.getName().compareTo(s2.getName()));
		}
	}

	private static class CourseComparator implements Comparator<Student> {

		@Override
		public int compare(Student s1, Student s2) {
			return s1.getCourse() - s2.getCourse();
		}
	}

	public static void printStudents(List<Student> students, Integer course) {
		for (Student s : students) {
			if (s.getCourse() == course) {
				System.out.println(s.getName());
			}
		}
	}

	@Override
	public String toString() {
		return "Student: " + name + ", course: " + course + ".";
	}
	
}
