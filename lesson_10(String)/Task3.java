package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		Pattern pattern = Pattern.compile("\\$\\d*\\.\\d{2}");
		System.out.println("Enter some curency");
		String text = br.readLine();
	    Matcher m = pattern.matcher(text);
	      
	    while (m.find()) {
	            System.out.print(text.substring(m.start(), m.end()) + " ");
	        }
		
	}
}
