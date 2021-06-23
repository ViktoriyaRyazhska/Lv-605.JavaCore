package softserveJavaCore.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW3_2 {
	public static void main(String[] args)  throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c1,c2,c3;
		int t1,t2,t3;
		int sum = 0;
		System.out.println("Enter source data:");
		
		System.out.print("Enter c1:");
		c1=Integer.parseInt(br.readLine());
		System.out.print("Enter c2:");
		c2=Integer.parseInt(br.readLine());
		System.out.print("Enter c3:");
		c3=Integer.parseInt(br.readLine());
		
		System.out.print("Enter t1:");
		t1=Integer.parseInt(br.readLine());
		System.out.print("Enter t2:");
		t2=Integer.parseInt(br.readLine());
		System.out.print("Enter t3:");
		t3=Integer.parseInt(br.readLine());
		
		System.out.println("1-talk = "+ c1*t1);
		sum+=c1*t1;
		System.out.println("2-talk = "+ c2*t2);
		sum+=c2*t2;
		System.out.println("3-talk = "+ c3*t3);
		sum+=c3*t3;
		
		System.out.println("All talk together: "+sum);
	}
}
