// Write a program to Find sum and average of array.

import java.util.Scanner;

public class problem_50 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            double average = sum / n;
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + average);
        }
    }
}
