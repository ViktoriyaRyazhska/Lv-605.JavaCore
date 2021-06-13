import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task {
    public static void main(String[] args) throws IOException {
        double a;
        double b;
        double c;
        double t1;
        double t2;
        double t3;
        BufferedReader c1 =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("units1");
        a = Double.parseDouble(c1.readLine());
        System.out.println("minutes");
        t1 = Double.parseDouble(c1.readLine());
        System.out.println("first call " + (a * t1));
        System.out.println("units2");
        b = Double.parseDouble(c1.readLine());
        System.out.println("minutes2");
        t2 = Double.parseDouble(c1.readLine());
        System.out.println("second call " + (b * t2));
        System.out.println("units3");
        c = Double.parseDouble(c1.readLine());
        System.out.println("minutes3");
        t3 = Double.parseDouble(c1.readLine());
        System.out.println("third call " + (c * t3));
        System.out.println("all cost ");
        System.out.println( (c * t3) + (b * t2) + (a * t1));



    }
}
