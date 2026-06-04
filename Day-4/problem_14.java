// Write a program to Find nth Fibonacci term. 

import java.util.Scanner;

public class problem_14 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = 0, b = 1, c;
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.print("The " + n + "th term is: ");
            for (int i = 1; i < n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.print(a);
        }
    }
}
