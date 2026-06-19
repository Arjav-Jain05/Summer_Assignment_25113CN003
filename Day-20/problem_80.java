// Write a program to Find Column-wise Sum.

import java.util.Scanner;

public class problem_80 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter rows and columns: ");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] arr = new int[r][c];
            System.out.println("Enter matrix:");
            for (int i = 0; i < r; i++)
                for (int j = 0; j < c; j++)
                    arr[i][j] = sc.nextInt();
            for (int j = 0; j < c; j++) {
                int sum = 0;
                for (int i = 0; i < r; i++)
                    sum += arr[i][j];
                System.out.println("Column " + (j + 1) + " Sum = " + sum);
            }
        }
    }
}