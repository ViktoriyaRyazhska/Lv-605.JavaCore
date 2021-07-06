
public class StudentTest {

	public static void main(String[] args) {
		Student first = new Student(new FullName("Vasyl", "Petrenko"), 24, 5);
		Student second = new Student(new FullName("Marta", "Gorodechna"), 22, 2);
		first.info();
		System.out.println(first.activity());
		second.info();
		System.out.println(second.activity());
	}

}
