package homework11threadsIO._04.careerfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> file1Array = new ArrayList<>();
		String file1 = "C:\\Users\\Geneue\\Desktop\\file1.txt";
		String file2 = "C:\\Users\\Geneue\\Desktop\\file2.txt";
		int longest = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
			String s = null;
			try {
				while ((s = br.readLine()) != null) {
					file1Array.add(s);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			System.out.println("Couldn't find the specified file.");
			;
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file2))) {
			bw.write("The number of lines in file1 is: " + file1Array.size() + "\n");

			longest = file1Array.get(0).length();

			for (int s = 0; s < file1Array.size(); s++) {
				if (file1Array.get(s).length() > longest) {
					longest = file1Array.get(s).length();
				}
			}
			
			bw.write("The longest line in file1 is: " + longest + " symbols long.\n");
			bw.write("Eugene 10.28.1989\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
