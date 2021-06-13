import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Person p1 = new Person();
		p1.input();
		Person p2 = new Person("Maksym","Kyzbyt");
		Person p3 = new Person();
		p3.setFirstName("pavlo");
		p3.setLastName("petrenko");
		Person p4 = new Person("ivan","vyk");
		p4.setBirthYear(1995);
		Person p5 = new Person();
		p5.setLastName("Last");
		p5.setFirstName("First");
		p5.setBirthYear(1990);
		
	}

}
