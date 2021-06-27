package employee;

public class Main {

	
	public static void main(String[] args) {
		
		Employee e = new Employee("Igor", 25, 35500);
		Developer d = new Developer("Taras", "Junior Java Developer", 32, 50500);
		
		System.out.println("The developer:" + "\n"+ d.report()+ "\n" );
		
		System.out.println("The Employee" + "\n"+ e.report());
	}
}
