// Write a program to Create mini library system.

import java.util.Scanner;

public class problem_118 {
    static int[] bookId;
    static String[] bookName;
    static String[] author;
    static boolean[] issued;
    static int count = 0;

    // Add Book
    public static void addBook(Scanner sc) {
        if (count == bookId.length) {
            System.out.println("Library is Full!");
            return;
        }
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (bookId[i] == id) {
                System.out.println("Book ID Already Exists!");
                return;
            }
        }
        bookId[count] = id;
        sc.nextLine();
        System.out.print("Enter Book Name: ");
        bookName[count] = sc.nextLine();
        System.out.print("Enter Author Name: ");
        author[count] = sc.nextLine();
        issued[count] = false;
        count++;
        System.out.println("Book Added Successfully!");
    }

    // Issue Book
    public static void issueBook(Scanner sc) {
        if (count == 0) {
            System.out.println("No Books Available.");
            return;
        }
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (bookId[i] == id) {
                if (issued[i]) {
                    System.out.println("Book Already Issued!");
                } else {
                    issued[i] = true;
                    System.out.println("Book Issued Successfully!");
                }
                return;
            }
        }
        System.out.println("Book Not Found.");
    }

    // Return Book
    public static void returnBook(Scanner sc) {
        if (count == 0) {
            System.out.println("No Books Available.");
            return;
        }
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (bookId[i] == id) {
                if (!issued[i]) {
                    System.out.println("Book is Already Available.");
                } else {
                    issued[i] = false;
                    System.out.println("Book Returned Successfully!");
                }
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    // Search Book
    public static void searchBook(Scanner sc) {
        if (count == 0) {
            System.out.println("No Books Available.");
            return;
        }
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (bookId[i] == id) {
                System.out.println("\nBook Details");
                System.out.println("Book ID : " + bookId[i]);
                System.out.println("Book    : " + bookName[i]);
                System.out.println("Author  : " + author[i]);
                System.out.println("Status  : " + (issued[i] ? "Issued" : "Available"));
                return;
            }
        }
        System.out.println("Book Not Found.");
    }

    // Delete Book
    public static void deleteBook(Scanner sc) {
        if (count == 0) {
            System.out.println("No Books Available.");
            return;
        }
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (bookId[i] == id) {
                for (int j = i; j < count - 1; j++) {
                    bookId[j] = bookId[j + 1];
                    bookName[j] = bookName[j + 1];
                    author[j] = author[j + 1];
                    issued[j] = issued[j + 1];
                }
                count--;
                System.out.println("Book Deleted Successfully!");
                return;
            }
        }
        System.out.println("Book Not Found.");
    }

    // Display Books
    public static void displayBooks() {
        if (count == 0) {
            System.out.println("No Books Available.");
            return;
        }
        System.out.println("\n---------------------------------------------------------------");
        System.out.println("ID\tBook Name\tAuthor\t\tStatus");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println(bookId[i] + "\t" +
                    bookName[i] + "\t\t" +
                    author[i] + "\t\t" +
                    (issued[i] ? "Issued" : "Available"));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Maximum Number of Books: ");
        int size = sc.nextInt();
        bookId = new int[size];
        bookName = new String[size];
        author = new String[size];
        issued = new boolean[size];
        while (true) {
            System.out.println("\n===== MINI LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Search Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Display All Books");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addBook(sc);
                    break;
                case 2:
                    issueBook(sc);
                    break;
                case 3:
                    returnBook(sc);
                    break;
                case 4:
                    searchBook(sc);
                    break;
                case 5:
                    deleteBook(sc);
                    break;
                case 6:
                    displayBooks();
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