package lesson7.homework2task;

abstract public class WaterVehicle extends Passengers implements Vehicle{

    public WaterVehicle(int passengers) {
        super(passengers);
    }
    abstract void isSailing();
}
