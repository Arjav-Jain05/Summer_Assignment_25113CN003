// Write a program to Find LCM of two numbers.

import java.util.Scanner;

public class problem_12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = a;
            int y = b;
            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }
            int gcd = x;
            int lcm = (a * b) / gcd;
            System.out.println("LCM = " + lcm);
        }
    }
}
