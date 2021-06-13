import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson2 {

    public static void main(String[] args) throws IOException {
        int a;
        int b;
        BufferedReader wt = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first variable:");
        a = Integer.parseInt(wt.readLine());
        System.out.println("Enter second variable:");
        b = Integer.parseInt(wt.readLine());

        System.out.println("a+b=" + (a + b));
        System.out.println("a-b=" + (a - b));
        System.out.println("a/b=" + (a / b));
        System.out.println("a*b=" + (a * b));


    }

}
