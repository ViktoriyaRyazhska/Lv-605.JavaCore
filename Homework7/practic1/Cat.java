package lesson7;

public class Cat implements animal{
    @Override
    public void voice() {
        System.out.println("meow-meow");
    }

    @Override
    public void feed() {
        System.out.println("i love milk");
    }
}
