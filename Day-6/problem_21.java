// Write a program to Convert decimal to binary.

import java.util.Scanner;

public class problem_21 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Decimal Number: ");
            int n = sc.nextInt();
            int bi = 0;
            int c = 1;
            while (n > 0) {
                bi += (n % 2) * c;
                c *= 10;
                n /= 2;
            }
            System.out.println("Binary: " + bi);
        }
    }
}