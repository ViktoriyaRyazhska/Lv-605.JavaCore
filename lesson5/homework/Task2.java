package homewrok1;


import java.util.Arrays;
import java.util.Random;

public class Task2 {

	public static void main(String[] args) {
		
		// creating of array and filling with a random integers
	int[] numbers = new int [10];
	Random randNum = new Random ();
	
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = randNum.nextInt(20);
		}	
		
	int sum = 0;
	
		for (int i=0; i<5; i++) {
	
		sum += numbers[i];
		
	}
	int product =1;
	
	for (int i = 0; i>5 && i<numbers.length; i++) {
		product *=numbers[i];
	}
	
	String elemets = Arrays.toString(numbers);
	System.out.println("The arrays number are " + elemets );
	if ( sum > 0) {
		System.out.println("the sum of first 5 numer is positive and equal =  "  + sum);
	}else {
		
		System.out.println("The sum of first 5 number is negative, the product of last 5 number is - " + product);
	}
	
}
}