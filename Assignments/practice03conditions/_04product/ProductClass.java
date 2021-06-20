package practice03conditions._04product;

//Create class Product with fields name, price and quantity.
//Create four instances of type Product. 
//Display the name and quantity of the most expensive item.
//Display the name of the items, which has the biggest quantity.

class Product {

	private String name;
	private double price;
	private double quantity;

	public Product(String name, double price, double quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getQuantity() {
		return quantity;
	}

}

public class ProductClass {

	public static void main(String[] args) {

		Product tv = new Product("Television set", 4500, 9);
		Product coffeemashine = new Product("Coffeemashine", 2400, 3);
		Product sugar = new Product("Kilos of sugar", 26.45, 157.8);
		Product wineBottles = new Product("Bottles of wine", 120, 17);

		Product mostExpensive = tv;
		if (coffeemashine.getPrice() > mostExpensive.getPrice()) {
			mostExpensive = coffeemashine;
		}
		if (sugar.getPrice() > mostExpensive.getPrice()) {
			mostExpensive = sugar;
		}
		if (wineBottles.getPrice() > mostExpensive.getPrice()) {
			mostExpensive = wineBottles;
		}
		System.out.println("The most expensive position is: " + mostExpensive.getName() + ". "
				+ mostExpensive.getQuantity() + " items left.");

		Product bigestQuantity = tv;
		if (coffeemashine.getQuantity() > bigestQuantity.getQuantity()) {
			bigestQuantity = coffeemashine;
		}
		if (sugar.getQuantity() > bigestQuantity.getQuantity()) {
			bigestQuantity = sugar;
		}
		if (wineBottles.getQuantity() > bigestQuantity.getQuantity()) {
			bigestQuantity = wineBottles;
		}
		System.out.println("The biggest quantity item is: " + bigestQuantity.getName() + ".");
	}

}
