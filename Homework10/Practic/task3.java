package Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader blin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 5 names ");
        String s = blin.readLine();
        //String[] names = {s} ;
        String[] names = s.split(" ");
        //for (int i = 0; i < 5; i++)
        for (String n : names) {
           System.out.println(n + " " + procrust(n));
        }
    }
    // як написати щоб воно 5 раз викликалось ?(
    public static boolean procrust(String name) {
        String pattern = "\\w{3,15}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(name);
        return m.matches();
    }
}
