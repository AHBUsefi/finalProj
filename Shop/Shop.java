public class Shop {
    private String name;
    private String website;
    private List<User> users;
    private List<Product> products;
    private List<Order> orders;

    public Shop(String name, String website) {
        this.name = name;
        this.website = website;
        this.users = new ArrayList<>();
        this.products = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addProduct(Product product) {
        products.add(product);
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
}
