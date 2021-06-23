package softserveJavaCore.lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HM1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter radius:");
		double radius = Double.parseDouble(br.readLine());
		System.out.println("Perimeter: " + 2*Math.PI*radius+
						 "\nArea: "+ Math.PI*Math.pow(radius, 2));
	}
}
