
// Write a program to Create ticket booking system.
import java.util.Scanner;

public class problem_111 {
    static String[] passengerName;
    static int[] seatNo;
    static int count = 0;

    // Book Ticket
    public static void bookTicket(Scanner sc) {
        if (count == seatNo.length) {
            System.out.println("All Seats Are Booked!");
            return;
        }
        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();
        // Check if seat already booked
        for (int i = 0; i < count; i++) {
            if (seatNo[i] == seat) {
                System.out.println("Seat Already Booked!");
                return;
            }
        }
        sc.nextLine();
        System.out.print("Enter Passenger Name: ");
        passengerName[count] = sc.nextLine();
        seatNo[count] = seat;
        count++;
        System.out.println("Ticket Booked Successfully!");
    }

    // Cancel Ticket
    public static void cancelTicket(Scanner sc) {
        if (count == 0) {
            System.out.println("No Tickets Booked.");
            return;
        }
        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (seatNo[i] == seat) {
                for (int j = i; j < count - 1; j++) {
                    seatNo[j] = seatNo[j + 1];
                    passengerName[j] = passengerName[j + 1];
                }
                count--;
                System.out.println("Ticket Cancelled Successfully!");
                return;
            }
        }
        System.out.println("Seat Not Found.");
    }

    // Search Ticket
    public static void searchTicket(Scanner sc) {
        if (count == 0) {
            System.out.println("No Tickets Booked.");
            return;
        }
        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();
        for (int i = 0; i < count; i++) {
            if (seatNo[i] == seat) {
                System.out.println("\nTicket Found");
                System.out.println("Passenger Name : " + passengerName[i]);
                System.out.println("Seat Number    : " + seatNo[i]);
                return;
            }
        }
        System.out.println("Ticket Not Found.");
    }

    // Display All Bookings
    public static void displayTickets() {
        if (count == 0) {
            System.out.println("No Tickets Booked.");
            return;
        }
        System.out.println("\n------------------------------");
        System.out.println("Seat No\tPassenger Name");
        System.out.println("------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println(seatNo[i] + "\t" + passengerName[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Number of Seats: ");
        int size = sc.nextInt();
        passengerName = new String[size];
        seatNo = new int[size];
        while (true) {
            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Search Ticket");
            System.out.println("4. Display All Bookings");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    bookTicket(sc);
                    break;
                case 2:
                    cancelTicket(sc);
                    break;
                case 3:
                    searchTicket(sc);
                    break;
                case 4:
                    displayTickets();
                    break;
                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}