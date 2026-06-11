// Write a program to Write function for perfect number.

import java.util.Scanner;

public class problem_48 {
    static boolean perf(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (perf(n))
                System.out.println("It is a perfect Number");
            else
                System.out.println("It is not a Perfect Number");
        }
    }
}
