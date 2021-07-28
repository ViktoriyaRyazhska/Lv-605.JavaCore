package Challange;


import java.io.IOException;

import java.util.Scanner;

public class Task6 {
    //Input text and calculate number of words in this text
    public static void main(String[] args) throws IOException {
        System.out.println("Input text");
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();

        int count = 0;
        if(words.length() != 0){
            count++;
            for (int i = 0; i < words.length(); i++) {
                if(words.charAt(i) == ' '){
                    count++;
                }
            }
        }

        System.out.println("You input "+count+" words");


    }
}