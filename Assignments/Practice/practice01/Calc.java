import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
    public static void main(String[] args) {

        int a;
        int b;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter first variable:");
            a = Integer.parseInt(br.readLine());
            System.out.println("Enter second variable:");
            b = Integer.parseInt(br.readLine());

            System.out.println("a+b= " + (a + b));
            System.out.println("a-b= " + (a - b));
            System.out.println("a*b= " + (a * b));
            System.out.println("a/b= " + (a / b));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
