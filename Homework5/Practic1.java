package Lesson5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//Create an array of ten integers. Display
//the biggest of these numbers;
//the sum of positive numbers in the array;
//the amount of negative numbers in the array.
//What values there are more: negative or positive?
public class Practic1 {
    public static void main(String[] args) throws Exception {
        int[] x = new int[10];
        x[0] = 44;
        x[1] = -2;
        x[2] = -3;
        x[3] = -47;
        x[4] = -5;
        x[5] = -69;
        x[6] = -7;
        x[7] = 8;
        x[8] = 95;
        x[9] = 10;
        System.out.println(Arrays.toString(x));
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0) sum = sum + x[i];
        }
        System.out.println("Sum = " + sum);
        int max = x[0];
        int i = 0;
        while (i < x.length) {
            if (x[i] > max) {
                max = x[i];

            }
            i++;
        }
        System.out.println("Maximum = " + max);
        int amountnegative = 0;
        int amountpositive = 0;
        for (int a : x) {
            if (a > 0 ) {
                amountpositive++;
            }
            if (a < 0 ){
                amountnegative++;
            }
        }
        if (amountpositive > amountnegative){
            System.out.println( "there are more positive values" );
        }
        if (amountpositive < amountnegative) {
            System.out.println("there are more negative values");
        }
        if (amountpositive == amountnegative) {
            System.out.println("there are jopa");
        }
//        System.out.println("Amountpositive = " + amountpositive);
        System.out.println("amountnegative = "  + amountnegative);
    }
}
