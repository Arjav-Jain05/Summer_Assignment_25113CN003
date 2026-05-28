
// Write a program to Print multiplication table of a given number.

import java.util.Scanner;

public class problem_2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            for (int i = 1; i <= 10; i++)
                System.out.println(n +" x "+i+" = "+ n*i);
        }
    }
}
