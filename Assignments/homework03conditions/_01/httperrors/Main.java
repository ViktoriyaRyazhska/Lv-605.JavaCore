package homework03conditions._01.httperrors;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//read number of HTTP Error (400, 401, 402, …) and write the name of this error (Declare enum HTTPError)

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of the error:");
		int errorNumber = Integer.parseInt(br.readLine());

		switch (errorNumber) {
		case 400:
			System.out.println(HttpErrors.BAD_REQUEST);
			break;
		case 401:
			System.out.println(HttpErrors.UNAUTHORIZED);
			break;
		case 403:
			System.out.println(HttpErrors.FORBIDDEN);
			break;
		case 404:
			System.out.println(HttpErrors.NOT_FOUND);
			break;
		case 500:
			System.out.println(HttpErrors.INTERNAL_SERVER_ERROR);
			break;
		default:
			System.out.println("Invalid error number.");
			break;
		}
	}
}
