package lesson7.homework2task;

public class Liner extends WaterVehicle{
    int floors;
    public Liner(int passengers) {
        super(passengers);
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    void isSailing() {

    }
}
