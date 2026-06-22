// Write a program to Remove Spaces from String.

import java.util.Scanner;

public class problem_88 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);
            }
            System.out.println("String without spaces:");
            System.out.println(result);
        }
    }
}