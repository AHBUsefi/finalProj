package FPr.shop.controller;

import FPr.shop.model.*;

import FPr.shop.service.Shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop("MyShop", "www.myshop.com");

        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Add Product");
            System.out.println("4. Remove Product");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter username:");
                    String username = scanner.nextLine();
                    System.out.println("Enter password:");
                    String password = scanner.nextLine();
                    System.out.println("Enter email:");
                    String email = scanner.nextLine();
                    System.out.println("Enter address:");
                    String address = scanner.nextLine();
                    System.out.println("Enter phone number:");
                    String phoneNumber = scanner.nextLine();

                    Customer customer = new Customer(username, password, email, address, phoneNumber);
                    shop.addUser(customer);
                    System.out.println("Registration successful!");
                    break;

                case 2:
                    System.out.println("Enter username:");
                    String loginUsername = scanner.nextLine();
                    System.out.println("Enter password:");
                    String loginPassword = scanner.nextLine();

                    User user = shop.getUserService().authenticate(loginUsername, loginPassword);
                    if (user != null) {
                        System.out.println("Login successful! Welcome " + user.getUsername());
                        // پس از ورود به سیستم، می‌توانید امکانات بیشتری را برای کاربر فعال کنید
                    } else {
                        System.out.println("Invalid username or password. Please try again.");
                    }
                    break;

                case 3:
                    System.out.println("Enter product name:");
                    String productName = scanner.nextLine();
                    System.out.println("Enter product price:");
                    double productPrice = scanner.nextDouble();
                    System.out.println("Enter product quantity:");
                    int productQuantity = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.println("Enter product category:");
                    String productCategory = scanner.nextLine();

                    Product product = new Product(productName, productPrice, productQuantity, productCategory);
                    shop.addProduct(product);
                    System.out.println("Product added successfully!");
                    break;

                case 4:
                    System.out.println("Enter product name to remove:");
                    String removeProductName = scanner.nextLine();
                    Product removeProduct = null;
                    for (Product prod : shop.getProducts()) {
                        if (prod.getName().equals(removeProductName)) {
                            removeProduct = prod;
                            break;
                        }
                    }
                    if (removeProduct != null) {
                        shop.removeProduct(removeProduct);
                        System.out.println("Product removed successfully!");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
