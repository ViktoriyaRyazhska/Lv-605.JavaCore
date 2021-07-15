package lesson11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson11 {
    //Create a method for calculating the area of a rectangle
    //	int squareRectangle (int a, int b),
    //which should throw an exception if the user enters negative value.
    // Input values a and b from console. Check the squareRectangle method in the method main. Check to input nonnumeric value.
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a and b ");
        double b = EnterValue(br);
        double a = EnterValue(br);
        System.out.println(a*b);
        System.out.println("hello ((^_^))");

    }
    public static double EnterValue(BufferedReader br)throws IOException{
        double s = 0;
        while (true) {
            try {
                s = Double.parseDouble(br.readLine());
                if (s <= 0) {throw new MyExeption("Enter positive value");
                }
                break;
            } catch (NumberFormatException i) {
                System.out.println("Enter number");
            }catch (MyExeption z) {
                System.out.println(z.getMessage());
            }

        }
       return s;
    }

}
