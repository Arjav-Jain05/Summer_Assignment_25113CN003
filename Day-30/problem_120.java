// Write a program to Develop complete mini project using arrays, strings and functions.

// Hotel management System.

import java.util.Scanner;

public class problem_120 {
    static int[] roomNo;
    static String[] customerName;
    static String[] phone;
    static boolean[] booked;
    static int size;

    // Book Room
    public static void bookRoom(Scanner sc) {
        System.out.print("Enter Room Number: ");
        int room = sc.nextInt();
        if (room < 1 || room > size) {
            System.out.println("Invalid Room Number.");
            return;
        }
        if (booked[room - 1]) {
            System.out.println("Room Already Booked.");
            return;
        }
        sc.nextLine();
        System.out.print("Enter Customer Name: ");
        customerName[room - 1] = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        phone[room - 1] = sc.nextLine();
        roomNo[room - 1] = room;
        booked[room - 1] = true;
        System.out.println("Room Booked Successfully!");
    }

    // Search Booking
    public static void searchBooking(Scanner sc) {
        System.out.print("Enter Room Number: ");
        int room = sc.nextInt();
        if (room < 1 || room > size || !booked[room - 1]) {
            System.out.println("Booking Not Found.");
            return;
        }
        System.out.println("\nRoom Number : " + roomNo[room - 1]);
        System.out.println("Customer    : " + customerName[room - 1]);
        System.out.println("Phone       : " + phone[room - 1]);
    }

    // Update Booking
    public static void updateBooking(Scanner sc) {
        System.out.print("Enter Room Number: ");
        int room = sc.nextInt();
        if (room < 1 || room > size || !booked[room - 1]) {
            System.out.println("Booking Not Found.");
            return;
        }
        sc.nextLine();
        System.out.print("Enter New Name: ");
        customerName[room - 1] = sc.nextLine();
        System.out.print("Enter New Phone: ");
        phone[room - 1] = sc.nextLine();
        System.out.println("Booking Updated!");
    }

    // Check Out
    public static void checkOut(Scanner sc) {
        System.out.print("Enter Room Number: ");
        int room = sc.nextInt();
        if (room < 1 || room > size || !booked[room - 1]) {
            System.out.println("Room Already Empty.");
            return;
        }
        booked[room - 1] = false;
        customerName[room - 1] = "";
        phone[room - 1] = "";
        System.out.println("Checked Out Successfully!");
    }

    // Display All Rooms
    public static void displayRooms() {
        System.out.println("\nRoom\tCustomer\tPhone\t\tStatus");
        for (int i = 0; i < size; i++) {
            if (booked[i]) {
                System.out.println(roomNo[i] + "\t" +
                        customerName[i] + "\t\t" +
                        phone[i] + "\tBooked");
            } else {
                System.out.println((i + 1) + "\t-\t\t-\t\tAvailable");
            }
        }
    }

    // Available Rooms
    public static void availableRooms() {
        int available = 0;
        for (int i = 0; i < size; i++) {
            if (!booked[i]) {
                available++;
            }
        }
        System.out.println("Available Rooms = " + available);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Rooms: ");
        size = sc.nextInt();
        roomNo = new int[size];
        customerName = new String[size];
        phone = new String[size];
        booked = new boolean[size];
        while (true) {
            System.out.println("\n===== HOTEL MANAGEMENT SYSTEM =====");
            System.out.println("1. Book Room");
            System.out.println("2. Search Booking");
            System.out.println("3. Update Booking");
            System.out.println("4. Check Out");
            System.out.println("5. Display All Rooms");
            System.out.println("6. Available Rooms");
            System.out.println("7. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bookRoom(sc);
                    break;
                case 2:
                    searchBooking(sc);
                    break;
                case 3:
                    updateBooking(sc);
                    break;
                case 4:
                    checkOut(sc);
                    break;
                case 5:
                    displayRooms();
                    break;
                case 6:
                    availableRooms();
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