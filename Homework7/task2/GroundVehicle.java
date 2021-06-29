package lesson7.homework2task;

abstract public class GroundVehicle extends Passengers implements Vehicle{
    public GroundVehicle(int passengers) {
        super(passengers);
    }
    abstract void drive();
}
