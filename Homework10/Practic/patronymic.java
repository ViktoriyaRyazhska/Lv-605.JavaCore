package Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patronymic {
    //Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
    //surnames and initials
    //name
    //name, middle name and last name
    //Schepanskiy Danilo Mikhailovich (тут беремо текст)
    public static void main(String[] args) throws IOException {
        BufferedReader blin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter surname, name and patronymic");
        String s = blin.readLine();
        System.out.println(s);
        String[] names = s.split(" ");
        System.out.println(names[0] + " " + names[1].charAt(0) +  "." + names[2].charAt(0) +  ".");
           System.out.println(names[1]);
            System.out.println(names[1] + " " + names[2] + " " + names[0]);

    }



    }

