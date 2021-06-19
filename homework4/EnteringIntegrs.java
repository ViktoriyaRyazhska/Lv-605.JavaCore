package homework4;

import java.io.*;

public class EnteringIntegrs {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int productOfEven = 1;
		int current = 0;
		while (true) {
			System.out.println("Please input integer: ");
			try {
				current = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
			if(current < 0) {
				break;
			}
			if(current % 2 == 0 ) {
				productOfEven *= current;
			}
		}
		if(productOfEven == 1) {
			System.out.println("There is no even numbers.");
		}else {
			System.out.println("Product of all even numbers is: " + productOfEven);
		}
		
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
