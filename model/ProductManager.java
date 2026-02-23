package model;

import model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        boolean choice = true;

        while (choice) {

            System.out.println("Enter Product Name:");
            String name = input.nextLine();

            System.out.println("Enter Price:");
            double price = input.nextDouble();

            System.out.println("Enter Quantity:");
            int quantity = input.nextInt();
            input.nextLine();

            System.out.println("Enter Category:");
            String category = input.nextLine();

            productList.add(new Product(name, price, quantity, category));

            System.out.println("Add more products? (y/n)");
            char c = input.next().charAt(0);
            input.nextLine();

            if (c == 'n' || c == 'N') {
                choice = false;
            }
        }

        System.out.println("\n--- Product List ---");

        for (Product product : productList) {
            System.out.println(product);
        }

        input.close();
    }
}