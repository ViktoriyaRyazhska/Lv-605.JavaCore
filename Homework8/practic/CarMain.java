package lesson8.homeworktask1.practic;

public class CarMain {
    public static void main(String[] args) {
Car carcar =  Car.getCar().withColor("blue").withModel("Volvo").withPassengers(5).withEngine(2.8).build();

      System.out.println(carcar);

    }
}
