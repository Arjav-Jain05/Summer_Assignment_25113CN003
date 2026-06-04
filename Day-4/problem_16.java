// Write a program to Print Armstrong numbers in a range. 

import java.util.Scanner;

public class problem_16 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter starting number: ");
            int start = sc.nextInt();
            System.out.print("Enter ending number: ");
            int end = sc.nextInt();
            System.out.print("Armstrong numbers in the range: ");
            for (int n = start; n <= end; n++) {
                int temp = n;
                int arm = 0;
                int digits = (n == 0) ? 1 : (int) Math.log10(n) + 1;
                while (temp > 0) {
                    arm += (int) Math.pow(temp % 10, digits);
                    temp /= 10;
                }
                if (arm == n)
                    System.out.print(n + " ");
            }
        }
    }
}
