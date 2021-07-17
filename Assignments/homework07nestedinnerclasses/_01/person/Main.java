package homework07nestedinnerclasses._01.person;

public class Main {

	public static void main(String[] args) {
		Student students[] = new Student[2];
		FullName fullName = FullName.getFullName().setFirstName("John").setLastName("Walker").fullNameBuild();
		students[0] = new Student(fullName, 21, 89568);
		students[1] = new Student(FullName.getFullName().setFirstName("John").setLastName("Walker").fullNameBuild(), 19,
				444);

		for (Student s : students) {
			System.out.println(s.info());
			System.out.println(s.activity());
			System.out.println();
		}
	}
}
