package softserve.academy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CostOfCall {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double c1 = 3.23d , c2 = 2.45d , c3 = 6.46d;
		
		System.out.println("call to the USA will cost " + c1 + " $ per minute"); 
		System.out.println("call to the UK will cost " + c2 + " $ per minute"); 
		System.out.println("call to the UA will cost "+ c3 + " $ per minute"); 
		System.out.println(""); 
		System.out.println("Rates are charged per minute"); 
		System.out.println(""); 
		
		System.out.println("How long you wont to speak with USA"); 
		double t1 = Double.parseDouble(br.readLine());
		System.out.println("How long you wont to speak with UK");
		double t2 = Double.parseDouble(br.readLine());
		System.out.println("How long you wont to speak with UA");
		double t3 = Double.parseDouble(br.readLine());
		System.out.println(""); 
		
		double rate1 = c1*t1;
		double rate2 = c2*t2;
		double rate3 = c3*t3;
		
		String a = String.format("%.2f", rate1);
		System.out.println("Your call with USA will cost " + a);
		String b = String.format("%.2f", rate2);
		System.out.println("Your call with UK will cost " + b);
		String c = String.format("%.2f", rate3);
		System.out.println("Your call with UA will cost " + c);
		System.out.println(""); 
		
		double together = rate1+rate2+rate3;
		
		String d = String.format("%.2f", together );
		System.out.println("All calls together will cost " + d ); 
		
	}
}
/*
Phone calls from three different countries are с1, с2 and с3 standard units per minute.
Talks continued t1, t2 and t3 minutes. 
How much computer will count for each call separately and all talk together?
Input all source data from console, make calculations and output to the screen. 
*/