// Write a program to Find Maximum Frequency Element.

import java.util.Scanner;

public class problem_62 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int max = 0;
            int el = arr[0];
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j])
                        count++;
                }
                if (count > max) {
                    max = count;
                    el = arr[i];
                }
            }
            System.out.println("Element = " + el);
            System.out.println("Frequency = " + max);
        }
    }
}
