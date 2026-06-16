// Write a program to Union of Arrays.

import java.util.Scanner;

public class problem_66 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of first array: ");
            int n1 = sc.nextInt();
            int[] arr1 = new int[n1];
            for (int i = 0; i < n1; i++)
                arr1[i] = sc.nextInt();
            System.out.print("Enter size of second array: ");
            int n2 = sc.nextInt();
            int[] arr2 = new int[n2];
            for (int i = 0; i < n2; i++)
                arr2[i] = sc.nextInt();
            System.out.println("Union:");
            for (int i = 0; i < n1; i++) {
                boolean dup = false;
                for (int j = 0; j < i; j++) {
                    if (arr1[i] == arr1[j]) {
                        dup = true;
                        break;
                    }
                }
                if (!dup)
                    System.out.print(arr1[i] + " ");
            }
            for (int i = 0; i < n2; i++) {
                boolean e = false;
                for (int j = 0; j < n1; j++) {
                    if (arr2[i] == arr1[j]) {
                        e = true;
                        break;
                    }
                }
                if (!e)
                    System.out.print(arr2[i] + " ");
            }
        }
    }
}