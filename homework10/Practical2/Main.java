package homework10.Practical2;

import java.io.*;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Plant[] plantArray = new Plant[5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = 0;
		String color = null;
		String type = null;

		for (int i = 0; i < plantArray.length; i++) {
			try {
				System.out.println("Please enter " + (i + 1) + " plant size: ");
				size = Integer.parseInt(br.readLine());
				System.out.println("Please enter " + (i + 1) + " plant color " + Arrays.toString(Color.values()) + " : ");
				color = br.readLine();
				System.out.println("Please enter " + (i + 1) + " plant type " + Arrays.toString(Type.values()) + " : ");
				type = br.readLine();
			} catch (IOException e) {
				System.err.println("Input/output exception!");
				e.printStackTrace();
			}
			try {
				plantArray[i] = new Plant(size, color, type);
			} catch (ColorException | TypeException e) {
				System.err.println(e.getMessage() + "\n");
				e.printStackTrace();
			}
		}
		
		for(Plant p : plantArray) {
			System.out.println(p);
		}
	}

}
