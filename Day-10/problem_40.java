// Q40 Write a program to Print character pyramid.
//       A
//      ABA
//     ABCBA
//    ABCDCBA
//   ABCDEDCBA

import java.util.Scanner;

public class problem_40 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter rows: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++)
                    System.out.print(" ");
                for (char ch = 'A'; ch < 'A' + i; ch++)
                    System.out.print(ch);
                for (char ch = (char) ('A' + i - 2); ch >= 'A'; ch--)
                    System.out.print(ch);
                System.out.println();
            }
        }
    }
}
