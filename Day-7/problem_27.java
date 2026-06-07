// Write a program to Recursive sum of digits.

import java.util.Scanner;

public class problem_27 {
    static int sum(int n) {
        if (n == 0)
            return 0;
        return n % 10 + sum(n / 10);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.println(sum(n));
        }
    }
}