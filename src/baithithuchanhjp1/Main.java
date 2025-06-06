package baithithuchanhjp1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product ID:");
        product.setId(sc.nextInt());
        sc.nextLine();  // đọc bỏ dòng mới

        System.out.println("Enter product name:");
        product.setName(sc.nextLine());

        System.out.println("Enter thumbnail path:");
        product.setThumbnail(sc.nextLine());

        System.out.println("Enter product price:");
        product.setPrice(sc.nextDouble());

        System.out.println("Enter quantity in stock:");
        product.setQty(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter product description:");
        product.setDescription(sc.nextLine());

        System.out.println("\n--- Product Details ---");
        product.displayInfo();

        System.out.println("\nEnter quantity to order:");
        int orderQty = sc.nextInt();

        if (product.checkAvailability(orderQty)) {
            double totalPrice = product.placeOrder(orderQty);
            System.out.printf("Order placed successfully. Total price: $%.2f\n", totalPrice);
            System.out.println("Remaining quantity in stock: " + product.getQty());
        } else {
            System.out.println("Not enough quantity available to place the order.");
        }

        sc.close();
    }
}
