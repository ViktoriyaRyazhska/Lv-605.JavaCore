package Lesson5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class homework52 {
//    Enter 5 integer numbers. Find position of second positive number;
//    minimum and its position in the array.
//    Organize entering integers until the first negative number. Count the product of all entered even numbers.Організуйте введення цілих чисел до першого від’ємного числа. Підрахуйте добуток усіх введених парних чисел.
    public static void main(String[] args) throws IOException {
        int count = 0;
        int productpositive = 1;
        int productEven =1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] Numbers = new int[5];
        System.out.println("Enter 5 integer numbers");
        for(int i = 0; i < Numbers.length; i++) {
            Numbers[i] = Integer.parseInt(br.readLine());
        if (Numbers[i] >= 0) {
        count ++;
        if (count ==2){
        System.out.println("second positive number " + (i+1));
        }
        }
            if (Numbers[i]%2==0) {
                productEven = productEven * Numbers[i]; //додати перевірку на парність
            }
                }
        int min = Numbers[0];
        int i = 0;
        while (i < Numbers.length) {
            if (Numbers[i] < min) {
                min = Numbers[i];
            }
            i++;
        }
        System.out.println("Minimum = " + min + " Its position =  " + i);
        System.out.println("product of all entered even numbers  " + productEven);
        System.out.println("^-^");
       }
}








