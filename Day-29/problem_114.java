// Write a program to Create menu-driven array operations system.

import java.util.Scanner;

public class problem_114 {
    static int[] arr;
    static int size;

    // Input Array
    public static void inputArray(Scanner sc) {
        System.out.println("Enter " + size + " Elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Stored Successfully!");
    }

    // Display Array
    public static void displayArray() {
        System.out.print("Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Search Element
    public static void searchElement(Scanner sc) {
        System.out.print("Enter Element to Search: ");
        int key = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element Found at Index " + i);
                return;
            }
        }
        System.out.println("Element Not Found.");
    }

    // Find Maximum
    public static void maximum() {
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum Element = " + max);
    }

    // Find Minimum
    public static void minimum() {
        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Element = " + min);
    }

    // Sum
    public static void sum() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += arr[i];
        }
        System.out.println("Sum = " + total);
    }

    // Average
    public static void average() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += arr[i];
        }
        System.out.println("Average = " + (double) total / size);
    }

    // Reverse Array
    public static void reverse() {
        System.out.print("Reversed Array : ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        size = sc.nextInt();
        arr = new int[size];
        while (true) {
            System.out.println("\n===== ARRAY OPERATIONS =====");
            System.out.println("1. Input Array");
            System.out.println("2. Display Array");
            System.out.println("3. Search Element");
            System.out.println("4. Maximum Element");
            System.out.println("5. Minimum Element");
            System.out.println("6. Sum of Elements");
            System.out.println("7. Average");
            System.out.println("8. Reverse Array");
            System.out.println("9. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    inputArray(sc);
                    break;
                case 2:
                    displayArray();
                    break;
                case 3:
                    searchElement(sc);
                    break;
                case 4:
                    maximum();
                    break;
                case 5:
                    minimum();
                    break;
                case 6:
                    sum();
                    break;
                case 7:
                    average();
                    break;
                case 8:
                    reverse();
                    break;
                case 9:
                    System.out.println("Thank You!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}