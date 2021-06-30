package practice06oop02._02.person;

//Create next structure.
//In abstract class Person with property name, declare abstract method print().
//In other classes in body of method print() output text “I am a …”.
//In class Staff declare abstract method salary().
//In each concrete class create constant TYPE_PERSON.
//Output type of person in each constructors.
//Create array of Person and add some Teachers, Cleaners and Students to it.
//Call method print() for all of it. Call method salary() for all Teachers and Cleaner

public class Main {

	public static void main(String[] args) {
		Person[] people = { new Teacher("John", 2500), new Cleaner("Mark", 900), new Student("Lola") };

		for (Person p : people) {
			p.print();
			if (p instanceof Staff) {
				((Staff) p).salary();
				System.out.println();
			}
			System.out.println();
		}

	}

}
