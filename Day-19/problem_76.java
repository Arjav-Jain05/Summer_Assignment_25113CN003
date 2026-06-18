// Write a program to Find Diagonal Sum.

import java.util.Scanner;

public class problem_76 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] a = new int[3][3];
            System.out.println("Enter matrix:");
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    a[i][j] = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < 3; i++)
                sum += a[i][i];
            System.out.println("Diagonal Sum = " + sum);
        }
    }
}