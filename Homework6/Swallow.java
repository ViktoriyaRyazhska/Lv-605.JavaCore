package lesson6;

public class Swallow extends FlyingBird{
    int layEggs;
    int feathers;

    @Override
    public void glide() {
        System.out.println("Im gliding in the sky and show aerobatics ");
    }

    public Swallow(int layEggs, int feathers) {
        super(layEggs, feathers);
    }

    @Override
    public void fly() {
        super.fly();
    }
}
