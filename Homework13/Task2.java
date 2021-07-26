package Lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    //Create two methods String encrypt(String s, int n) and String decrypt(Sting s, int n)
    //Method encrypt should take a string and return coded string where every letter is moved on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should return decoded value

    public static StringBuffer encrypt(String s, int n) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                char ch = (char) (((int) s.charAt(i) +
                        n - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) s.charAt(i) +
                        n - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
    public static StringBuffer decrypt(String s, int n) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                char ch = (char) (((int) s.charAt(i) +
                        n - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) s.charAt(i) +
                        n - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        int Count = 1;
        System.out.println("Write something secret");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String originalText = br.readLine();
        System.out.println("Cipher Example");
        System.out.println("Text  : " + originalText);
        System.out.println("Encryption");
        String magic = encrypt(originalText, Count).toString();
        System.out.println("Encrypted Cipher: " + magic);
        System.out.println("Decryption");
        String decryptedText = decrypt(magic, 26 - Count).toString();
        System.out.println("Decrypted Text  : " + decryptedText);
    }

}
