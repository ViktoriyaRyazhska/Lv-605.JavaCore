package lesson7;

import lesson6.*;

public class Animalsmain {
    public static void main(String[] args) {
        animal[] Animals = new animal[3];
        Animals[0] = new Dog();
        Animals[1] = new Cat();
        Animals[2] = new Cow();
        for (int i = 0; i < Animals.length; i++){
            Animals[i].voice();
            Animals[i].feed();
        }



        }

    }

