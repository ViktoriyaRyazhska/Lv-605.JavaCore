package challange;

import java.io.*;

import homework10.Task1;

public class Main {
	
	public static void main(String[] args) {
		int taskNumber = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter task number: ");
		try {
			taskNumber = Integer.parseInt(reader.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		switch(taskNumber) {
			case 1:
				Task1.main(null);
			case 2:
				Task2.main(null);
			case 3:
				Task3.main(null);
			case 4:
				Task4.main(null);
			case 5:
				Task5.main(null);
			case 6:
				Task6.main(null);
			case 7:
				Task7.main(null);
			case 8:
				Task8.main(null);
			case 9:
				Task9.main(null);
			case 10:
				Task10.main(null);
		}
	}

}
