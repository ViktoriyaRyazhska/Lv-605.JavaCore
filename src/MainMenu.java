import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMenu {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter task number");
		try {
			switch(br.readLine()) {
			case "1":
				Task1.main(args);
				break;
			case "2":
				Task2.main(args);
				break;
			case "3":
				Task3.main(args);
				break;
			case "4":
				Task4.main(args);
				break;	
			case "5":
				Task5.main(args);
				break;
			case "6":
				Task1.main(args);
				break;
			case "7":
				Task1.main(args);
				break;
			case "8":
				Task1.main(args);
				break;
			case "9":
				Task1.main(args);
				break;
			case "10":
				Task1.main(args);
				break;
			case "11":
				Task11.main(args);
				break;
			case "12":
				Task12.main(args);
				break;
			case "13":
				Task13.main(args);
				break;
			case "14":
				Task14.main(args);
				break;
			}
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
