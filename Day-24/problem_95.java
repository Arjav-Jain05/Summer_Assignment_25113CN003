// Write a program to Find Longest Word.

import java.util.Scanner;

public class problem_95 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String str = sc.nextLine();
            String word = "";
            String longest = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    word += str.charAt(i);
                } 
                else {
                    if (word.length() > longest.length())
                        longest = word;
                    word = "";
                }
            }
            if (word.length() > longest.length())
                longest = word;
            System.out.println("Longest Word = " + longest);
        }
    }
}