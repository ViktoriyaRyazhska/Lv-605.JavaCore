package homework3;

import java.io.*;

public class HTTPerrorFinder {

	public static void main(String[] args) {
		int errorCode = 0;
		String request = "e";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the number of HTTP Error: ");
		try {
			errorCode = Integer.parseInt(br.readLine());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if (errorCode < 400 || errorCode > 408) {
			System.out.println("You have entered unknown error code.");
		} else {
			// I have created variable "request" just because you can't
			// create ENUM with numbers: 400, 401, 402 ... etc.
			// Not sure this is a good solution but it is simple.
			request += errorCode;
			HTTPError httpError = HTTPError.valueOf(request);

			System.out.println("The name of this error is: " + httpError.nameOfError);
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
