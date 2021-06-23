package lesson7.practTask.task2;

public abstract class Person {
	private String name;
	final String TYPE_PERSON = getClass().getSimpleName();
	
	public Person(String name) {
		this.name = name;
		System.out.println(TYPE_PERSON);
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void print();
}
