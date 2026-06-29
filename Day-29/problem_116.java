// Write a program to Create inventory management system.

import java.util.Scanner;

public class problem_116 {
    static int[] productId;
    static String[] productName;
    static int[] quantity;
    static double[] price;
    static int count = 0;

    // Add Product
    public static void addProduct(Scanner sc) {
        if (count == productId.length) {
            System.out.println("Inventory is Full!");
            return;
        }
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        // Check Duplicate ID
        for (int i = 0; i < count; i++) {
            if (productId[i] == id) {
                System.out.println("Product ID Already Exists!");
                return;
            }
        }
        productId[count] = id;
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        productName[count] = sc.nextLine();
        System.out.print("Enter Quantity: ");
        quantity[count] = sc.nextInt();
        System.out.print("Enter Price: ");
        price[count] = sc.nextDouble();
        count++;
        System.out.println("Product Added Successfully!");
    }

    // Search Product
    public static void searchProduct(Scanner sc) {
        if (count == 0) {
            System.out.println("Inventory is Empty.");
            return;
        }
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (productId[i] == id) {
                System.out.println("\nProduct Found");
                System.out.println("ID       : " + productId[i]);
                System.out.println("Name     : " + productName[i]);
                System.out.println("Quantity : " + quantity[i]);
                System.out.println("Price    : " + price[i]);
                return;
            }
        }
        System.out.println("Product Not Found.");
    }

    // Update Quantity
    public static void updateQuantity(Scanner sc) {
        if (count == 0) {
            System.out.println("Inventory is Empty.");
            return;
        }
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (productId[i] == id) {
                System.out.print("Enter New Quantity: ");
                quantity[i] = sc.nextInt();
                System.out.println("Quantity Updated Successfully!");
                return;
            }
        }
        System.out.println("Product Not Found.");
    }

    // Delete Product
    public static void deleteProduct(Scanner sc) {
        if (count == 0) {
            System.out.println("Inventory is Empty.");
            return;
        }
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (productId[i] == id) {
                for (int j = i; j < count - 1; j++) {
                    productId[j] = productId[j + 1];
                    productName[j] = productName[j + 1];
                    quantity[j] = quantity[j + 1];
                    price[j] = price[j + 1];
                }
                count--;
                System.out.println("Product Deleted Successfully!");
                return;
            }
        }
        System.out.println("Product Not Found.");
    }

    // Display Products
    public static void displayProducts() {
        if (count == 0) {
            System.out.println("Inventory is Empty.");
            return;
        }
        System.out.println("\n-------------------------------------------------------");
        System.out.println("ID\tName\t\tQuantity\tPrice");
        System.out.println("-------------------------------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println(productId[i] + "\t" +
                    productName[i] + "\t\t" +
                    quantity[i] + "\t\t" +
                    price[i]);
        }
    }

    // Total Inventory Value
    public static void totalValue() {
        if (count == 0) {
            System.out.println("Inventory is Empty.");
            return;
        }
        double total = 0;
        for (int i = 0; i < count; i++)
            total += quantity[i] * price[i];
        System.out.println("Total Inventory Value = " + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maximum Number of Products: ");
        int size = sc.nextInt();
        productId = new int[size];
        productName = new String[size];
        quantity = new int[size];
        price = new double[size];
        while (true) {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Search Product");
            System.out.println("3. Update Quantity");
            System.out.println("4. Delete Product");
            System.out.println("5. Display All Products");
            System.out.println("6. Total Inventory Value");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addProduct(sc);
                    break;
                case 2:
                    searchProduct(sc);
                    break;
                case 3:
                    updateQuantity(sc);
                    break;
                case 4:
                    deleteProduct(sc);
                    break;
                case 5:
                    displayProducts();
                    break;
                case 6:
                    totalValue();
                    break;
                case 7:
                    System.out.println("Thank You!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}