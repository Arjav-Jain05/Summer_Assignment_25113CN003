// Write a program to Check Symmetric Matrix.

import java.util.Scanner;

public class problem_78 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter size of square matrix: ");
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            System.out.println("Enter matrix:");
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    arr[i][j] = sc.nextInt();
            boolean symmetric = true;
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j < n; j++) {
                    if (arr[i][j] != arr[j][i]) {
                        symmetric = false;
                        break;
                    }
                }
            if (symmetric)
                System.out.println("Symmetric Matrix");
            else
                System.out.println("Not Symmetric Matrix");
        }
    }
}