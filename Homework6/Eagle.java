package lesson6;

public class Eagle extends FlyingBird{
    int layEggs;
    int feathers;

    public  void glide() {
        System.out.println("Im gliding like a young god!");

    }

    public Eagle(int layEggs, int feathers) {
        super(layEggs, feathers);
    }
    @Override
    public void fly() {
        super.fly();
    }


}
