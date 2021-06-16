package Homework4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//Enter the number of the day of the week. Display the name in three languages.
public class Week {
    public static void main(String[] args) throws Exception {
        BufferedReader wee = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number: ");
        int day = Integer.parseInt(wee.readLine());
        switch (day){
            case 1:
                System.out.println("Monday " + "Montag");
                break;
                case 2:
                System.out.println("Tuesday " + "Dienstag");
                break;
                case 3:
                System.out.println("Wednesday "+ "Mittwoch");
                break;
                case 4:
                System.out.println("Thursday "+ "Donnerstag");
                break;
                case 5:
                System.out.println("Friday "+ "Freitag");
                break;
                case 6:
                System.out.println("Saturday "+ "Samstag");
                break;
                case 7:
                System.out.println("Sunday "+ "Sonntag");
                break;
            default:
                System.out.println("Wrong!");
        }
        }
}
