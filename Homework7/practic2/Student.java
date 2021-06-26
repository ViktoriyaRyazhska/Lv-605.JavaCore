package lesson7.practic;

public class Student extends Person{
    public Student(String name) {
        super(name);
    }
    @Override
    public void print() {
        System.out.println("My name is " + getName() + ", and i'm a " + TYPE_PERSON);
    }
}
