package lesson4.practTask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContinentTest {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Continent[] allCont = Continent.values(); //Утворюю масив типу Continent з усіма можливими обєктами
		
		System.out.print("Enter name of the country: "); //вводити англійською
		String country = br.readLine();
		
		for(Continent c: allCont) { //цикл for each
			if(c.isCountryOn(country)) { //викликаю метод який перевіряє чи присутня така країна на одному з материків
				System.out.println("This country is in: "+c.toString().toLowerCase()); //виводжу назву країни в консоль
				break;
			} 
		}
	}
}
