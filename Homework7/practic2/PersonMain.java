package lesson7.practic;
//Create next structure. In abstract class Person with property name, declare abstract method print().
// In other classes in body of method print() output text “I am a …”. In class Staff declare abstract method salary().
// In each concrete class create constant TYPE_PERSON. Output type of person in each constructors.
// Create array of Person and add some Teachers, Cleaners and Students to it. Call method print() for all of it.
// Call method salary() for all Teachers and Cleaner
public class PersonMain {
    public static void main(String[] args) {
        Person [] persons = {
                new Teacher("Professor X"),
                new Cleaner("Cyclop"),
                new Student("Logan")
        };
        for(Person person: persons) {
            person.print();
            if(person instanceof Staff) {
                ((Staff) person).salary();
            }
        }
    }
}
