// Write a program to Print repeated-number pattern. 
// 1 
// 2 2 
// 3 3 3 
// 4 4 4 4 
// 5 5 5 5 5

import java.util.Scanner;

public class problem_32 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number or rows: ");
            int rows = sc.nextInt();
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++)
                    System.out.print(i + " ");
                System.out.println();
            }
        }
    }
}
