package hm3;

import java.util.Comparator;
import java.util.List;

public class Student {
	
	private String name;
	private int courceNumber;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourceNumber() {
		return courceNumber;
	}
	public void setCourceNumber(int courceNumber) {
		this.courceNumber = courceNumber;
	}
	
	
	public Student(String name, int courceNumber) {
		super();
		this.name = name;
		this.courceNumber = courceNumber;
	}
	
	
	
	public static void printStudent(List<Student> students, Integer courceNumber) {
		
		for (Student student : students) {
			 	
			if (student.getCourceNumber() == courceNumber) {
				System.out.println((student.getName()) + " ");
			}
		}
	}
	
	
	public int compareByName(Student s) {
		
		return this.name.compareTo(s.getName());
	}
	
	public int compareByCourse(Student s) {
		
		return this.courceNumber - s.getCourceNumber();
	}
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", courceNumber=" + courceNumber + "]";
	}

	

}
