package thirdone;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Problems {
	
	public enum Problem {
		Error400("Bad Request"),
		Error401("Unauthorized"),
		Error402("Payment Required"),
		Error403("Forbidden"),
		Error404("Not Found"),
		Error405("Method Not Allowed"),
		Error406("Not Acceptable");
		
		private String somethingWrong;
		
		Problem(String somethingWrong) {
			this.somethingWrong = somethingWrong;
		}
		
		public String getSomethingWrong() {
			return somethingWrong;
		}
		
		public String toString() {
			return somethingWrong;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is a number of your problem?");
		int problem = Integer.parseInt(br.readLine());
		System.out.print("The name of your problem is ");
		
		switch (problem) {
		case 400:
			System.out.println(Problem.valueOf("Error400"));
			break;
		case 401:
			System.out.println(Problem.valueOf("Error401"));
			break;
		case 402:
			System.out.println(Problem.valueOf("Error402"));
			break;
		case 403:
			System.out.println(Problem.valueOf("Error403"));
			break;
		case 404:
			System.out.println(Problem.valueOf("Error404"));
			break;
		case 405:
			System.out.println(Problem.valueOf("Error405"));
			break;
		case 406:
			System.out.println(Problem.valueOf("Error406"));
			break;
		}
	}
}