
// Write a program to Count digits in a number.

import java.util.Scanner;

public class problem_4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a natural number: ");
            int n = sc.nextInt();
            int temp = n;
            int c = 0;
            while (n > 0) {
                n /= 10;
                c++;
            }
            System.out.println("Number of digits in " + temp + " are: " + c);
        }
    }
}
