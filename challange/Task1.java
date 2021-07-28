package challange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	// 4. Input string and calculate number of loud letters (e.g. word: “My test
	// text”, result: 3)
	public static void main(String[] args) throws IOException {
		String S = "aeyuio";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		int counter = 0;
		for (String b : text.split(""))
			if (S.contains(b)) {
				counter++;
			}
		System.out.println("number of loud letters " + counter);

	}

}
