// Write a program to Write function for palindrome.

import java.util.Scanner;

public class problem_45 {
    static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return temp == rev;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (isPalindrome(n))
                System.out.println("It is a palindrome Number");
            else
                System.out.println("It is not a palindrome Number");
        }
    }
}