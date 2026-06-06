// Write a program to Find x^n without pow(). 

import java.util.Scanner;

public class problem_24 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int x = sc.nextInt();
            System.out.print("Enter the power: ");
            int n = sc.nextInt();
            int ans = 1;
            for (int i = 1; i <= n; i++)
                ans *= x;
            System.out.println(x + "^" + n + " = " + ans);
        }
    }
}
