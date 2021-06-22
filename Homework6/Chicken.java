package lesson6;

public class Chicken extends FlyingBird{
    int layEggs;
    int feathers;

    @Override
    public void glide() {
        System.out.println("Im gliding like...let's not talk about it? ");
    }

    public Chicken(int layEggs, int feathers) {
        super(layEggs, feathers);
    }

    @Override
    public void fly() {
        super.fly();
    }
}
