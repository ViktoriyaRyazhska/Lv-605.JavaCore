package lesson7.practic;

public abstract class Staff extends Person{
    public Staff(String name) {
        super(name);
    }
    abstract void salary();
    @Override
    public void print() {
        System.out.println("My name is " + getName() + ", and i'm " + TYPE_PERSON);
    }
}
