// Q44 Write a program to Write function to find factorial.

import java.util.Scanner;

public class problem_44 {
    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("Factorial = " + factorial(n));
        }
    }
}