// Write a program to Convert Lowercase to Uppercase.

import java.util.Scanner;

public class problem_84 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= 'a' && ch <= 'z')
                    ch = (char) (ch - 32);
                System.out.print(ch);
            }
        }
    }
}