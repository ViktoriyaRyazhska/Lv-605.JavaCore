package lesson4.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HomeWork1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float[] floatArr = new float[3];
		int[] integerArr = new int[3];
		//task1
		System.out.println("Enter 3 float numbres: ");
			for(int i = 0; i<floatArr.length; i++) {
				floatArr[i] = Float.parseFloat(br.readLine());
				System.out.println(floatArr[i]+" belong to [-5;5]? "+ checkRange(floatArr[i])); //звертаюсь до метода, описаного нище
		}  
		//task2
		System.out.println("Enter 3 integer numbres: ");
			for(int i = 0; i<integerArr.length; i++) {
				integerArr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(integerArr); //За допомогою метода sort з классу Arrays сортую масив за зростанням
		System.out.println("Minimum = " + integerArr[0]); //Виводжу мінімальний, тобто перший елемент
		System.out.println("Maximum = " + integerArr[integerArr.length-1]); //максимальний, тобто останній
		
		//task3
		System.out.println("Enter error code (400 to 407): ");
		int errorCode = Integer.parseInt(br.readLine());
		HTTPError[] errors = HTTPError.values();
		
		if(errorCode>errors.length+400 || errorCode<400) {
			System.out.println("You entered wrong code!");
		} else {
			System.out.println("You error is: "+ errors[errorCode-400]);
		}
	}
	
	public static boolean checkRange(float number){ //Приймаю число і повертаю false, якщо проходить умова, в усіх інших випадках true
		return (number < -5) || number > 5;
	}
}
