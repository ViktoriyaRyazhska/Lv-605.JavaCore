package homework7.Task1;

public abstract class Person {
	private FullName fullName;
	private int age;

	public Person() {
	}

	public Person(FullName fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void info() {
		System.out.println("First name " + fullName.getFirstName() + ", LastName: " + fullName.getLastName()
				+ ", Age: " + age);
	}
	
	abstract public String activity();

}
