package lesson7.practTask.task2;

public class PersonTest {
	public static void main(String[] args) {
		Person[] persons = {
			new Student("Vasya"),
			new Teacher("Mykola"),
			new Cleaner("Dima")
		}; 
		for(Person person: persons) {
			person.print();
			if(person instanceof Staff) {
				((Staff) person).salary();
			}
		}
		
	}
}
