package lesson6;

public class MarsBird extends AbsBird{

    public MarsBird(int layEggs, int feathers) {
        super(layEggs, feathers);

    }


    public void only() {
        System.out.println("I am the only bird in my class so I am never abstract");
    }





    @Override
    public void fly() {
        System.out.println("Im teleporting!");
    }

}
