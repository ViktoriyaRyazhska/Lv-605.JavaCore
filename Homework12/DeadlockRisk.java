package Lesson12Threads;

public class DeadlockRisk implements Runnable {

    private static class Resource {
    }

    private static final Resource pen = new Resource();
    private static final Resource paper = new Resource();

    public static void doSun() {
        synchronized (pen) { // May deadlock here
            System.out.println(Thread.currentThread().getName()
                    + " взяв ручку щоб помалювати");
            synchronized (paper) {
                System.out.println(Thread.currentThread().getName()
                        + " взяв папір щоб помалювати");
                System.out.println(Thread.currentThread().getName()
                        + " малює ручкою на папері");
            }
        }
    }

    public void run() {
        doSun();
    }

    public static void main(String[] args) {
        DeadlockRisk job = new DeadlockRisk();
        Thread pain = new Thread(job, "pain");
        pain.start();
        synchronized (paper) { // May deadlock here
            System.out.println(Thread.currentThread().getName()
                    + " взяв папір щоб помалювати");
            synchronized (pen) {
                System.out.println(Thread.currentThread().getName()
                        + " взяв ручку щоб помалювати");
                System.out.println(Thread.currentThread().getName()
                        + " малює ручкою на папері");
            }
        }
    }
}

