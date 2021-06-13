import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Feeling {
    public static void main(String[] args) {

        String feel;
        Scanner sc = new Scanner(System.in);


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("How are you?");
            feel = br.readLine();

            System.out.println("You are " + feel + '.');

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
