package lesson6;

public abstract class AbsBird {
    int layEggs;
    int feathers;

    public AbsBird(int layEggs, int feathers) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public abstract void fly();


    @Override
    public String toString() {
        return getClass().getSimpleName() + " [feathers=" + feathers + ", layEggs=" + layEggs + "]";

    }
}
