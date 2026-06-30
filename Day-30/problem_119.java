// Write a program to Create mini employee management system

import java.util.Scanner;

public class problem_119 {
    static int[] empId;
    static String[] empName;
    static String[] department;
    static double[] salary;
    static int count = 0;

    // Add Employee
    public static void addEmployee(Scanner sc) {
        if (count == empId.length) {
            System.out.println("Employee Storage Full!");
            return;
        }
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        // Check Duplicate ID
        for (int i = 0; i < count; i++) {
            if (empId[i] == id) {
                System.out.println("Employee ID Already Exists!");
                return;
            }
        }
        empId[count] = id;
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

    // Search Employee
    public static void searchEmployee(Scanner sc) {
        if (count == 0) {
            System.out.println("No Employee Records Found.");
            return;
        }
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (empId[i] == id) {
                System.out.println("\nEmployee Details");
                System.out.println("ID         : " + empId[i]);
                System.out.println("Name       : " + empName[i]);
                System.out.println("Department : " + department[i]);
                System.out.println("Salary     : " + salary[i]);
                return;
            }
        }
        System.out.println("Employee Not Found.");
    }

    // Update Employee
    public static void updateEmployee(Scanner sc) {
        if (count == 0) {
            System.out.println("No Employee Records Found.");
            return;
        }
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (empId[i] == id) {
                System.out.print("Enter New Name: ");
                empName[i] = sc.nextLine();
                System.out.print("Enter New Department: ");
                department[i] = sc.nextLine();
                System.out.print("Enter New Salary: ");
                salary[i] = sc.nextDouble();
                System.out.println("Employee Updated Successfully!");
                return;
            }
        }
        System.out.println("Employee Not Found.");
    }

    // Delete Employee
    public static void deleteEmployee(Scanner sc) {
        if (count == 0) {
            System.out.println("No Employee Records Found.");
            return;
        }
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (empId[i] == id) {
                for (int j = i; j < count - 1; j++) {
                    empId[j] = empId[j + 1];
                    empName[j] = empName[j + 1];
                    department[j] = department[j + 1];
                    salary[j] = salary[j + 1];
                }
                count--;
                System.out.println("Employee Deleted Successfully!");
                return;
            }
        }
        System.out.println("Employee Not Found.");
    }

    // Display Employees
    public static void displayEmployees() {
        if (count == 0) {
            System.out.println("No Employee Records Found.");
            return;
        }
        System.out.println("\n--------------------------------------------------------------");
        System.out.println("ID\tName\t\tDepartment\tSalary");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println(empId[i] + "\t" +
                    empName[i] + "\t\t" +
                    department[i] + "\t\t" +
                    salary[i]);
        }
    }

    // Highest Salary
    public static void highestSalary() {
        if (count == 0) {
            System.out.println("No Employee Records Found.");
            return;
        }
        int index = 0;
        for (int i = 1; i < count; i++) {
            if (salary[i] > salary[index]) {
                index = i;
            }
        }
        System.out.println("\nEmployee With Highest Salary");
        System.out.println("ID         : " + empId[index]);
        System.out.println("Name       : " + empName[index]);
        System.out.println("Department : " + department[index]);
        System.out.println("Salary     : " + salary[index]);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maximum Number of Employees: ");
        int size = sc.nextInt();
        empId = new int[size];
        empName = new String[size];
        department = new String[size];
        salary = new double[size];
        while (true) {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Display All Employees");
            System.out.println("6. Employee With Highest Salary");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addEmployee(sc);
                    break;
                case 2:
                    searchEmployee(sc);
                    break;
                case 3:
                    updateEmployee(sc);
                    break;
                case 4:
                    deleteEmployee(sc);
                    break;
                case 5:
                    displayEmployees();
                    break;
                case 6:
                    highestSalary();
                    break;
                case 7:
                    System.out.println("Thank You!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}