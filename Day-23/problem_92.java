// Write a program to Find Maximum Occurring Character.

import java.util.Scanner;

public class problem_92 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine();
            char mc = ' ';
            int mcount = 0;
            for (int i = 0; i < str.length(); i++) {
                int count = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j))
                        count++;
                }
                if (count > mcount) {
                    mcount = count;
                    mc = str.charAt(i);
                }
            }
            System.out.println("Maximum Occurring Character = " + mc);
            System.out.println("Frequency = " + mcount);
        }
    }
}