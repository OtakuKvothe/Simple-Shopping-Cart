package cart;

import java.util.LinkedList;

public class Cart {

    private LinkedList<Item> items;

    public Cart() {
        items = new LinkedList<>();
    }

    public int showCart() {
        // print all contents of cart
        if (!items.isEmpty()) {// if cart is not empty
            System.out.println("\n\n ----- Cart Items ----- \n\n");
            for (Item i : items) {
                System.out.println("Name : " + i.name + ", Price : " + i.price + ", Quantity : " + i.quantity
                        + ", Total : " + i.total + "\n");
            }
            return 1;
        }
        return -1;
        // if cart is empty, return -1 to Menu.showCart() for printng error message
    }

    public int calculateBill() {
        // print all contents of cart and show total amount
        if (!items.isEmpty()) {
            System.out.println("\n\n ----- ~~ Total Bill ~~ ----- \n\n");
            double total = 0.0;
            for (Item i : items) {
                System.out.println("Name : " + i.name + ", Price : " + i.price + ", Quantity : " + i.quantity
                        + ", Total : " + i.total + "\n");
                total = total + i.total;
            }
            System.out.println("\n****  Total Amount : " + total + "  ****\n");
            return 1;
        }
        return -1;
    }

    public void addItem(String name, double price, int quantity) {
        // add a new item to the list of items
        Item i = new Item(name, price, quantity);
        items.add(i);
        System.out.println("\n\n ----- Items Added Successfully ----- \n\n");

        // print total cost of the item
        i.showTotal();
    }

    public int updateQuantity(String name, int quantity) {
        // find item by name and update quantity parameter
        for (Item i : items) {
            if (i.name.equals(name)) {
                i.updateQuantity(quantity);
                System.out.println("\n\n ----- Items Updated Successfully ----- \n\n");
                return 1;
            }
        }
        return -1;
    }

    public int removeItem(String name) {
        // find item by name and remove from item list
        for (Item i : items) {
            if (i.name.equals(name)) {
                items.remove(i);
                System.out.println("\n\n ----- Items Removed Successfully ----- \n\n");
                return 1;
            }
        }
        return -1;
    }
}