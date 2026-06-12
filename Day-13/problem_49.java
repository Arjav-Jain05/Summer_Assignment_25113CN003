// Write a program to Input and display array.

import java.util.Scanner;

public class problem_49 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.println("Array elements are:");
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        }
    }
}