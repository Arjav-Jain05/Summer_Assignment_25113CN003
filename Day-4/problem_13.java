// Write a program to Generate Fibonacci series. 

import java.util.Scanner;

public class problem_13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = 0, b = 1, c;
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.print("The series till " + n + "th term is: ");
            for (int i = 1; i <= n; i++) {
                System.out.print(a + " ");
                c = a + b;
                a = b;
                b = c;
            }
        }
    }
}
