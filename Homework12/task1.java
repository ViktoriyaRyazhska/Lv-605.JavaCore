package Lesson12Threads;

class Threadfirst extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5; i++) {
            System.out.println("first");
        }
    }
}
class Threadsecond extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5; i++) {
            System.out.println("second");
        }
    }
}
class Threadthird extends Thread {
    @Override
    public void run() {
        try {
            task1.t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            task1.t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.run();
        for (int i = 0; i < 5; i++) {
            System.out.println("third");
        }
    }
}

public class task1 {
    // Run three threads and output there different messages for 5 times.
    // The third thread supposed to start after finishing working of the two previous threads.
    static Threadfirst t1 = new Threadfirst();
    static Threadsecond t2 = new Threadsecond();
    static Threadthird t3 = new Threadthird();
    public static void main(String[] args) {
        t1.start();
        t2.start();
        t3.start();
    }
}
