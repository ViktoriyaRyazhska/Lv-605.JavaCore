package lesson7;

public class Cow implements animal{
    @Override
    public void voice() {
        System.out.println("Mu-Mu\"Cow say.\" ");
    }

    @Override
    public void feed() {
        System.out.println("Im eating grass");
    }
}
