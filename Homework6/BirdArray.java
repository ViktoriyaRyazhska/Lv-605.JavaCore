package lesson6;

import java.util.Arrays;

//Develop abstract class Bird with attributes feathers and layEggs and an abstarct method fly().
//Develop classes FlyingBird and NonFlyingBird. Create class Eagle, Swallow, Penguin and Chicken.
//Create array Bird and add different birds to it.
//Call fly() method for all of it. Output the
//information about each type of created bird.
public class BirdArray {
    public static void main(String[] args) {
        AbsBird[] Birds;
        Birds = new AbsBird[]{
                new Eagle(5, 6),
                new Swallow(4, 5),
                new Penguin(2, 5),
                new Chicken(7, 1),
                new MarsBird( 8, 7)
        };
        System.out.println(Birds[0]);
        Birds[0].fly();
        System.out.println(Birds[1]);
        Birds[1].fly();
        System.out.println(Birds[2]);
        Birds[2].fly();
        System.out.println(Birds[3]);
        Birds[3].fly();
        System.out.println(Birds[4]);
        Birds[4].fly();
        MarsBird bird = new MarsBird(8,7);
        bird.only();// трошки гумору:)


        FlyingBird[] fBirds;
        fBirds = new FlyingBird[]{
                new Eagle(5, 6),
                new Swallow(4, 5),
                new Chicken(7, 1),
        };
        System.out.println(fBirds[0]);
        fBirds[0].fly();fBirds[0].glide();
        System.out.println(fBirds[1]);
        fBirds[1].fly();fBirds[1].glide();
        System.out.println(fBirds[2]);
        fBirds[2].fly();fBirds[2].glide();
    }

}
