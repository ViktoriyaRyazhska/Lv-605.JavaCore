package homework1;

import java.io.*;

public class Task01 {
	
	public static void main(String[] args) {
		double radius = 0.0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter radius of your flower bed: ");
		try {
				radius = Double.parseDouble(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Perimeter of your bed is: " +2*Math.PI*radius);
		System.out.println("Area of your bed is: " +Math.PI*Math.pow(radius, 2));
	}
}