package lesson7.practic;

public class Teacher extends Staff{
    public Teacher(String name) {
        super(name);
    }
    @Override
    public void print() {
        System.out.println("My name is " + getName() + ", and i'm a " + TYPE_PERSON);
    }
    @Override
    void salary() {
        System.out.println("Salary of " + TYPE_PERSON);
    }
}
