package practice06oop02._02.person;

public abstract class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public abstract void print();

}
