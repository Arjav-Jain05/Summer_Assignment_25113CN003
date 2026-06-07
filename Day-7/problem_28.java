// Write a program to Recursive reverse number. 

import java.util.Scanner;

public class problem_28 {
    static int rev = 0;

    static int reverse(int n) {
        if (n == 0)
            return rev;
        rev = rev * 10 + n % 10;
        return reverse(n / 10);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("Reversed number: "+reverse(n));
        }
    }
}