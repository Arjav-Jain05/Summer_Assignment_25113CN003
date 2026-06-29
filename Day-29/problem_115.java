// Write a program to Create menu-driven string operations system.

import java.util.Scanner;

public class problem_115 {
    static String str = "";

    // Input String
    public static void inputString(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter a String: ");
        str = sc.nextLine();
        System.out.println("String Stored Successfully!");
    }

    // Display String
    public static void displayString() {
        if (str.isEmpty()) {
            System.out.println("No String Available.");
            return;
        }
        System.out.println("String : " + str);
    }

    // Length
    public static void length() {
        if (str.isEmpty()) {
            System.out.println("No String Available.");
            return;
        }
        System.out.println("Length = " + str.length());
    }

    // Uppercase
    public static void upperCase() {
        if (str.isEmpty()) {
            System.out.println("No String Available.");
            return;
        }
        System.out.println("Uppercase : " + str.toUpperCase());
    }

    // Lowercase
    public static void lowerCase() {
        if (str.isEmpty()) {
            System.out.println("No String Available.");
            return;
        }
        System.out.println("Lowercase : " + str.toLowerCase());
    }

    // Reverse String
    public static void reverse() {
        if (str.isEmpty()) {
            System.out.println("No String Available.");
            return;
        }
        System.out.print("Reversed String : ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    // Palindrome Check
    public static void palindrome() {
        if (str.isEmpty()) {
            System.out.println("No String Available.");
            return;
        }
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equalsIgnoreCase(rev))
            System.out.println("Palindrome String");
        else
            System.out.println("Not a Palindrome String");

    }

    // Count Vowels
    public static void countVowels() {
        if (str.isEmpty()) {
            System.out.println("No String Available.");
            return;
        }
        int count = 0;
        String s = str.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number of Vowels = " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n===== STRING OPERATIONS =====");
            System.out.println("1. Input String");
            System.out.println("2. Display String");
            System.out.println("3. Length");
            System.out.println("4. Convert to Uppercase");
            System.out.println("5. Convert to Lowercase");
            System.out.println("6. Reverse String");
            System.out.println("7. Check Palindrome");
            System.out.println("8. Count Vowels");
            System.out.println("9. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    inputString(sc);
                    break;
                case 2:
                    displayString();
                    break;
                case 3:
                    length();
                    break;
                case 4:
                    upperCase();
                    break;
                case 5:
                    lowerCase();
                    break;
                case 6:
                    reverse();
                    break;
                case 7:
                    palindrome();
                    break;
                case 8:
                    countVowels();
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