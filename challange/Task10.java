package Challange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10 {
    //10. Find the number of steps for which you get 1, using the following process: we take any
    //the natural number n is greater than one. If it is even, then divide it by 2, and if it is odd, then
    //multiply by 3 and add 1
    static int counter = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter natural number  ");
        int n = Integer.parseInt(br.readLine());

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            counter++;
        }
        System.out.println("number of steps is " + counter);
    }
}
