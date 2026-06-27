// Write a program to Create Student Record Management System.

import java.util.Scanner;

public class problem_105 {
    static Scanner sc = new Scanner(System.in);
    // Storing student details
    static int roll[] = new int[100];
    static String name[] = new String[100];
    static int marks[] = new int[100];

    // Count Total students
    static int count = 0;

    // Function to add a student
    static void addStudent() {
        System.out.print("Enter Roll Number: ");
        roll[count] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();
        count++;
        System.out.println("Student Added Successfully!");
    }

    // Function to display all students
    static void displayStudents() {
        if (count == 0) {
            System.out.println("No Student Records Found.");
            return;
        }
        System.out.println("\nStudent Details:");
        for (int i = 0; i < count; i++) {
            System.out.println("-------------------------");
            System.out.println("Roll Number : " + roll[i]);
            System.out.println("Name        : " + name[i]);
            System.out.println("Marks       : " + marks[i]);
        }
    }

    // Function to search students
    static void searchStudent() {
        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                System.out.println("\nStudent Found");
                System.out.println("Roll Number : " + roll[i]);
                System.out.println("Name        : " + name[i]);
                System.out.println("Marks       : " + marks[i]);
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Student Not Found.");
    }

    // Function to update student's marks
    static void updateMarks() {
        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                System.out.print("Enter New Marks: ");
                marks[i] = sc.nextInt();
                System.out.println("Marks Updated Successfully.");
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Student Not Found.");
    }

    // Function to delete a student
    static void deleteStudent() {
        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                // Shift all students one position left
                for (int j = i; j < count - 1; j++) {
                    roll[j] = roll[j + 1];
                    name[j] = name[j + 1];
                    marks[j] = marks[j + 1];
                }
                count--;
                System.out.println("Student Deleted Successfully.");
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Student Not Found.");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n========== STUDENT RECORD MANAGEMENT ==========");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateMarks();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        } while (choice != 6);
    }
}
