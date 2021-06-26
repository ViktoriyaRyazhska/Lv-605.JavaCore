package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int code = Integer.parseInt(br.readLine());
		 switch (code){
			 case 400:
				 System.out.println("The error name is " + HTTPError.BAD_REQUEST);
				 break;
			 case 401:
				 System.out.println("The error name is "+ HTTPError.UNAUTHORIZED);
				 break;
			 case 402:
				 System.out.println("The error name is " +HTTPError.PAYMENT_RQUIRED);
				 break;
			 case 403:
				 System.out.println("The error name is " + HTTPError.FORBIDDEN);
				 break;				 
			 case 404:
				 System.out.println("The error name is " + HTTPError.NOT_FOUND);
				 default:
					 System.out.println("There isn't such error code");
				
		 }
	
		
		
	

}
}