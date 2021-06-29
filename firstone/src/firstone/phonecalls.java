package firstone;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class phonecalls {

	public static void main(String[] args) throws IOException {
		
		int c1 = 27;
		int c2 = 32;
		int c3 = 38;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("If I speak for ");
		int minutesU = Integer.parseInt(br.readLine());
		
		System.out.println("i spend: " + minutesU * c1 + " hryvna in conversation with Ukraine;");
		
		System.out.println("If I speak for ");
		int minutesC = Integer.parseInt(br.readLine());
		
		System.out.println("i spend: " + minutesC * c2 + " hryvna in conversation with Canada;");
		
		System.out.println("If I speak for ");
		int minutesG = Integer.parseInt(br.readLine());
		
		System.out.println("i spend: " + minutesG * c3 + " hryvna in conversation with Germany;");
		
		System.out.println("In total it will costs " + (minutesU * c1 + minutesC * c2 + minutesG * c3) + " hryvna.");
	}

}