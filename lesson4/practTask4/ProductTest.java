package lesson4.practTask4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductTest {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Product products[] = new Product[4];
		//заповнюю масив обєктів типу Product значеннями(див. конструктор класу)
		for(int i = 0; i<products.length; i++) {
			products[i] = new Product(br);
		}
		
		int maxPriceIndex = 0; //створюю змінну для того, щоб пізніше внести в неї індекс, обєкту в масиві з найбільшою вартістю
		for(int i = 0; i<products.length; i++) {
			//прорівнюю продукт з індексом [i] з продуктом з у якого найбільша ціна, якшо перший продукт більше, то міняю значення maxPriceIndex  
			if(products[i].getPrice()>products[maxPriceIndex].getPrice()) maxPriceIndex = i; 
		}
		System.out.println("The most expensive product is: " + products[maxPriceIndex].getName() 
				+ ", and its quantity: " + products[maxPriceIndex].getQuantity());
		
		int maxQuantityIndex = 0; //той самий принцип, що і вище, тільки з кількістю продукту
		for(int i = 0; i<products.length; i++) {
			if(products[i].getQuantity()>products[maxPriceIndex].getQuantity()) maxQuantityIndex = i;
		}
		System.out.println("Most quantity is: "+ products[maxQuantityIndex].getName());
	}

}
