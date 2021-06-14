package homework02_Classes;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Person pers01 = new Person("John", "Sins");
		Person pers02 = new Person();
		Person pers03 = new Person("Mary", "Kay");
		Person pers04 = new Person();
		Person pers05 = new Person("Bartholomew", "Quadzinsky");

		pers01.input();
		pers02.input();
		pers03.input();
		pers04.input();
		pers05.input();

		pers01.output();
		pers05.output();
		pers02.output();
		pers04.output();
		pers03.output();

		pers05.changeName(null, "Korey");
		pers03.changeName("Coraline", null);
		pers01.changeName("Willie", "Tanner");

		pers01.setBirthYear(1965);

		pers03.output();
		pers05.output();
		pers01.output();

	}

}
