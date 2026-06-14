// Write a program to Rotate Array Right.

import java.util.Scanner;

public class problem_59 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int last = arr[n - 1];
            for (int i = n - 1; i > 0; i--)
                arr[i] = arr[i - 1];
            arr[0] = last;
            System.out.println("Array after right rotation:");
            for (int num : arr)
                System.out.print(num + " ");
        }
    }
}