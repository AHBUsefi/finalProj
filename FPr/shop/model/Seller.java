package FPr.shop.model;


import java.util.ArrayList;
import java.util.List;

public class Seller extends User {
    private List<Product> products;

    public Seller(String username, String password, String email, String address, String phoneNumber) {
        super(username, password, email, address, phoneNumber);
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
