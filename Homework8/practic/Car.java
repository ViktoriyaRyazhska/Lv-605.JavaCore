package lesson8.homeworktask1.practic;

public class Car {
    //Create a car with four different parameters and print info about this car and its parameters
    // сказано 4 параметри, значить буде 4.
    private String model;
    private String color;
    private int passengerCapacity;
    private double engineCapacity;
//   теж лишній пустий метод, я незнаю нащо його в перикладах всюди тулять(пошукав незнайшов))
//    public Car(){
//    }
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", passengerCapacity=" + passengerCapacity +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
//    взагалі лишній код :) нам геткар і окремо гетери полів ніде не треба, як буде треба тоді можна використовувати:)
//    public static Builder getCar() {
//        return new Builder();
//
//    }
//    public String getModel() {
//        return model;
//    }
//    public String getColor() {
//        return color;
//    }
//    public int getPassengerCapacity() {
//        return passengerCapacity;
//    }
//    public double getEngineCapasity() {
//        return engineCapacity;
//    }
    static class Builder {
        private Car newCar;

        public Builder(){
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
