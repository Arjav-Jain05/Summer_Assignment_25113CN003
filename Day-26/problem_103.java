// Write a program to Create ATM Simulation.

import java.util.Scanner;

public class problem_103 {
    static double balance = 10000;
    static int pin = 1234;

    static boolean login(Scanner sc) {
        System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();
        if (enteredPin == pin)
            return true;
        System.out.println("Incorrect PIN!");
        return false;
    }

    static void checkBalance() {
        System.out.println("Current Balance: Rs" + balance);
    }

    static void deposit(Scanner sc) {
        System.out.print("Enter amount to deposit: Rs");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Deposit Successful.");
    }

    static void withdraw(Scanner sc) {
        System.out.print("Enter amount to withdraw: Rs");
        double amount = sc.nextDouble();
        if (amount > balance)
            System.out.println("Insufficient Balance");
        else {
            balance -= amount;
            System.out.println("Please collect your cash.");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!login(sc))
                return;
            int choice;
            do {
                System.out.println("\n====== ATM MENU ======");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        deposit(sc);
                        break;
                    case 3:
                        withdraw(sc);
                        break;
                    case 4:
                        System.out.println("Thank You!");
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
            } while (choice != 4);
        }
    }
}