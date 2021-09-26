package cart;

public class Item {
    private String name;
    private Double price;
    private Integer quantity;
    private Double total;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.total = price * quantity;// calculate total price
    }

    public void updateQuantity(int quantity) {
        // update quantity and total price
        this.quantity = quantity;
        this.total = this.price * quantity;
    }

    public void showTotal() {
        // total cost of items
        System.out.println("Total cost of " + this.name + " x" + this.quantity + " : " + this.total);
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getTotal() {
        return this.total;
    }
}
