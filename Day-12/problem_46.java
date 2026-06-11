// Write a program to Write function for Armstrong.

import java.util.Scanner;

public class problem_46 {
    static boolean isArmstrong(int n) {
        int temp = n;
        int digits = (int) (Math.log10(n) + 1);
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, digits);
            n /= 10;
        }
        return temp == sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (isArmstrong(n))
                System.out.println("It is an Armstrong Number");
            else
                System.out.println("It is not an Armstrong Number");
        }
    }
}