package Lesson9;

import java.util.List;

//Write class Student that provides information about the name of the student and his course. Class Student should consist of
//properties for access to these fields
//constructor with parameters
public class Student {
    private String name;
    private int course;
    public Student(String name, int course){
        this.name = name;
        this.course = course;
    }
    //method printStudents (List students, Integer course), which receives a list of students
    // and the course number and prints to the console the names of the students from the list,
    // which are taught in this course (use an iterator)
    public static void printStudents(List<Student> students, Integer course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.print(student.getName());
            }
        }
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
    //methods to compare students by name and by course
    public int compareToByName(Student s) {
        return this.name.compareToIgnoreCase(s.getName());
    }

    public int compareToByCourse(Student s) {
        return this.course - s.getCourse();
    }

    @Override
    public String toString() {
        return "Student [" +
                "name='" + name + '\'' +
                ", course=" + course +
                ']';
    }
}
