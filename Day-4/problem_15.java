// Write a program to Check Armstrong number.

import java.util.Scanner;

public class problem_15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int temp = n;
            int arm = 0;
            if (n < 0)
                System.out.println("Negative numbers cannot be Armstrong numbers");
            else {
                int c = (n == 0) ? 1 : (int) Math.log10(n) + 1;
                while (temp > 0) {
                    arm = arm + (int) Math.pow(temp % 10, c);
                    temp /= 10;
                }
                if (n == arm)
                    System.out.println(n + " is an ArmStrong number");
                else
                    System.out.println(n + " is not an ArmStrong number");
            }
        }
    }
}