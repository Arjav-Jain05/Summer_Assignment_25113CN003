// Write a program to Create Voting Eligibility System.

import java.util.Scanner;

public class problem_102 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("\n================================");
                System.out.println("     VOTING ELIGIBILITY SYSTEM");
                System.out.println("================================");
                System.out.println("1. Check Eligibility");
                System.out.println("2. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Are you an Indian Citizen? (Y/N): ");
                        char citizen = sc.next().charAt(0);
                        System.out.print("Do you have a valid Voter ID? (Y/N): ");
                        char voterId = sc.next().charAt(0);
                        System.out.print("Are you disqualified by law? (Y/N): ");
                        char criminal = sc.next().charAt(0);
                        System.out.println("\n----------- RESULT -----------");
                        System.out.println("Name : " + name);
                        if (age < 18) {
                            System.out.println("Status : NOT ELIGIBLE");
                            System.out.println("Reason : Age is below 18.");
                        }
                        else if (citizen == 'N' || citizen == 'n') {
                            System.out.println("Status : NOT ELIGIBLE");
                            System.out.println("Reason : Not an Indian citizen.");
                        }
                        else if (voterId == 'N' || voterId == 'n') {
                            System.out.println("Status : NOT ELIGIBLE");
                            System.out.println("Reason : No valid Voter ID.");
                        }
                        else if (criminal == 'Y' || criminal == 'y') {
                            System.out.println("Status : NOT ELIGIBLE");
                            System.out.println("Reason : Disqualified by law.");
                        }
                        else {
                            System.out.println("Status : ELIGIBLE TO VOTE");
                            System.out.println("Congratulations! You can vote.");
                        }
                        break;
                    case 2:
                        System.out.println("Thank You!");
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                }
            } while (choice != 2);

        }
    }
}