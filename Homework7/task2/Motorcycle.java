package lesson7.homework2task;

public class Motorcycle extends GroundVehicle{
    int maxSpeed;
    public Motorcycle(int passengers) {
        super(passengers);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    void drive() {

    }
}
