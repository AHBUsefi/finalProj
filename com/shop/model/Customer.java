package com.shop.model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private List<Product> cart;
    private double wallet;

    public Customer(String username, String password, String email, String address, String phoneNumber) {
        super(username, password, email, address, phoneNumber);
        this.cart = new ArrayList<>();
        this.wallet = 0;
    }

    public void addToCart(Product product) {
        cart.add(product);
    }

    public void removeFromCart(Product product) {
        cart.remove(product);
    }

    public void addFunds(double amount) {
        wallet += amount;
    }

    public boolean checkout() {
        double total = cart.stream().mapToDouble(Product::getPrice).sum();
        if (total <= wallet) {
            wallet -= total;
            cart.clear();
            return true;
        } else {
            return false;
        }
    }
}
