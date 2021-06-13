import java.util.Scanner;
import java.io.*;

public class Calls {
    public static void main(String[] args) throws IOException {

        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        //in $ per min
        double c1 = 0.0385; //USA
        double c2 = 0.0577; //Poland
        double c3 = 0.0577; //Germany

        System.out.println("Call to USA costs $" + c1 + " per minute.\nHow many minutes have you talked to USA?");
        double t1 = Integer.parseInt(buff.readLine());
        double p1 = c1 * t1;
        System.out.println("Call to Poland costs $" + c2 + " per minute.\nHow many minutes have you talked to Poland?");
        double t2 = Integer.parseInt(buff.readLine());
        double p2 = c2 * t2;
        System.out.println("Call to Germany costs $" + c3 + " per minute.\nHow many minutes have you talked to Germany?");
        double t3 = Integer.parseInt(buff.readLine());
        double p3 = c3 * t3;
        System.out.println("Price of your calls:");
        System.out.println("USA - $" + p1);
        System.out.println("Poland - $" + p2);
        System.out.println("Germany - $" + p3);
        System.out.println("Sum total of your calls - $" + (p1 + p2 + p3));

    }
}