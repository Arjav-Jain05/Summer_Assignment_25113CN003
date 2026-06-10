// Q42 Write a program to Write function to find maximum.

import java.util.Scanner;

public class problem_42 {
    static int maximum(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            System.out.println("Maximum = " + maximum(a, b));
        }
    }
}