package homework3;

import java.io.*;

public class FloatInTheRange {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float[] flArray = new float[3];
		boolean result = true;
		for (int i = 0; i < flArray.length; i++) {
			System.out.println("Please enter " + (i + 1) + " float number: ");
			try {
				flArray[i] = Integer.parseInt(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		for(float f : flArray) {
			if((f<-5) || (f>5)) {
				result = false;
			}
		}
		if(result) {
			System.out.println("All numbers belong to the range [-5,5]");
		}
		else {
			System.out.println("Not all of your numbers belong to the range [-5,5]");
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
