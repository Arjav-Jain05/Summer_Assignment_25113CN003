// Write a program to Create student record system using arrays and strings.

import java.util.Scanner;

public class problem_117 {
    static int[] rollNo;
    static String[] name;
    static String[] course;
    static String[] city;
    static int count = 0;

    // Add Student
    public static void addStudent(Scanner sc) {
        if (count == rollNo.length) {
            System.out.println("Storage Full! Cannot Add More Students.");
            return;
        }
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (rollNo[i] == roll) {
                System.out.println("Roll Number Already Exists!");
                return;
            }
        }
        rollNo[count] = roll;
        sc.nextLine();
        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();
        System.out.print("Enter Course: ");
        course[count] = sc.nextLine();
        System.out.print("Enter City: ");
        city[count] = sc.nextLine();
        count++;
        System.out.println("Student Added Successfully!");
    }

    // Search Student
    public static void searchStudent(Scanner sc) {
        if (count == 0) {
            System.out.println("No Student Records Available.");
            return;
        }
        System.out.print("Enter Roll Number to Search: ");
        int roll = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (rollNo[i] == roll) {
                System.out.println("\nStudent Found");
                System.out.println("Roll No : " + rollNo[i]);
                System.out.println("Name    : " + name[i]);
                System.out.println("Course  : " + course[i]);
                System.out.println("City    : " + city[i]);
                return;
            }
        }
        System.out.println("Student Not Found.");
    }

    // Update Student
    public static void updateStudent(Scanner sc) {
        if (count == 0) {
            System.out.println("No Student Records Available.");
            return;
        }
        System.out.print("Enter Roll Number to Update: ");
        int roll = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (rollNo[i] == roll) {
                System.out.print("Enter New Name: ");
                name[i] = sc.nextLine();
                System.out.print("Enter New Course: ");
                course[i] = sc.nextLine();
                System.out.print("Enter New City: ");
                city[i] = sc.nextLine();
                System.out.println("Student Record Updated Successfully!");
                return;
            }
        }
        System.out.println("Student Not Found.");
    }

    // Delete Student
    public static void deleteStudent(Scanner sc) {
        if (count == 0) {
            System.out.println("No Student Records Available.");
            return;
        }
        System.out.print("Enter Roll Number to Delete: ");
        int roll = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (rollNo[i] == roll) {
                for (int j = i; j < count - 1; j++) {
                    rollNo[j] = rollNo[j + 1];
                    name[j] = name[j + 1];
                    course[j] = course[j + 1];
                    city[j] = city[j + 1];
                }
                count--;
                System.out.println("Student Record Deleted Successfully!");
                return;
            }
        }
        System.out.println("Student Not Found.");
    }

    // Display All Students
    public static void displayStudents() {
        if (count == 0) {
            System.out.println("No Student Records Available.");
            return;
        }
        System.out.println("\n------------------------------------------------------");
        System.out.println("Roll No\tName\t\tCourse\t\tCity");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println(rollNo[i] + "\t" + name[i] + "\t\t" + course[i] + "\t\t" + city[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maximum Number of Students: ");
        int size = sc.nextInt();
        rollNo = new int[size];
        name = new String[size];
        course = new String[size];
        city = new String[size];
        while (true) {
            System.out.println("\n===== STUDENT RECORD SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    searchStudent(sc);
                    break;
                case 3:
                    updateStudent(sc);
                    break;
                case 4:
                    deleteStudent(sc);
                    break;
                case 5:
                    displayStudents();
                    break;
                case 6:
                    System.out.println("Thank You!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}