package Homework4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//Enter three numbers. Find out how many of them are odd.(Task)
public class Numbers {

    public static void main(String[] args) throws Exception {
    BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
    int x = 0;
    System.out.println("Input number: ");
        int number = Integer.parseInt(num.readLine());
        if (number % 2 != 0) {
            System.out.println("odd" );
            x++;
        } else {
            System.out.println("not odd");
        }
        int number2 = Integer.parseInt(num.readLine());
        if (number2 % 2 != 0) {
            System.out.println("odd" );
            x++;
        } else {
            System.out.println("not odd");
        }
        int number3 = Integer.parseInt(num.readLine());
        if (number3 % 2 != 0) {
            System.out.println("odd" );
            x++;
        } else {
            System.out.println("not odd");
        }
        System.out.println("кількість непарних " + x);
    }
}

