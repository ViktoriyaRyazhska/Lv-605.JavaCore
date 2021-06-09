import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson1 {
    public static void main(String[] args) throws IOException {
        BufferedReader wt = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How are you?");
        String text = wt.readLine();
        System.out.println("You are " + text);


        }

    }

