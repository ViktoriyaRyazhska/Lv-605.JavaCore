package lesson7.homework2task;

public class Boat extends WaterVehicle{
    int volume;
    public Boat(int passengers) {
        super(passengers);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing() {

    }
}
