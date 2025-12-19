package jav;
import java.util.Scanner;
import java.util.LinkedList;

class Menu {
    LinkedList<Integer> prices = new LinkedList<>();
    LinkedList<String> orders = new LinkedList<>();

    public void order(String item, int price) {
        orders.add(item);
        prices.add(price);
        System.out.println(item + " added with price Rs." + price);
    }

    public void showBill() {
        int total = 0;
        System.out.println("\n--- Your Orders ---");
        for (int i = 0; i < orders.size(); i++) {
            System.out.println(orders.get(i) + " - Rs." + prices.get(i));
            total += prices.get(i);
        }
        System.out.println("Total Bill = Rs." + total);
    }
}

public class RestaurantSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu m = new Menu();

        boolean choice = true;
        while (choice) {
            System.out.println("\nChoose an option:");
            System.out.println("order");
            System.out.println("bill");
            System.out.println("exit");

            String b = sc.nextLine();

            switch (b) {
                case "order":
                    System.out.print("Enter item name: ");
                    String item = sc.nextLine();
                    System.out.print("Enter price: ");
                    int price = sc.nextInt();
                    sc.nextLine(); 
                    m.order(item, price);
                    break;

                case "bill":
                    m.showBill();
                    break;

                case "exit":
                    choice = false;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        System.out.println("\nFinal Orders: " + m.orders);
        sc.close();
    }
}