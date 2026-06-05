// Write a program to Print factors of a number.

import java.util.Scanner;

public class problem_19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("Factors of " + n + " are:");
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    System.out.print(i + " ");
            }
            for (int i = (int) Math.sqrt(n); i >= 1; i--) {
                if (n % i == 0 && i != n / i)
                    System.out.print(n / i + " ");
            }
        }
    }
}