// Write a program to Count even and odd elements.

import java.util.Scanner;

public class problem_52 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            int even = 0;
            int odd = 0;
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0)
                    even++;
                else
                    odd++;
            }
            System.out.println("Even Elements = " + even);
            System.out.println("Odd Elements = " + odd);
        }
    }
}