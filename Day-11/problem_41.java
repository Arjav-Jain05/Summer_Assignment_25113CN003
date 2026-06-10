// Q41 Write a program to Write function to find sum of two numbers.

import java.util.Scanner;

public class problem_41 {
    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            System.out.println("Sum = " + sum(a, b));
        }
    }
}