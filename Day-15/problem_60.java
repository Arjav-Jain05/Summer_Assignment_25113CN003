// Write a program to Move Zeroes to End.

import java.util.Scanner;

public class problem_60 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0)
                    arr[index++] = arr[i];
            }
            while (index < n)
                arr[index++] = 0;
            System.out.println("Array after moving zeroes:");
            for (int num : arr)
                System.out.print(num + " ");
        }
    }
}