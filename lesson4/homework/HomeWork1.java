package lesson4.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float[] floatArr = new float[3];
		int[] integerArr = new int[3];
		
		
		
		System.out.println("Enter 3 float numbres: ");
		for(int i = 0; i<floatArr.length; i++) {
			floatArr[i] = Float.parseFloat(br.readLine());
			System.out.println("");
			
		}
		System.out.println("Enter 3 integer numbres: ");
		for(int i = 0; i<integerArr.length; i++) {
			integerArr[i] = Integer.parseInt(br.readLine());
		}
		
	}
	public static boolean checkRange(float number){
		if((number < -5) || number > 5) {
				return false;
			} 
		return true;
	}
}
