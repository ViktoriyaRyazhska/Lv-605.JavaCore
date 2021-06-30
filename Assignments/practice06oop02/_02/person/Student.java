package practice06oop02._02.person;

public class Student extends Person {
	private static final String TYPE_PERSON = "student";

	public Student(String name) {
		super(name);
	}

	public void print() {
		System.out.println("I am a poor " + TYPE_PERSON + ", and i have no money :'(");
	}
}
