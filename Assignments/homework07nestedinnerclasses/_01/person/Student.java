package homework07nestedinnerclasses._01.person;

public class Student extends Person {

	private int courseID;

	public Student() {
		super();
	}

	public Student(FullName fullName, int age, int coureID) {
		super(fullName, age);
		this.courseID = coureID;
	}

	// Which one is better info() method?
	@Override
	public StringBuilder info() {
		return super.info().append("; CourseID: ").append(this.courseID);
	}

	public String info2() {
		return super.info2() + "; CourseID: " + this.courseID;
	}

	@Override
	public String activity() {
		return "I’m a student at SoftServe.";
	}
}
