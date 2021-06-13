package homework1;

import java.io.*;

public class Task02 {
	
	public static void main(String[] args) {
		String name = null, adress = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("What is your name? ");
			name = br.readLine();
			System.out.println("Where do you live, " + name + "?");
			adress = br.readLine();
			System.out.println("Hi, " + name + " you live in " + adress +"!");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
