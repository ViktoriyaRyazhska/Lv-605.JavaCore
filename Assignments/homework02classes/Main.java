package homework02classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		Person pers01 = new Person("John", "Sins");
		Person pers02 = new Person();
		Person pers03 = new Person("Mary", "Kay");
		Person pers04 = new Person();
		Person pers05 = new Person("Bartholomew", "Quadzinsky");

		pers01.input(buff);
		pers02.input(buff);
		pers03.input(buff);
		pers04.input(buff);
		pers05.input(buff);

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
