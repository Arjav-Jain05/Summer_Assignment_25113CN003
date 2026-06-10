// Q43 Write a program to Write function to check prime.

import java.util.Scanner;

public class problem_43 {
    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (isPrime(n))
                System.out.println("Prime Number");
            else
                System.out.println("Not a Prime Number");
        }
    }
}