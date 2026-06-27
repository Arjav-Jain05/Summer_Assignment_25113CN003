// Write a program to Create Salary Management System.

import java.util.Scanner;

public class problem_107 {
    static Scanner sc = new Scanner(System.in);

    // Employee Details
    static int empId;
    static String empName;
    static double basicSalary;

    // Salary Details
    static double hra;
    static double da;
    static double pf;
    static double grossSalary;
    static double netSalary;

    // Function to enter employee details
    static void enterDetails() {
        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
        System.out.print("Enter Basic Salary: ₹");
        basicSalary = sc.nextDouble();
        System.out.println("Employee Details Saved Successfully.");
    }

    // Function to calculate salary
    static void calculateSalary() {
        hra = basicSalary * 0.20; // 20%
        da = basicSalary * 0.10; // 10%
        pf = basicSalary * 0.05; // 5%

        grossSalary = basicSalary + hra + da;
        netSalary = grossSalary - pf;
        System.out.println("Salary Calculated Successfully.");
    }

    // Function to display salary slip
    static void displaySalarySlip() {
        System.out.println("\n========== SALARY SLIP ==========");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("---------------------------------");
        System.out.println("Basic Salary  : ₹" + basicSalary);
        System.out.println("HRA (20%)     : ₹" + hra);
        System.out.println("DA (10%)      : ₹" + da);
        System.out.println("PF (5%)       : ₹" + pf);
        System.out.println("---------------------------------");
        System.out.println("Gross Salary  : ₹" + grossSalary);
        System.out.println("Net Salary    : ₹" + netSalary);
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n========== SALARY MANAGEMENT ==========");
            System.out.println("1. Enter Employee Details");
            System.out.println("2. Calculate Salary");
            System.out.println("3. Display Salary Slip");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    enterDetails();
                    break;
                case 2:
                    calculateSalary();
                    break;
                case 3:
                    displaySalarySlip();
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