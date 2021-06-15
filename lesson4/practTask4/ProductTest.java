package lesson4.practTask4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductTest {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Product products[] = new Product[4];
		//�������� ����� ����� ���� Product ����������(���. ����������� �����)
		for(int i = 0; i<products.length; i++) {
			products[i] = new Product(br);
		}
		
		int maxPriceIndex = 0; //������� ����� ��� ����, ��� ����� ������ � �� ������, ����� � ����� � ��������� �������
		for(int i = 0; i<products.length; i++) {
			//�������� ������� � �������� [i] � ��������� � � ����� �������� ����, ���� ������ ������� �����, �� ���� �������� maxPriceIndex 
			if(products[i].getPrice()>products[maxPriceIndex].getPrice()) maxPriceIndex = i; 
		}
		System.out.println("The most expensive product is: " + products[maxPriceIndex].getName() 
				+ ", and its quantity: " + products[maxPriceIndex].getQuantity());
		
		int maxQuantityIndex = 0; //��� ����� �������, �� � ����, ������ ������� ��������
		for(int i = 0; i<products.length; i++) {
			if(products[i].getQuantity()>products[maxPriceIndex].getQuantity()) maxQuantityIndex = i;
		}
		System.out.println("Most quantity is: "+ products[maxQuantityIndex].getName());
	}

}
