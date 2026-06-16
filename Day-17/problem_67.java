// Write a program to Intersection of Arrays.

import java.util.Scanner;
public class problem_67 {
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
            System.out.println("Intersection:");
            for (int i = 0; i < n1; i++) {
                boolean x = false;
                for (int k = 0; k < i; k++) {
                    if (arr1[i] == arr1[k]) {
                        x = true;
                        break;
                    }
                }
                if (x)
                    continue;
                for (int j = 0; j < n2; j++) {
                    if (arr1[i] == arr2[j]) {
                        System.out.print(arr1[i] + " ");
                        break;
                    }
                }
            }
        }
    }
}