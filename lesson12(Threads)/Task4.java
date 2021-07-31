package homework2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
	
	
	public static void main(String[] args) throws IOException {
	
		
		File file1 = new File ( "D:\\2\\Lv-605.JavaCore\\Lesson12(Threads)\\file1");
		File file2 = new File ("D:\\2\\Lv-605.JavaCore\\Lesson12(Threads)\\file2");
		System.out.println(file2.createNewFile());
		
		BufferedReader br = new BufferedReader(new FileReader(file1));
		BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
		
		
		List<String> listOfLines = new ArrayList<>();
		String line;
		try {
			while ((line = br.readLine()) != null) {
				listOfLines.add(line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
