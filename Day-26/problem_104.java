// Write a program to Create Quiz Application.

import java.util.Scanner;

public class problem_104 {
    static int score = 0;
    static void question1(Scanner sc) {
        System.out.println("\n1. Which language is platform independent?");
        System.out.println("1. C");
        System.out.println("2. Java");
        System.out.println("3. Python");
        System.out.println("4. C++");
        System.out.print("Answer: ");
        if (sc.nextInt() == 2)
            score++;
    }
    static void question2(Scanner sc) {
        System.out.println("\n2. Which keyword is used to create an object?");
        System.out.println("1. class");
        System.out.println("2. new");
        System.out.println("3. object");
        System.out.println("4. create");
        System.out.print("Answer: ");
        if (sc.nextInt() == 2)
            score++;
    }
    static void question3(Scanner sc) {
        System.out.println("\n3. Which loop is guaranteed to execute at least once?");
        System.out.println("1. for");
        System.out.println("2. while");
        System.out.println("3. do-while");
        System.out.println("4. foreach");
        System.out.print("Answer: ");
        if (sc.nextInt() == 3)
            score++;
    }
    static void question4(Scanner sc) {
        System.out.println("\n4. Which company developed Java?");
        System.out.println("1. Microsoft");
        System.out.println("2. Google");
        System.out.println("3. Sun Microsystems");
        System.out.println("4. Apple");
        System.out.print("Answer: ");
        if (sc.nextInt() == 3)
            score++;
    }
    static void question5(Scanner sc) {
        System.out.println("\n5. Which data type stores decimal values?");
        System.out.println("1. int");
        System.out.println("2. char");
        System.out.println("3. double");
        System.out.println("4. boolean");
        System.out.print("Answer: ");
        if (sc.nextInt() == 3)
            score++;
    }
    static void result() {
        double percentage = (score / 5.0) * 100;
        System.out.println("\n========== RESULT ==========");
        System.out.println("Score : " + score + "/5");
        System.out.println("Percentage : " + percentage + "%");
        if (percentage >= 90)
            System.out.println("Grade : A");
        else if (percentage >= 75)
            System.out.println("Grade : B");
        else if (percentage >= 60)
            System.out.println("Grade : C");
        else if (percentage >= 40)
            System.out.println("Grade : D");
        else
            System.out.println("Grade : F");
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("===============================");
            System.out.println("      JAVA QUIZ APPLICATION");
            System.out.println("===============================");
            question1(sc);
            question2(sc);
            question3(sc);
            question4(sc);
            question5(sc);
            result();
        }
    }
}