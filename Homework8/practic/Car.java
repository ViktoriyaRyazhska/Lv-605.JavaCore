package lesson8.homeworktask1.practic;

public class Car {
    //Create a car with four different parameters and print info about this car and its parameters
    // сказано 4 параметри, значить буде 4.
    private String model;
    private String color;
    private int passengerCapacity;
    private double engineCapacity;
//   заглушка
    public Car(){
    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
    //геткар щоб дістати з прайватбілдеру.
    public static Builder getCar() {
        return new Builder();

    }

    static class Builder {
        private Car newCar;

        private Builder(){
            newCar = new Car();
        }
        public Builder withModel(String model){
            newCar.model = model;
            return this;
        }
        public Builder withColor(String color){
            newCar.color = color;
            return this;
        }
        public Builder withPassengers(int passengerCapacity){
            newCar.passengerCapacity = passengerCapacity;
            return this;
        }
        public Builder withEngine(double engineCapacity){
            newCar.engineCapacity = engineCapacity;
            return this;
        }
        public Car build() {
            return newCar;
        }
    }
}
