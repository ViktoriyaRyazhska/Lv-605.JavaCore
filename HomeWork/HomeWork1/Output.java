package softserve.academy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Output {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name");
		String name = br.readLine();
		System.out.println("Where are you live, " + name + " ?");
		String address = br.readLine();
		System.out.println("Your name: " + name + "\n" + "You in live: " + address);
		
	}

}
/*
 * Define String variables name and address. Output question "What is your name?" 
 * Read the value name and output next question: “Where are you live, (name)?". 
 * Read address and write whole information.

 */