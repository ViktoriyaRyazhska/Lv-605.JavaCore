package homework07nestedinnerclasses._01.person;

public class Main {

	public static void main(String[] args) {
//		Person.FullNameBuilder first = new Person(new FullName().getFullName().setFirstName("Johnny").setLastName("Sins"), 29);
		Student students[] = new Student[2];
		students[0] = new Student(new FullName("Hey", "You"), 21, 89568);
		students[1] = new Student(new FullName("Childin", "Myhead"), 31, 74801);

		for (Student s : students) {
			System.out.println(s.info());
			System.out.println(s.info2());
			System.out.println(s.activity());
			System.out.println();
		}
	}
}
