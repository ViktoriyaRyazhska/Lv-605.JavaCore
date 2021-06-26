package lesson7.practic;
//Create next structure. In abstract class Person with property name, declare abstract method print().
// In other classes in body of method print() output text “I am a …”. In class Staff declare abstract method salary().
// In each concrete class create constant TYPE_PERSON. Output type of person in each constructors.
// Create array of Person and add some Teachers, Cleaners and Students to it. Call method print() for all of it.
// Call method salary() for all Teachers and Cleaner
    public abstract class Person {
        private String name;
        final String TYPE_PERSON = getClass().getSimpleName();
        public Person(String name) {
            this.name = name;
            System.out.println(TYPE_PERSON);
        }
        public String getName() {
            return name;
        }
        public abstract void print();
    }

