// Write a program to Reverse a String.

import java.util.Scanner;

public class problem_82 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            for (int i = str.length() - 1; i >= 0; i--)
                System.out.print(str.charAt(i));
        }
    }
}