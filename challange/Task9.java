package challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Random;

public class Task9 {
	
	static Random random = new Random();
	static int count0 = 0;
	static int count1 = 0;
	
	public static void randNum(int inputNum) {
		
		for(int i=0; i < inputNum; ++i) {
			int n = random.nextInt(2);
			System.out.println(n);
			if(n == 1) {
				++count1;
			}else ++count0;
		}
		
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many times you want the program to work? Enter the number");
		int count = Integer.parseInt(br.readLine());
		randNum( count);
		System.out.println(" the amout for 1" +" "+ count1 + "The amout of 0" + " "+count0);
	}
}

