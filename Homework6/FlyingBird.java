package lesson6;

public abstract class FlyingBird extends AbsBird{
    int layEggs;
    int feathers;
    public abstract void glide();

    public FlyingBird(int layEggs, int feathers) {
        super(layEggs, feathers);
    }

    @Override
    public void fly() {
        System.out.println("Uiiiiiii! I'm flying");
    }
}
