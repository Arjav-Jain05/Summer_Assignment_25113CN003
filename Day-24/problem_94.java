// Write a program to Compress a String.

import java.util.Scanner;

public class problem_94 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                boolean duplicate = false;
                for (int k = 0; k < i; k++) {
                    if (str.charAt(i) == str.charAt(k)) {
                        duplicate = true;
                        break;
                    }
                }
                if (duplicate)
                    continue;
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j))
                        count++;
                }
                System.out.print(str.charAt(i));
                System.out.print(count);
            }
        }
    }
}
