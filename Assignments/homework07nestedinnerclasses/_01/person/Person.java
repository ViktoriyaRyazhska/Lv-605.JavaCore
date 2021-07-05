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

	// Which one is better info() method?
	public StringBuilder info() {
		StringBuilder sb = new StringBuilder();
		return sb.append("First name: ").append(this.fullName.getFirstName()).append("; Last name: ")
				.append(this.fullName.getLastName()).append("; Age: ").append(this.age);
	}
	
	public String info2() {
		return "First name: " + this.fullName.getFirstName() + "; Last name: " + this.fullName.getLastName() + "; Age: " + this.age;
	}
	
	public abstract String activity();
}
