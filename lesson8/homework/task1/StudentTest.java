package lesson8.homework.task1;

public class StudentTest {

	public static void main(String[] args) {
		Student[] students = {
				new Student(21, new FullName("Vasya", "Petrenko"), 3),
				new Student(18, new FullName("Mykola", "Kozak"), 1)
		};
		for(Student student: students) {
			System.out.println(student.info());
			System.out.println(student.activity());
			System.out.println("------");
		}
	}

}
