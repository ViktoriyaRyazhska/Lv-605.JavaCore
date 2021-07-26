package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Task2 {
	
	public static int readNumber (int start, int end) throws IOException, MyException {
		
		int number = 0;
		
		System.out.println("input the number, it must be in limits 1< >100");
		
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		number = Integer.parseInt(br.readLine());
		}catch(NumberFormatException e) {
			System.out.println("Enter the value, not a letter");
		}
		
		if ( (number < start) || (number > end)) {
			
			throw new MyException ("The entered values is out of limits");
			
		}else {
		
		return number;
	}
	}
	
	public static void main(String[] args) throws IOException {
		
		int [] arr = new int [10];
		
		for (int i = 0; i < arr.length; i++) {
		try {
			System.out.println(readNumber(1, 100));	
		}catch(MyException e) {
			System.err.print(e.getMessage());
			System.exit(0);
		}
		
		}	
	}

}
