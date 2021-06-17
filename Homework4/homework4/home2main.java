package Homework4;
//    read 3 integer numbers and write max and min of them;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class home2main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        home2 number1 = new home2(br);
        home2 number2 = new home2(br);
        home2 number3 = new home2(br);
        home2 maxnumberr = home2.findMax(number1, number2, number3);
        System.out.println("Max number is: " + maxnumberr.getX());
        home2 minnumberr = home2.findMin(number1, number2, number3);
        System.out.println("Min number is: " + minnumberr.getX());
    }
}
