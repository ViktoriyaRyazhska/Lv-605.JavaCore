package Homework4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Product {
//    Create class Product with fields name, price and quantity.
//Create four instances of type Product.
//Display the name and quantity of the most expensive item.
//Display the name of the items, which has the biggest quantity.

    private String name;
    private int price;
    private int quantity;

    public Product(BufferedReader br) throws IOException {
        System.out.print("name: ");
        name = br.readLine();
        System.out.print("price: ");
        price = Integer.parseInt(br.readLine());
        System.out.print("quantity: ");
        quantity = Integer.parseInt(br.readLine());
    }

    public static Product findMaxQuantityProduct(Product product1, Product product2, Product product3, Product product4) {
        Product maxQuantityProduct = product1;
        if (product2.getQuantity() > maxQuantityProduct.getQuantity()) {
            maxQuantityProduct = product2;
        }
        if (product3.getQuantity() > maxQuantityProduct.getQuantity()) {
            maxQuantityProduct = product3;
        }
        if (product4.getQuantity() > maxQuantityProduct.getQuantity()) {
            maxQuantityProduct = product4;
        }
        return maxQuantityProduct;
    }

    public static void findMaxPrice(Product product1, Product product2, Product product3, Product product4) {
        if ((product1.getPrice() > product2.getPrice()) &&
                (product1.getPrice() > product3.getPrice()) && (product1.getPrice() > product4.getPrice())) {
            System.out.println("The most expensive item " + product1.getName() + " " + product1.getQuantity());
        } else if ((product2.getPrice() > product1.getPrice()) &&
                (product2.getPrice() > product3.getPrice()) && (product2.getPrice() > product4.getPrice())) {
            System.out.println("The most expensive item " + product2.getName() + " " + product2.getQuantity());
        } else if ((product3.getPrice() > product2.getPrice()) &&
                (product3.getPrice() > product1.getPrice()) && (product3.getPrice() > product4.getPrice())) {
            System.out.println("The most expensive item " + product3.getName() + " " + product3.getQuantity());
        } else  {
            System.out.println("The most expensive item " + product4.getName() + " " + product4.getQuantity());
        }
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