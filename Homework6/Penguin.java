package lesson6;

public class Penguin extends NonFlyingBird{
    int layEggs;
    int feathers;



    public Penguin(int layEggs, int feathers) {
        super(layEggs, feathers);
    }

    @Override
    public void fly() {
        super.fly();
    }
    @Override
    public void walk() {
        System.out.println("Im walking like a human ha-ha!");
    }
}
