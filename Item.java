package cart;

public class Item {
    String name;
    Double price;
    Integer quantity;
    Double total;

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
}
