package Lesson_1_JavaCore_Introduction.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2_OutputQestion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("%s\n", "How are you?");
        String str = br.readLine();
        System.out.printf("You are (answer):\n %s", str);
    }
}
