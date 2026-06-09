// Write a program to Print reverse star pattern. 
// * * * * * 
// * * * * 
// * * * 
// * * 
// *

import java.util.Scanner;

public class problem_33 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int n = sc.nextInt();
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++)
                    System.out.print("* ");
                System.out.println();
            }
        }
    }
}