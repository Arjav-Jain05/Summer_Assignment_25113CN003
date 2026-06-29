// Write a program to Create menu-driven calculator.

import java.util.Scanner;

public class problem_113 {
    // Addition
    public static void add(Scanner sc) {
        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();
        System.out.println("Answer = " + (num1 + num2));
    }

    // Subtraction
    public static void subtract(Scanner sc) {
        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();
        System.out.println("Answer = " + (num1 - num2));
    }

    // Multiplication
    public static void multiply(Scanner sc) {
        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();
        System.out.println("Answer = " + (num1 * num2));
    }

    // Division
    public static void divide(Scanner sc) {
        System.out.print("Enter First Number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = sc.nextDouble();
        if (num2 == 0) {
            System.out.println("Cannot Divide By Zero!");
            return;
        }
        System.out.println("Answer = " + (num1 / num2));
    }

    // Modulus
    public static void modulus(Scanner sc) {
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        if (num2 == 0) {
            System.out.println("Cannot Divide By Zero!");
            return;
        }
        System.out.println("Answer = " + (num1 % num2));
    }

    // Power
    public static void power(Scanner sc) {
        System.out.print("Enter Base: ");
        double base = sc.nextDouble();
        System.out.print("Enter Exponent: ");
        double exponent = sc.nextDouble();
        System.out.println("Answer = " + Math.pow(base, exponent));
    }

    // Square Root
    public static void squareRoot(Scanner sc) {
        System.out.print("Enter Number: ");
        double num = sc.nextDouble();
        if (num < 0) {
            System.out.println("Square Root of Negative Number is Not Possible.");
            return;
        }
        System.out.println("Answer = " + Math.sqrt(num));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== MENU DRIVEN CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square Root");
            System.out.println("8. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    add(sc);
                    break;
                case 2:
                    subtract(sc);
                    break;
                case 3:
                    multiply(sc);
                    break;
                case 4:
                    divide(sc);
                    break;
                case 5:
                    modulus(sc);
                    break;
                case 6:
                    power(sc);
                    break;
                case 7:
                    squareRoot(sc);
                    break;
                case 8:
                    System.out.println("Thank You!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}