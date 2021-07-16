package lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.zip.InflaterInputStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x [] = new int [10];
        for (int i=0; i<x.length; i++) {
            System.out.println("Enter number [" + i + "]");
            x[i] = Integer.parseInt(br.readLine());



            System.out.println(Arrays.toString(x));
            int sum = 0;
            for (int q = 0; q < x.length; q++) {
                if (x[q] > 0) sum = sum + x[q];
                System.out.print(sum);
            }


        }
    }
}
