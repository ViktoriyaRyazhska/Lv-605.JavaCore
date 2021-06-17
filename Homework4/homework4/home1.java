package Homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//read 3 float numbers and check: are they all belong to the range [-5,5];
public class home1 {
    public static void main(String[] args)throws IOException {
        double x;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Type the number");
        x = Double.parseDouble(br.readLine());
        if ((x < -5) || (x > 5 ));
        else System.out.println("false");
        if ((x > -5) || (x < 5 ));
        else System.out.println("true");
        System.out.print("Type the number");
        x = Double.parseDouble(br.readLine());
        if ((x < -5) || (x > 5 ));
        else System.out.println("false");
        if ((x > -5) || (x < 5 ));
        else System.out.println("true");
        System.out.print("Type the number");
        x = Double.parseDouble(br.readLine());
        if ((x < -5) || (x > 5 ));
        else System.out.println("false");
        if ((x > -5) || (x < 5 ));
        else System.out.println("true");
    }

}
