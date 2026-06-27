
// Write a program to Create Marksheet Generation System.

import java.util.Scanner;

public class problem_108 {
    static Scanner sc = new Scanner(System.in);
    // Student Details
    static int rollNo;
    static String name;

    // Subject Marks
    static int english;
    static int maths;
    static int science;
    static int social;
    static int computer;

    // Result Details
    static int total;
    static double percentage;
    static String grade;

    // Function to enter student details
    static void enterDetails() {
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter English Marks: ");
        english = sc.nextInt();
        System.out.print("Enter Maths Marks: ");
        maths = sc.nextInt();
        System.out.print("Enter Science Marks: ");
        science = sc.nextInt();
        System.out.print("Enter Social Marks: ");
        social = sc.nextInt();
        System.out.print("Enter Computer Marks: ");
        computer = sc.nextInt();
        System.out.println("Details Saved Successfully.");
    }

    // Function to calculate result
    static void calculateResult() {
        total = english + maths + science + social + computer;
        percentage = total / 5.0;
        if (percentage >= 90)
            grade = "A";
        else if (percentage >= 80)
            grade = "B";
        else if (percentage >= 70)
            grade = "C";
        else if (percentage >= 60)
            grade = "D";
        else if (percentage >= 40)
            grade = "E";
        else
            grade = "F";
        System.out.println("Result Calculated Successfully.");
    }

    // Function to display marksheet
    static void displayMarksheet() {
        System.out.println("\n========== MARKSHEET ==========");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("--------------------------------");
        System.out.println("English     : " + english);
        System.out.println("Maths       : " + maths);
        System.out.println("Science     : " + science);
        System.out.println("Social      : " + social);
        System.out.println("Computer    : " + computer);
        System.out.println("--------------------------------");
        System.out.println("Total       : " + total + "/500");
        System.out.println("Percentage  : " + percentage + "%");
        System.out.println("Grade       : " + grade);
        if (percentage >= 40)
            System.out.println("Result      : PASS");
        else
            System.out.println("Result      : FAIL");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n========== MARKSHEET SYSTEM ==========");
            System.out.println("1. Enter Student Details");
            System.out.println("2. Calculate Result");
            System.out.println("3. Display Marksheet");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    enterDetails();
                    break;
                case 2:
                    calculateResult();
                    break;
                case 3:
                    displayMarksheet();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        } while (choice != 4);
    }
}