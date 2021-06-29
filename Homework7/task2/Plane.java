package lesson7.homework2task;

public class Plane extends FlyingVehicle{
    public Plane(int passengers) {
        super(passengers);
    }
    int maxDistance;

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    void fly() {

    }

    @Override
    void land() {

    }
}
