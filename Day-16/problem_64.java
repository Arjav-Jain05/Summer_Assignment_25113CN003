// Write a program to Remove Duplicates From Array.

import java.util.Scanner;

public class problem_64 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.println("Array after removing duplicates:");
            for (int i = 0; i < n; i++) {
                boolean dup = false;
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) {
                        dup = true;
                        break;
                    }
                }
                if (!dup)
                    System.out.print(arr[i] + " ");
            }
        }
    }
}