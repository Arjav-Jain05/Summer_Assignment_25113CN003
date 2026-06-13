// Write a program to Second Largest Element.

import java.util.Scanner;

public class problem_55 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                } else if (arr[i] > secondLargest && arr[i] != largest)
                    secondLargest = arr[i];
            }
            System.out.println("Second Largest Element in the array = " + secondLargest);
        }
    }
}