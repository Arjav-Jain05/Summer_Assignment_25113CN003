// Write a program to Find Missing Number in Array.

import java.util.Scanner;

public class problem_61 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter value of n: ");
            int n = sc.nextInt();
            int[] arr = new int[n - 1];
            System.out.println("Enter elements:");
            for (int i = 0; i < n - 1; i++)
                arr[i] = sc.nextInt();

            int ex = n * (n + 1) / 2;
            int actual = 0;
            for (int num : arr)
                actual += num;
            System.out.println("Missing Number = " + (ex - actual));
        }
    }
}