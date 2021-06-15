package lesson4.practTask3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContinentTest {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Continent[] allCont = Continent.values(); //������� ����� ���� Continent � ���� ��������� �������
		
		System.out.print("Enter name of the country: "); //������� ����������
		String country = br.readLine();
		
		for(Continent c: allCont) { //���� for each
			if(c.isCountryOn(country)) { //�������� ����� ���� �������� �� �������� ���� ����� �� ������ � ��������
				System.out.println("This country is in: "+c.toString().toLowerCase()); //������� ����� ����� � �������
				break;
			} 
		}
	}
}
