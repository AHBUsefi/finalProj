package FPr.shop.service;

import FPr.shop.model.*;

import com.shop.model.*;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String name;
    private String website;
    private List<User> users;
    private List<Product> products;
    private List<Order> orders;
    private UserService userService;

    public Shop(String name, String website) {
        this.name = name;
        this.website = website;
        this.users = new ArrayList<>();
        this.products = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.userService = new UserService(users);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<User> getUsers() {
        return users;
    }

    public UserService getUserService() {
        return userService;
    }
}
