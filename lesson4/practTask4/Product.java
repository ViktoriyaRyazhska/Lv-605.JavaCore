package lesson4.practTask4;

import java.io.BufferedReader;
import java.io.IOException;

public class Product {
	private static int ID = 1;
	private String name;
	private int price;
	private int quantity;
	
	//конструктор в якому зчитую всі поля з консолі
	public Product(BufferedReader br) throws IOException{
		System.out.println("Enter values for " + ID + "st product");
		ID++;
		System.out.print("name: ");
		name = br.readLine();
		System.out.print("price: ");
		price = Integer.parseInt(br.readLine());
		System.out.print("quantity: ");
		quantity = Integer.parseInt(br.readLine());
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
