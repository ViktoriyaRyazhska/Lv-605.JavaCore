package Lesson5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class homework51 {
    //    Ask user to enter the number of month. Read the value and write the amount of days in this month (create array with amount days of each month).
//    Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
    public static void main(String[] args) throws IOException {
        int[] monthDays = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
        int n = monthDays.length;
        System.out.println(n);      //виводимо довжину масиву
        System.out.println(Arrays.toString(monthDays));   // виводимо вміст масиву аби було
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the number of month");
        int a = Integer.parseInt(br.readLine());
        if (a >= 1 && a <= 12){
            System.out.println("There are " + monthDays[a -1] + " days in this month");
        }else {
            System.out.println("Its wrong value.");
        }
        int[] integerss = {-12, 5, -37, -42, -3, 8, 64, 51, -33, 10};
        int za;
        int sumfive = 0;
        int productlastfive = 1;
        int count = 0;
        for(za =0; za < 5; za++) {
            if (integerss[za] > 0){
                sumfive = sumfive + integerss[za];
            count ++;}}
            if (count == 5){
                System.out.println("sum of first 5 elements " + sumfive);
            }
        else {  // щось я не впевнений що воно так робить, але чомусь робить і слава богу
            for (za = 5; za < integerss.length; za++) {
                productlastfive =  productlastfive * integerss[za]; //воно не хоче працювати зволоч
            }
                System.out.println("product of last 5 element " + productlastfive);
        }
        }
    }






