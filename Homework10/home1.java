package Lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class home1 {
    //Enter in the console sentence of five words.
 //   display the longest word in the sentence
  //  determine the number of its letters
   // bring the second word in reverse order

    public static void main(String[] args) throws IOException {
        BufferedReader sent = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter in the console sentence of five words.");
        //the sentence of five words  - речення для консолі.
        String[] words = sent.readLine().split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word: " + longestWord + "\n" + "number of letters: " + longestWord.length());
        StringBuilder rev = new StringBuilder(words[1]);
        System.out.println("the second word in reverse: " + rev.reverse().toString() + ".");
    }
}
