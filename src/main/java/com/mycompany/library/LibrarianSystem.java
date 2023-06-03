package com.mycompany.library;

import java.util.Scanner;

public class LibrarianSystem {

    private boolean loggedIn;

    public LibrarianSystem() {
        loggedIn = false;
    }

    public void run() {
        System.out.println("Welcome To Library Management System");
        login();
        if (loggedIn) {
            handleMenuInput();
        } else {
            System.out.println("Login failed. Exiting system.");
        }
    }

    private void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Login");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        AdminUser adminUser = new AdminUser("Admin", "Admin");
        if (adminUser.authenticate(username, password)) {
            System.out.println("Login successful.");
            loggedIn = true;
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private void displayMenu() {
        System.out.println("\nMenu");
        System.out.println("1. Manage Books");
        System.out.println("2. Manage Students");
        System.out.println("3. Rent Book to Student");
        System.out.println("4. Return Book from Student");
        System.out.println("5. Display Rented Books");
        System.out.println("6. Sign Out");
    }

    private void handleMenuInput() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();  // Display the menu each time (on start and whenever user goes back from another menu to this menu).
            System.out.print("\nEnter your choice: ");
            int choice = Library.getIntInput(scanner);

            switch (choice) {
                case 1:
                    LibrarianHandler.manageBooks();
                    break;
                case 2:
                    LibrarianHandler.manageStudents();
                    break;
                case 3:
                    LibrarianHandler.rentBookToStudent();
                    break;
                case 4:
                    LibrarianHandler.returnBookFromStudent();
                    break;
                case 5:
                    LibrarianHandler.displayRentedBooks();
                    break;
                case 6:
                    System.out.println("Signing out. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
