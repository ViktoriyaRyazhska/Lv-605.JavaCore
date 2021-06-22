package lesson6;

public abstract class NonFlyingBird extends AbsBird
{
    int layEggs;
    int feathers;
    public abstract void walk();

    public NonFlyingBird(int layEggs, int feathers) {
        super(layEggs, feathers);
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
