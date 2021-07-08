package homework7.Task1;

public class Student extends Person {
	private int course;

	public Student() {
	}

	public Student(FullName fullName, int age, int course) {
		super(fullName, age);
		this.course = course;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String activity() {
		return "Student activity.";
	}

	@Override
	public void info() {
		System.out.println("First name " + super.getFullName().getFirstName() + ", LastName: "
				+ super.getFullName().getLastName() + ", Age: " + super.getAge() + ", course: " + course);
	}

}
