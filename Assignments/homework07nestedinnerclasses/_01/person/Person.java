package homework07nestedinnerclasses._01.person;

public abstract class Person {
	private FullName fullName;
	private int age;

	public Person() {

	}

	public Person(FullName fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	public String info() {
		return "First name: " + this.fullName.getFirstName() + "; Last name: " + this.fullName.getLastName() + "; Age: "
				+ this.age;
	}

	public abstract String activity();
}
