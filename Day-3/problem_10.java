// Write a program to Print prime numbers in a range.

import java.util.Scanner;

public class problem_10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (int n = start; n <= end; n++) {
                if (n <= 1)
                    continue;
                int c = 0;
                for (int i = 1; i * i <= n; i++) {
                    if (n % i == 0) {
                        if (i == n / i)
                            c += 1;
                        else
                            c += 2;
                    }
                }
                if (c == 2)
                    System.out.print(n + " ");
            }
        }
    }
}