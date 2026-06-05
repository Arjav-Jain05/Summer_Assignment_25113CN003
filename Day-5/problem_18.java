// Write a program to Check strong number.

import java.util.Scanner;

public class problem_18 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int temp = n;
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                int fact = 1;
                for (int i = 1; i <= digit; i++)
                    fact *= i;
                sum += fact;
                n /= 10;
            }
            if (sum == temp)
                System.out.println(temp + " is a Strong Number");
            else
                System.out.println(temp + " is not a Strong Number");
        }
    }
}