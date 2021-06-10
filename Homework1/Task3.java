package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the name and spent time of first country");
		String c1 = br.readLine();
		int t1 =Integer.parseInt(br.readLine());
		System.out.println("Please enter the name and spent time of second country");
		String c2 = br.readLine();
		int t2 =Integer.parseInt(br.readLine());
		System.out.println("Please enter the name and spent time of third country");
		String c3 = br.readLine();
		int t3 =Integer.parseInt(br.readLine());
		int total = t1+t2+t3;
		
		System.out.println("Time spent for - " + c1 + " is - " + t1);
		System.out.println("Time spent for - " + c2 + " is - " + t2);
		System.out.println("Time spent for - " + c3 + " is - " + t3);
		System.out.println("Time spent in total - " + total);
		
	}
}
