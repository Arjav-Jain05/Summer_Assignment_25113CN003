// Write a program to Find sum of digits of a number.

import java.util.Scanner;

public class problem_05 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int temp =n;
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            System.out.println("Sum of digits of " + temp + " is: " + sum);
        }
    }
}