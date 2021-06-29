package lesson7.homework2task;

abstract public class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle(int passengers) {
        super(passengers);
    }
    abstract void fly();
    abstract void land();
}
