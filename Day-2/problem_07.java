// Write a program to Find product of digits.

import java.util.Scanner;

public class problem_07 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int temp = n;
            int product = 1;
            while (n > 0) {
                product *= n % 10;
                n /= 10;
            }
            System.out.println("Product of digits of " + temp + " is: " + product);
        }
    }
}
