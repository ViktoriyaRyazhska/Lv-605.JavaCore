package Homework4;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ProductMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Product product1 = new Product(br);
        Product product2 = new Product(br);
        Product product3 = new Product(br);
        Product product4 = new Product(br);
        Product.findMaxPrice(product1,product2,product3,product4);
        Product maxQuantityProduct = Product.findMaxQuantityProduct(product1, product2, product3, product4);
        System.out.println("Max quantity product is:" + maxQuantityProduct.getName());



    }


}
