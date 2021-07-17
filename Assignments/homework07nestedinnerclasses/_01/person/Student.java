package homework07nestedinnerclasses._01.person;

public class Student extends Person {

	private int courseID;

	public Student(FullName fullName, int age, int coureID) {
		super(fullName, age);
		this.courseID = coureID;
	}

	@Override
	public String info() {
		return super.info() + "; CourseID: " + this.courseID;
	}

	@Override
	public String activity() {
		return "I’m a student at SoftServe.";
	}
}
