package homework;

public class Main {
	
	public static void main(String[] args) {
		
		Student s = new Student (new FullName("Oleksandr", "Danihevych"), 23,8);
		Student s1 = new Student ( new FullName("Denys", "Bondarenko"), 25,9);
		
		System.out.println(s.info() + s.activity());
		System.out.println(s1.info() + s.activity());
		
	}

}
