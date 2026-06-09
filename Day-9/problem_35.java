// Write a program to Print repeated character pattern. 
// A 
// B B 
// C C C 
// D D D D 
// E E E E E

import java.util.Scanner;

public class problem_35 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter rows: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                char ch = (char) ('A' + i - 1);
                for (int j = 1; j <= i; j++)
                    System.out.print(ch);
                System.out.println();
            }
        }
    }
}