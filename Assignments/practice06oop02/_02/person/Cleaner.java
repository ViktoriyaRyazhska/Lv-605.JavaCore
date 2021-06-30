package practice06oop02._02.person;

public class Cleaner extends Staff {
	private static final String TYPE_PERSON = "cleaner";

	public Cleaner(String name, double salary) {
		super(name, salary);
	}

	public void print() {
		System.out.println("I am a " + TYPE_PERSON + ".");
	}

	public void salary() {
		System.out.printf("My salary is %.2f: ", getSalary());

	}
}
