package Lesson12Threads;
//Create a thread «one», which would start the thread «two»,
// which has to output its number («Thread number two») 3 times
// and create thread «three», which would to output message «Thread number three» 5 times.
public class task3 {
    public static void main(String[] args) {
        one One = new one();
        One.start();
    }
}
//Create a thread «one», which would start the thread «two»,
 class one extends Thread{
     @Override
     public void run() {
         super.run();
         two Two = new two();
         Two.start();
     }
 }
// which has to output its number («Thread number two») 3 times
class two extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread number two");
            three Three = new three();
            Three.start();
        }
    }
}
// and create thread «three», which would to output message «Thread number three» 5 times.
class three extends Thread {
    @Override
    public void run() {
        super.run();
            for(int i = 0; i < 5; i++) {
                System.out.println("Thread number three");

        }
    }
}
