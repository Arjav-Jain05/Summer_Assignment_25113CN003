// Write a program to Print character triangle. 
// A
// A B 
// A B C 
// A B C D 
// A B C D E 

import java.util.Scanner;

public class problem_31 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number or rows: ");
            int rows = sc.nextInt();
            for (int i = 1; i <= rows; i++) {
                for (char j = 'A'; j <= i + 64; j++)
                    System.out.print(j + " ");
                System.out.println();
            }
        }
    }
}