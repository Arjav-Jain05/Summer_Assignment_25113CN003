//  Write a program to Character Frequency.

import java.util.Scanner;

public class problem_87 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            System.out.println("Character Frequencies:");
            for (int i = 0; i < str.length(); i++) {
                boolean x = false;
                for (int k = 0; k < i; k++) {
                    if (str.charAt(i) == str.charAt(k)) {
                        x = true;
                        break;
                    }
                }
                if (x)
                    continue;
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j))
                        count++;
                }
                System.out.println(str.charAt(i) + " = " + count);
            }
        }
    }
}