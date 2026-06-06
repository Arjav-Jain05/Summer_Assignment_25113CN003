// Write a program to Convert binary to decimal.

import java.util.Scanner;

public class problem_22 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Binary Number: ");
            int bi = sc.nextInt();
            int dec = 0;
            int c = 1;
            while (bi > 0) {
                int digit = bi % 10;
                dec += digit * c;
                c *= 2;
                bi /= 10;
            }
            System.out.println("Decimal: " + dec);
        }
    }
}
