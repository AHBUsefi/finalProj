package FPr.shop.controller;

import FPr.shop.model.Customer;
import FPr.shop.model.User;
import FPr.shop.service.Shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop("MyShop", "www.myshop.com");

        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1 -> {
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
                }

                case 2 -> {
                    System.out.println("Enter username:");
                    String loginUsername = scanner.nextLine();
                    System.out.println("Enter password:");
                    String loginPassword = scanner.nextLine();

                    User user = shop.getUserService().authenticate(loginUsername, loginPassword);
                    if (user != null) {
                        System.out.println("Login successful! Welcome " + user.getUsername());
                    } else {
                        System.out.println("Invalid username or password. Please try again.");
                    }
                }

                case 3 -> System.exit(0);

                default -> System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
