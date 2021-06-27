package homewrok1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task3 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {		
		
		/*// first part
		
		
		//variables
		int [] arr = { -2,5,10,3,-15};
		int posCounter = 0;
		int pos2 = 0;
		int secondPos =0;
		int min = 0;
		int posMin = 0;
		
		// finding the second positive number and it's position in array
		
		for (int i = 0; i < arr.length; i ++) {
			
			if ( arr[i] > 0) {
				pos2 = arr[i];
				posCounter ++;
				if (posCounter == 2) {
					secondPos = i+1;
					break;
				}
			}
		}
		
		// finding the minimum number and it's positions in array
		for(int i=0; i<arr.length; i++) {
			if (arr[i] < min) {
			min = arr[i];
			posMin = i +1;
		}
			}
		System.out.println("The minimun number of arrays is - " + min + "\n" + "Its position is -  " + posMin);
		System.out.println("The second positive number - " + pos2 + "\n" + "Its postion is - " + secondPos );
	}*/

	// Second part
	
	 
	 // filling the array

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int product =0;
	int [] arr2 = new int [5];
	
	System.out.println("Enter the 5 numbers");
	for (int i=0; i< arr2.length; i++) {
		
	arr2[i] = Integer.parseInt(br.readLine());
	
	
	if (arr2 [i]<0) {
		System.out.println("You have entered the negative number");
		System.exit(0);		
	}
	
	for (int s =0; s < arr2.length; s++) {
		if (arr2[i] % 2 == 0 ) {
			product *= arr2[i];
		}
		
	}
}
	
	
	// showing the number is the filled array + product of even numbers
	
	String elements = Arrays.toString(arr2);
	System.out.println("The numbers of array are - " +elements + "\n" + " The prodcut of even numbers is " + product);
	
	
	
	
	
	
	}
	
}