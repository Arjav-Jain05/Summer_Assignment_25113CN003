// Write a program to Find String Length without length().

import java.util.Scanner;

public class problem_81 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            int count = 0;
            for (;;) {
                try {
                    str.charAt(count);
                    count++;
                } catch (StringIndexOutOfBoundsException e) {
                    break;
                }
            }
            System.out.println("Length = " + count);
        }
    }
}