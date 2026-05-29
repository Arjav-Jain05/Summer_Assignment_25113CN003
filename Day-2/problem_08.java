// Write a program to Check whether a number is palindrome.

import java.util.Scanner;

public class problem_08 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int revn = 0, digit, temp = n;
            while (temp > 0) {
                digit = temp % 10;
                revn = revn * 10 + digit;
                temp /= 10;
            }
            if (revn == n)
                System.out.println(n + " is a Palindrome");
            else
                System.out.println(n + " is not a Palindrome");
        }
    }
}
