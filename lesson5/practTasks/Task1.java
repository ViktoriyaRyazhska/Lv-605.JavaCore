package lesson5.practTasks;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
	public static void main(String[] args) {
		Random rnd = new Random(); //створюю обєкт классу Рандом
		int[] numbers = new int[10];
		int sum = 0, maxNumberIndex = 0, negativeNumbersAmount = 0;
		
		//присвоюю кожному елементу масиву рандомне значення в межах від -10 до 10
		for(int i = 0; i<numbers.length; i++) { 
			numbers[i] = rnd.nextInt(20)-10;
		}
		System.out.println(Arrays.toString(numbers));
		//перебираю усі занчення в масив
		for(int i = 0; i<numbers.length; i++) {
			if(numbers[i]>numbers[maxNumberIndex]) maxNumberIndex = i; 
			if(numbers[i]>0) sum+=numbers[i];
			if(numbers[i]<0) negativeNumbersAmount++;
		}
		
		System.out.println("Biggest number: " + numbers[maxNumberIndex]
				+ "\nSum of positive numbers: " + sum
				+ "\nAmount of negative nubmers: "+ negativeNumbersAmount);
		
		if((numbers.length-negativeNumbersAmount)<negativeNumbersAmount) {
			System.out.println("There are more negative values");
		} else {
			System.out.println("There are more positive values");
		}
	}
}
