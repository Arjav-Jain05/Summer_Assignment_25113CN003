// Write a program to Check Palindrome String.

import java.util.Scanner;

public class problem_85 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--)
                reverse += str.charAt(i);

            if (str.equals(reverse))
                System.out.println("IT is a palindrome String");
            else
                System.out.println("It is not a palindrome String");
        }
    }
}