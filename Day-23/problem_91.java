// Write a program to Check Anagram Strings.

import java.util.Scanner;

public class problem_91 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first string: ");
            String str1 = sc.nextLine();
            System.out.print("Enter second string: ");
            String str2 = sc.nextLine();
            if (str1.length() != str2.length()) {
                System.out.println("Not Anagram");
                return;
            }
            char[] a = str1.toCharArray();
            char[] b = str2.toCharArray();
            for (int i = 0; i < a.length - 1; i++) {
                for (int j = 0; j < a.length - 1 - i; j++) {
                    if (a[j] > a[j + 1]) {
                        char temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                    if (b[j] > b[j + 1]) {
                        char temp = b[j];
                        b[j] = b[j + 1];
                        b[j + 1] = temp;
                    }
                }
            }
            boolean anagram = true;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    anagram = false;
                    break;
                }
            }
            if (anagram)
                System.out.println("Anagram");
            else
                System.out.println("Not Anagram");
        }
    }
}