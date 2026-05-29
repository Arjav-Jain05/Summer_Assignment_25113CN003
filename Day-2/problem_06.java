// Write a program to Reverse a number.

import java.util.Scanner;

public class problem_06 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int revn = 0, digit, temp = n;
            while (temp > 0) {
                digit = temp % 10;
                revn = revn * 10 + digit;
                temp /= 10;
            }
            System.out.println("Original Number: " + n);
            System.out.println("Reversed Number: " + revn);
        }
    }
}
