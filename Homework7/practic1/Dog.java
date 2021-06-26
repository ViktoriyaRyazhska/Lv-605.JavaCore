package lesson7;

public class Dog implements animal{
    @Override
    public void voice() {
        System.out.println("gav-gav");
    }

    @Override
    public void feed() {
        System.out.println("i love bones");

    }
}
