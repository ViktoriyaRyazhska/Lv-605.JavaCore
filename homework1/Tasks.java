package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tasks {
    public static void main (String[] args) throws IOException {
        int r = 5;
        int r2 = 25;
        int sq = 2;
        double π = 3.14;
        System.out.println("Area circle :");
        System.out.println("S = π * r2 " );
        System.out.println("S = " + π + " * " + r2);
        System.out.println("S = " + π * r2);
        System.out.println("Perimeter circle :");
        System.out.println("P = l = 2πr");
        System.out.println("l = 2" + " * " + π + " * " + r);
        System.out.println("P = " + sq * π * r);

        BufferedReader quest = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = quest.readLine();
        System.out.println("Where are you live," + name + "?");
        String city = quest.readLine();
        System.out.println("Name: " + name);
        System.out.println("City: " + city);

        System.out.println("Austria :");
        int c1 = Integer.parseInt(quest.readLine());
        System.out.println("Continued :");
        double t1 = Integer.parseInt(quest.readLine());
        System.out.println("Morocco :");
        int c2 = Integer.parseInt(quest.readLine());
        System.out.println("Continued :");
        double t2 = Integer.parseInt(quest.readLine());
        System.out.println("Ukraine :");
        int c3 = Integer.parseInt(quest.readLine());
        System.out.println("Continued :");
        double t3 = Integer.parseInt(quest.readLine());



    }
}
