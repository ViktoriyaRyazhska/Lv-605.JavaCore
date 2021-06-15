package lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practTask1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number, counter = 0;
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter "+ (i+1)+"st");
			number = Integer.parseInt(br.readLine());
			if(number%2!=0) counter++;
		}
		System.out.println(counter+" of them are odd");
	}
}
