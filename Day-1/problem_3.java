
// Write a program to Find factorial of a number.

import java.util.Scanner;

public class problem_3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int fact = 1;
            System.out.print("Enter a natural number: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++)
                fact *= i;
            System.out.println("Factorial of " + n + " is: " + fact);
        }
    }
}
