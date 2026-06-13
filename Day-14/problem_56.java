// Write a program to Find Duplicates in Array.

import java.util.Scanner;

public class problem_56 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.println("Duplicate Elements:");
            for (int i = 0; i < n; i++) {
                boolean duplicate = false;
                for (int k = 0; k < i; k++) {
                    if (arr[i] == arr[k]) {
                        duplicate = true;
                        break;
                    }
                }
                if (duplicate)
                    continue;
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j])
                        count++;
                }
                if (count > 1)
                    System.out.print(arr[i] + " ");
            }
        }
    }
}