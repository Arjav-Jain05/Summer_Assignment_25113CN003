// Write a program to Check whether a number is prime.

import java.util.Scanner;

public class problem_09 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int c = 0;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i != n / i)
                        c += 2;
                    else
                        c += 1;
                }
            }
            if (n <= 1)
                System.out.println(n + " is not Prime");
            else if (c == 2)
                System.out.println(n + " is Prime");
            else
                System.out.println(n + " is not Prime");
        }
    }
}
