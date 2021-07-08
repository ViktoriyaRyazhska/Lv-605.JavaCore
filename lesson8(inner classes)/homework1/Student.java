package homework;

public class Student extends Person {

	private int courceNumber = 9;

	public Student(FullName fullName, int age, int courceNumber) {
		super(fullName, age);
		this.courceNumber = courceNumber;
	}


	@Override
	public String info() {		
		return super.info() + "It's the " + courceNumber + " lesson";
	}


	@Override
	public String activity() {
		return " I'm studing Java";
	}

	
	

}
