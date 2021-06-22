package Lesson5;

public class Car {
    //Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars
//certain model year  (enter year in the console);
//ordered by the field year.
    public String type;
    public int yearofproduction;
    public int capasity;



    public Car(String type, int yearofproduction, int capasity){
        this.type = type;
        this.yearofproduction = yearofproduction;
        this.capasity = capasity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearofproduction() {
        return yearofproduction;
    }

    public void setYearofproduction(int yearofproduction) {
        this.yearofproduction = yearofproduction;
    }

    public int getCapasity() {
        return capasity;
    }

    public void setCapasity(int capasity) {
        this.capasity = capasity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearofproduction=" + yearofproduction +
                ", capasity=" + capasity +
                '}';
    }
}
