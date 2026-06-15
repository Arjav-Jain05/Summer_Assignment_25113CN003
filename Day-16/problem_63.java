// Write a program to Find Pair With Given Sum.

import java.util.Scanner;

public class problem_63 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            System.out.print("Enter target sum: ");
            int sum = sc.nextInt();
            boolean f = false;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {

                    if (arr[i] + arr[j] == sum) {
                        System.out.println(arr[i] + " + " + arr[j] + " = " + sum);
                        f = true;
                    }
                }
            }
            if (!f)
                System.out.println("No pair found");
        }
    }
}