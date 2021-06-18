

package com.edu;

public class HomeWork4_2 {
	public static void main(String[] args) {
	    int numbers[] = { 92, -108, 2 };
	    int min, max;
	    min = max = numbers[0];

	    for (int x = 1; x < 3; x++) {
	        if (numbers[x] < min)
	            min = numbers[x];
	        if(numbers[x] > max){
	            max = numbers[x];
	        }
	    }
	    System.out.println("min is: " + min + " ; max is: " + max);
	}
	}