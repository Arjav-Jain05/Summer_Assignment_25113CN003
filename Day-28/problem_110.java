// Write a program to Create bank account system. 

import java.util.Scanner;

public class problem_110 {
    static int[] accountNo;
    static String[] name;
    static double[] balance;
    static int count = 0;

    // Create Account
    public static void createAccount(Scanner sc) {
        if (count == accountNo.length) {
            System.out.println("Bank Storage Full! Cannot Create More Accounts.");
            return;
        }
        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();
        // Check Duplicate Account Number
        for (int i = 0; i < count; i++) {
            if (accountNo[i] == acc) {
                System.out.println("Account Number Already Exists!");
                return;
            }
        }
        accountNo[count] = acc;
        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        name[count] = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance[count] = sc.nextDouble();
        if (balance[count] < 0) {
            System.out.println("Balance Cannot Be Negative.");
            return;
        }
        count++;
        System.out.println("Account Created Successfully!");
    }

    // Deposit Money
    public static void deposit(Scanner sc) {
        if (count == 0) {
            System.out.println("No Accounts Available.");
            return;
        }
        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (accountNo[i] == acc) {
                System.out.print("Enter Amount to Deposit: ");
                double amount = sc.nextDouble();
                if (amount <= 0) {
                    System.out.println("Invalid Amount!");
                    return;
                }
                balance[i] += amount;
                System.out.println("Deposit Successful!");
                System.out.println("Current Balance: " + balance[i]);
                return;
            }
        }
        System.out.println("Account Not Found.");
    }

    // Withdraw Money
    public static void withdraw(Scanner sc) {
        if (count == 0) {
            System.out.println("No Accounts Available.");
            return;
        }
        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (accountNo[i] == acc) {
                System.out.print("Enter Amount to Withdraw: ");
                double amount = sc.nextDouble();
                if (amount <= 0)
                    System.out.println("Invalid Amount!");
                else if (amount > balance[i])
                    System.out.println("Insufficient Balance!");
                else {
                    balance[i] -= amount;
                    System.out.println("Withdrawal Successful!");
                    System.out.println("Current Balance: " + balance[i]);
                }
                return;
            }
        }
        System.out.println("Account Not Found.");
    }

    // Check Balance
    public static void checkBalance(Scanner sc) {
        if (count == 0) {
            System.out.println("No Accounts Available.");
            return;
        }
        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (accountNo[i] == acc) {
                System.out.println("\nAccount Number : " + accountNo[i]);
                System.out.println("Account Holder : " + name[i]);
                System.out.println("Current Balance: " + balance[i]);
                return;
            }
        }
        System.out.println("Account Not Found.");
    }

    // Display All Accounts
    public static void displayAccounts() {
        if (count == 0) {
            System.out.println("No Accounts Available.");
            return;
        }
        System.out.println("\n-----------------------------------------------");
        System.out.println("Acc No\tName\t\tBalance");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println(accountNo[i] + "\t" +
                    name[i] + "\t\t" +
                    balance[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maximum Number of Accounts: ");
        int size = sc.nextInt();
        accountNo = new int[size];
        name = new String[size];
        balance = new double[size];
        while (true) {
            System.out.println("\n===== Bank Account Management System =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    createAccount(sc);
                    break;
                case 2:
                    deposit(sc);
                    break;
                case 3:
                    withdraw(sc);
                    break;
                case 4:
                    checkBalance(sc);
                    break;
                case 5:
                    displayAccounts();
                    break;
                case 6:
                    System.out.println("Thank You!");
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}