// Write a program to Create contact management system. 

import java.util.Scanner;

public class problem_112 {
    static String[] name;
    static String[] phone;
    static int count = 0;

    // Add Contact
    public static void addContact(Scanner sc) {
        if (count == name.length) {
            System.out.println("Contact List is Full!");
            return;
        }
        sc.nextLine();
        System.out.print("Enter Contact Name: ");
        String contactName = sc.nextLine();
        // Check Duplicate Contact
        for (int i = 0; i < count; i++) {
            if (name[i].equalsIgnoreCase(contactName)) {
                System.out.println("Contact Already Exists!");
                return;
            }
        }
        name[count] = contactName;
        System.out.print("Enter Phone Number: ");
        phone[count] = sc.nextLine();
        count++;
        System.out.println("Contact Added Successfully!");
    }

    // Search Contact
    public static void searchContact(Scanner sc) {
        if (count == 0) {
            System.out.println("No Contacts Available.");
            return;
        }
        sc.nextLine();
        System.out.print("Enter Contact Name: ");
        String search = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (name[i].equalsIgnoreCase(search)) {
                System.out.println("\nContact Found");
                System.out.println("Name  : " + name[i]);
                System.out.println("Phone : " + phone[i]);
                return;
            }
        }
        System.out.println("Contact Not Found.");
    }

    // Update Contact
    public static void updateContact(Scanner sc) {
        if (count == 0) {
            System.out.println("No Contacts Available.");
            return;
        }
        sc.nextLine();
        System.out.print("Enter Contact Name: ");
        String search = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (name[i].equalsIgnoreCase(search)) {
                System.out.print("Enter New Phone Number: ");
                phone[i] = sc.nextLine();
                System.out.println("Contact Updated Successfully!");
                return;
            }
        }
        System.out.println("Contact Not Found.");
    }

    // Delete Contact
    public static void deleteContact(Scanner sc) {
        if (count == 0) {
            System.out.println("No Contacts Available.");
            return;
        }
        sc.nextLine();
        System.out.print("Enter Contact Name: ");
        String search = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (name[i].equalsIgnoreCase(search)) {
                for (int j = i; j < count - 1; j++) {
                    name[j] = name[j + 1];
                    phone[j] = phone[j + 1];
                }
                count--;
                System.out.println("Contact Deleted Successfully!");
                return;
            }
        }
        System.out.println("Contact Not Found.");
    }

    // Display Contacts
    public static void displayContacts() {
        if (count == 0) {
            System.out.println("No Contacts Available.");
            return;
        }

        System.out.println("\n--------------------------------");
        System.out.println("Name\t\tPhone Number");
        System.out.println("--------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println(name[i] + "\t\t" + phone[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maximum Number of Contacts: ");
        int size = sc.nextInt();
        name = new String[size];
        phone = new String[size];
        while (true) {
            System.out.println("\n===== Contact Management System =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addContact(sc);
                    break;
                case 2:
                    searchContact(sc);
                    break;
                case 3:
                    updateContact(sc);
                    break;
                case 4:
                    deleteContact(sc);
                    break;
                case 5:
                    displayContacts();
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