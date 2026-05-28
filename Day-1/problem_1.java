
// Write a program to Calculate sum of first N natural numbers.

import java.util.Scanner;

public class problem_1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a natural number: ");
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++)
                sum += i;
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        }
    }
}