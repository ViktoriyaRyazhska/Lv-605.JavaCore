package Lesson9;

import java.util.ArrayList;
import java.util.Arrays;

//In the main() method
//declare List students and add to the list five different students
//display the list of students ordered by name
//display the list of students ordered by course.
public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(new Student("Stanislav", 1),new Student("Kolya", 3),new Student("Pafnutiy", 2),new Student("Dormidont", 4),new Student("Anna-Maria-Antuanetta", 5)));
        students.sort(Student::compareToByName);
        System.out.println(students);
        students.sort(Student::compareToByCourse);
        System.out.println(students);
        Student.printStudents(students, 5);
    }
}
