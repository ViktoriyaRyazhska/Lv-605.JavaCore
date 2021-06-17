package homework3;

import java.io.*;

class Product {
	private int id = 0;
	private static int count = 0;
	private String name;
	private double price = 0.0;
	private int quantity = 0;

	public Product() {
		this.id = ++count;
	}

	public Product(String name) {
		super();
		this.name = name;
	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public void input(BufferedReader br) {
		System.out.println("Please enter the name of the product " + this.id + " : ");
		try {
			this.name = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Please enter the price of the product: ");
		try {
			this.price = Double.parseDouble(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Please enter the quantity of the product: ");
		try {
			this.quantity = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class Task04 {
	public static void main(String[] args) {
		Product test = new Product("otonoe", 15.0, 120);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Product[] products = new Product[4];	
		for (int i = 0; i < products.length; i++) {
			products[i] = new Product();
		}
		for(Product p : products) {
			p.input(br);
		}
		//the most expensive output:
		Product theMostExpensiveProduct = products[0];
		for (int i = 1; i < products.length; i++) {
			if(products[i].getPrice() > theMostExpensiveProduct.getPrice()) {
				theMostExpensiveProduct = products[i];
			}
		}
		System.out.println("The most expensive product is : " + theMostExpensiveProduct.getName() + ". Its quantity is : " + theMostExpensiveProduct.getQuantity());
		//the biggest quantity output:
		Product theBiggestQuantityProduct = products[0];
		for (int i = 1; i < products.length; i++) {
			if(products[i].getQuantity() > theBiggestQuantityProduct.getQuantity()) {
				theBiggestQuantityProduct = products[i];
			}
		}
		System.out.println("The product : " + theBiggestQuantityProduct.getName() + " has the biggest quentity (" + theBiggestQuantityProduct.getQuantity() + ").");
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
