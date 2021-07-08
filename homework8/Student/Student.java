package homework8.Student;

import java.util.*;

public class Student {

	private String name;
	private int course;

	public Student() {
		super();
	}

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

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	public static void printStudents(List<Student> list, int course) {
		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student st = it.next();
			if(st.course == course) {
				System.out.println(st.name);
			}
		}
	}
	
	static class NameComparator implements Comparator<Student> {
		@Override
		public int compare(Student s1, Student s2) {
			return s1.getName().compareTo(s2.getName());
		}
	}
	
	static class CourseComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getCourse() - o2.getCourse();
		}
	}
}
