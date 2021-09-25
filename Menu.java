package cart;

import java.util.Scanner;

public class Menu {

    private Scanner sc;
    private Cart cart;

    public Menu() {
        sc = new Scanner(System.in);
        cart = new Cart();
    }

    public void showMenu() {
        while (true) {
            System.out.println("\n ----- Welcome To Cart Menu ----- \n");
            System.out.println("\n ----- PLease enter your choice ----- \n");
            System.out.println(
                    "\n1. View Cart Contents\n2. View Total Bill \n3. Add a new Item \n4. Update Quantity of an Item \n5. Remove an Item \n6. Exit Program  \n");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    showCart();
                    break;

                case 2:
                    calculateBill();
                    break;

                case 3:
                    addItem();
                    break;

                case 4:
                    updateQuantity();
                    break;

                case 5:
                    removeItem();
                    break;

                case 6:// give user choice to end the program
                    System.out.println("\n\n ----- Program will now close down ----- \n\n");
                    System.exit(0);

                default:// program will not close if invalid value is entered
                    System.out.println("Bad Choice. Please Try Again");
            }
        }
    }

    public void showCart() {
        int x = cart.showCart();
        if (x == -1) {// if cart is empty
            System.out.println("\n ----- Cart Is Empty ----- \n");
        }
    }

    public void calculateBill() {
        int x = cart.calculateBill();
        if (x == -1) {// if cart is empty
            System.out.println("\n ----- Cart Is Empty ----- \n");
        }
    }

    public void updateQuantity() {
        // input name and desired quantity
        System.out.println("\nPlease Enter Name of Item : ");
        String name = sc.next();
        System.out.println("\nPlease enter required quantity : ");
        int quantity = sc.nextInt();

        int x = cart.updateQuantity(name, quantity);

        // if item is not present in the cart
        if (x == -1) {
            System.out.println("\n ----- The Item Is Not In Cart ----- \n");
        }
    }

    public void addItem() {
        // input item details
        System.out.println("\n ----- Please Enter Details of New Items ----- \n");
        System.out.println("\nName : ");
        String name = sc.next();
        System.out.println("\nPrice : ");
        double price = sc.nextDouble();
        System.out.println("\nQuantity : ");
        int quantity = sc.nextInt();

        // adding item
        cart.addItem(name, price, quantity);
    }

    public void removeItem() {
        // input item name
        System.out.println("\n ----- Please Enter Details of Items for Removal ----- \n");
        System.out.println("\nName : ");
        String name = sc.next();

        // remove item
        int x = cart.removeItem(name);

        // in case item is not in list
        if (x == -1) {
            System.out.println("\n ----- The Item Is Not In Cart ----- \n");
        }
    }
}