// Write a program to Check String Rotation.

import java.util.Scanner;

public class problem_93 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first string: ");
            String str1 = sc.nextLine();
            System.out.print("Enter second string: ");
            String str2 = sc.nextLine();
            if (str1.length() != str2.length()) {
                System.out.println("Not Rotation");
                return;
            }
            String temp = str1 + str1;
            if (temp.contains(str2))
                System.out.println("Rotation");
            else
                System.out.println("Not Rotation");
        }
    }
}