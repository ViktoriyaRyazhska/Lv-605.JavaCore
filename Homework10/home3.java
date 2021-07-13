package Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class home3 {
    //Implement a pattern for US currency: the first symbol "$", then any number of digits,
    // dot and two digits after the dot.
    // Enter the text from the console that contains several occurrences of US currency.
    // Display all occurrences on the screen.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Pattern p = Pattern.compile("[\\$][\\d]+.[\\d]{2}");
        System.out.println("Enter text with occurrences of US currency :");
        String text = br.readLine();
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + " ");
        }
    }
}
