package Lesson10;

import java.io.IOException;

public class home2 {
    //Enter a sentence that contains the words between more than one space.
    // Convert all spaces, consecutive, one.
    // For example, if we introduce the sentence
    // "I    am      learning     Java   Core», we have to get the "I'm learning Java Core»
    public static void main(String[] args) throws IOException {
        String s = "I    am      learning     Java   Core";
        System.out.println(s.replaceAll("[ ]+", " ").replaceFirst("I am", "I'm"));

    }
}
