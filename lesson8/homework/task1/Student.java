package lesson8.homework.task1;

public class Student extends Person{
	private int course;
	
	public Student(int age, FullName fullName, int course) {
		super(age, fullName);
		this.course = course;
	}
	
	@Override
	public String activity() {
		return "I study at university!";
	}
	
	@Override
	public String info() {
		return super.info()+", Course: "+course;
	}
	
}
