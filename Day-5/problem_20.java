// Write a program to Find largest prime factor

import java.util.Scanner;
public class problem_20 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int largest = -1;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                while (n % i == 0) {
                    largest = i;
                    n /= i;
                }
            }
            if (n > 1)
                largest = n;
            System.out.println("Largest Prime Factor = " + largest);
        }
    }
}