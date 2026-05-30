// Write a program to Find GCD of two numbers.

import java.util.Scanner;

public class problem_11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            System.out.println("GCD = " + a);
        }
    }
}
