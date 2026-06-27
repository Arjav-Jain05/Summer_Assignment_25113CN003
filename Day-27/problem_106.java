// Write a program to Create Employee Management System.

import java.util.Scanner;

public class problem_106 {
    static Scanner sc = new Scanner(System.in);
    // Arrays to store employee details
    static int empId[] = new int[100];
    static String empName[] = new String[100];
    static String department[] = new String[100];
    static double salary[] = new double[100];

    // Total employees
    static int count = 0;

    // Function to add employee
    static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        empId[count] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        empName[count] = sc.nextLine();
        System.out.print("Enter Department: ");
        department[count] = sc.nextLine();
        System.out.print("Enter Salary: ");
        salary[count] = sc.nextDouble();
        count++;
        System.out.println("Employee Added Successfully!");
    }

    // Function to display employees
    static void displayEmployees() {
        if (count == 0) {
            System.out.println("No Employee Records Found.");
            return;
        }
        System.out.println("\n========== EMPLOYEE DETAILS ==========");
        for (int i = 0; i < count; i++) {
            System.out.println("----------------------------");
            System.out.println("Employee ID : " + empId[i]);
            System.out.println("Name        : " + empName[i]);
            System.out.println("Department  : " + department[i]);
            System.out.println("Salary      : ₹" + salary[i]);
        }
    }
    // Function to search employee
    static void searchEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (empId[i] == id) {
                System.out.println("\nEmployee Found");
                System.out.println("Employee ID : " + empId[i]);
                System.out.println("Name        : " + empName[i]);
                System.out.println("Department  : " + department[i]);
                System.out.println("Salary      : ₹" + salary[i]);
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Employee Not Found.");
    }
    // Function to update salary
    static void updateSalary() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (empId[i] == id) {
                System.out.print("Enter New Salary: ");
                salary[i] = sc.nextDouble();
                System.out.println("Salary Updated Successfully.");
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Employee Not Found.");
    }

    // Function to delete employee
    static void deleteEmployee() {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (empId[i] == id) {
                // Shift all records one position left
                for (int j = i; j < count - 1; j++) {
                    empId[j] = empId[j + 1];
                    empName[j] = empName[j + 1];
                    department[j] = department[j + 1];
                    salary[j] = salary[j + 1];
                }
                count--;
                System.out.println("Employee Deleted Successfully.");
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Employee Not Found.");
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n========== EMPLOYEE MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    updateSalary();
                    break;
                case 5:
                    deleteEmployee();
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