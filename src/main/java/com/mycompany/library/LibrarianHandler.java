package com.mycompany.library;

import java.util.Scanner;

public class LibrarianHandler {

    public static DoubleLinkedList<Student> studentData = new DoubleLinkedList<>();
    public static DoubleLinkedList<Book> bookData = new DoubleLinkedList<>();
    public static int[][] rentedBooks = new int[20][2];
    public static int rentedBooksCount = 0;

    public static void manageBooks() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Manage Books ---");
            System.out.println("1. Add Book at First");
            System.out.println("2. Add Book at Last");
            System.out.println("3. View All Books");
            System.out.println("4. Update Book Data");
            System.out.println("5. Delete Book");
            System.out.println("6. Return to Main Menu");

            System.out.print("Enter your choice: ");
            int choice = Library.getIntInput(scanner);

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    addBookLast();
                    break;
                case 3:
                    displayAllBooks();
                    break;
                case 4:
                    updateBookData();
                    break;
                case 5:
                    removeBook();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void addBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Add Book ---");

        System.out.print("Enter ISBN: ");
        long isbn = Library.getLongInput(scanner);
        scanner.nextLine();

        System.out.print("Enter Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Subtitle: ");
        String subtitle = scanner.nextLine();

        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        System.out.print("Enter Published Date: ");
        String published = scanner.nextLine();

        System.out.print("Enter Publisher: ");
        String publisher = scanner.nextLine();

        System.out.print("Enter Number of Pages: ");
        int pages = Library.getIntInput(scanner);
        scanner.nextLine();

        System.out.print("Enter Description: ");
        String description = scanner.nextLine();

        System.out.print("Enter Website: ");
        String website = scanner.nextLine();

        Book newBook = new Book(isbn, title, subtitle, author, published, publisher, pages, description, website, false);
        bookData.addFirst(newBook);

        System.out.println("Book added successfully.");
    }

    public static void addBookLast() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Add Book at Last ---");

        System.out.print("Enter ISBN: ");
        long isbn = Library.getLongInput(scanner);
        scanner.nextLine();

        System.out.print("Enter Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Subtitle: ");
        String subtitle = scanner.nextLine();

        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        System.out.print("Enter Published Date: ");
        String published = scanner.nextLine();

        System.out.print("Enter Publisher: ");
        String publisher = scanner.nextLine();

        System.out.print("Enter Number of Pages: ");
        int pages = Library.getIntInput(scanner);
        scanner.nextLine();

        System.out.print("Enter Description: ");
        String description = scanner.nextLine();

        System.out.print("Enter Website: ");
        String website = scanner.nextLine();

        Book newBook = new Book(isbn, title, subtitle, author, published, publisher, pages, description, website, false);
        bookData.addLast(newBook);

        System.out.println("Book added successfully at last.");
    }

    public static void updateBookData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Update Book Data ---");

        System.out.print("Enter ISBN of the book to update: ");
        long isbn = Library.getLongInput(scanner);

        Node<Book> bookNode = bookData.getHead();

        while (bookNode != null) {
            if (bookNode.getData().getIsbn() == isbn) {
                // Prompt the user for updated data
                System.out.println("PRESS ENTER IF YOU WANT TO SKIP THE ATTRIBUTE.");
                System.out.print("Title: ");
                scanner.nextLine();
                String title = scanner.nextLine();
                if (!title.isEmpty()) {
                    bookNode.getData().setTitle(title);
                }

                System.out.print("Subtitle: ");
                String subtitle = scanner.nextLine();
                if (!subtitle.isEmpty()) {
                    bookNode.getData().setSubtitle(subtitle);
                }

                System.out.print("Author: ");
                String author = scanner.nextLine();
                if (!author.isEmpty()) {
                    bookNode.getData().setAuthor(author);
                }

                System.out.print("Published Date: ");
                String published = scanner.nextLine();
                if (!published.isEmpty()) {
                    bookNode.getData().setPublished(published);
                }

                System.out.print("Publisher: ");
                String publisher = scanner.nextLine();
                if (!publisher.isEmpty()) {
                    bookNode.getData().setPublisher(publisher);
                }

                System.out.print("Number of Pages: ");
                String pagesInput = scanner.nextLine();
                if (!pagesInput.isEmpty()) {
                    int pages = Integer.parseInt(pagesInput);
                    bookNode.getData().setPages(pages);
                }

                System.out.print("Description: ");
                String description = scanner.nextLine();
                if (!description.isEmpty()) {
                    bookNode.getData().setDescription(description);
                }

                System.out.print("Website: ");
                String website = scanner.nextLine();
                if (!website.isEmpty()) {
                    bookNode.getData().setWebsite(website);
                }

                System.out.println("Book data updated successfully.");
                return;
            }
            bookNode = bookNode.getNext();
        }

        System.out.println("Book with the given ISBN not found.");
    }

    public static void removeBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Remove Book ---");

        System.out.print("Enter ISBN of the book to remove: ");
        long isbn = Library.getLongInput(scanner);

        Node<Book> bookNode = bookData.getHead();

        while (bookNode != null) {
            if (bookNode.getData().getIsbn() == isbn) {
                bookData.remove(bookNode);
                System.out.println("Book removed successfully.");
                return;
            }
            bookNode = bookNode.getNext();
        }

        System.out.println("Book with the given ISBN not found.");
    }

    public static void displayAllBooks() {
        System.out.println("\n--- All Books ---");

        Node<Book> bookNode = bookData.getHead();

        while (bookNode != null) {
            System.out.println(bookNode.getData());
            bookNode = bookNode.getNext();
        }
    }

    public static void manageStudents() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Manage Students ---");
            System.out.println("1. Add Student at First");
            System.out.println("2. Add Student at Last");
            System.out.println("3. Remove Student");
            System.out.println("4. Update Student Data");
            System.out.println("5. View All Students");
            System.out.println("6. Go Back");
            System.out.print("Enter your choice: ");
            int choice = Library.getIntInput(scanner);

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    addStudentAtLast();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    updateStudentData();
                    break;
                case 5:
                    displayAllStudents();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void addStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Add Student ---");

        System.out.print("Enter the ID of the student: ");
        int id = Library.getIntInput(scanner);
        scanner.nextLine(); // to reset the input
        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter Nationality ID: ");
        int nationalityId = Library.getIntInput(scanner);
        scanner.nextLine();

        System.out.print("Enter College: ");
        String college = scanner.nextLine();

        System.out.print("Enter Specialist: ");
        String specialist = scanner.nextLine();

        System.out.print("Enter Attendance Year: ");
        int attendanceYear = Library.getIntInput(scanner);
        scanner.nextLine();
        Student newStudent = new Student(id, fullName, nationalityId, college, specialist, attendanceYear);
        studentData.addFirst(newStudent);

        System.out.println("Student added successfully.");
    }

    public static void addStudentAtLast() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Add Student at Last ---");

        System.out.print("Enter the ID of the student: ");
        int id = Library.getIntInput(scanner);
        scanner.nextLine(); // to reset the input
        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter Nationality ID: ");
        int nationalityId = Library.getIntInput(scanner);
        scanner.nextLine();
        System.out.print("Enter College: ");
        String college = scanner.nextLine();
        System.out.print("Enter Specialist: ");
        String specialist = scanner.nextLine();
        System.out.print("Enter Attendance Year: ");
        int attendanceYear = Library.getIntInput(scanner);
        scanner.nextLine();

        Student newStudent = new Student(id, fullName, nationalityId, college, specialist, attendanceYear);
        studentData.addLast(newStudent);

        System.out.println("Student added successfully at the last position.");
    }

    public static void updateStudentData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Update Student Data ---");

        System.out.print("Enter Student ID: ");
        int studentId = Library.getIntInput(scanner);

        Node<Student> studentNode = studentData.getHead();

        while (studentNode != null) {
            Student student = studentNode.getData();
            if (student.getId() == studentId) {
                System.out.println("Press ENTER if you want to skip the attribute.");
                scanner.nextLine(); // to reset the scanner;
                System.out.print("Enter New Full Name: ");
                String fullName = scanner.nextLine();
                if (!fullName.isEmpty()) {
                    student.setFullName(fullName);
                }

                System.out.print("Enter New Nationality ID: ");
                String nationalityIdInput = scanner.nextLine();
                if (!nationalityIdInput.isEmpty()) {
                    int nationalityId = Integer.parseInt(nationalityIdInput);
                    student.setNationalityId(nationalityId);
                }

                System.out.print("Enter New College: ");
                String college = scanner.nextLine();
                if (!college.isEmpty()) {
                    student.setCollege(college);
                }

                System.out.print("Enter New Specialist: ");
                String specialist = scanner.nextLine();
                if (!specialist.isEmpty()) {
                    student.setSpecialist(specialist);
                }

                System.out.print("Enter New Attendance Year: ");
                String attendanceYearInput = scanner.nextLine();
                if (!attendanceYearInput.isEmpty()) {
                    int attendanceYear = Integer.parseInt(attendanceYearInput);
                    student.setAttendanceYear(attendanceYear);
                }

                System.out.println("Student data updated successfully.");
                return;
            }
            studentNode = studentNode.getNext();
        }

        System.out.println("Student with the given ID not found.");
    }

    public static void removeStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Remove Student ---");

        System.out.print("Enter Student ID: ");
        int studentId = Library.getIntInput(scanner);

        Node<Student> studentNode = studentData.getHead();

        while (studentNode != null) {
            Student student = studentNode.getData();
            if (student.getId() == studentId) {
                studentData.remove(studentNode);
                System.out.println("Student removed successfully.");
                return;
            }
            studentNode = studentNode.getNext();
        }

        System.out.println("Student with the given College and Student ID not found.");
    }

    public static void displayAllStudents() {
        System.out.println("\n--- All Students ---");

        Node<Student> studentNode = studentData.getHead();

        while (studentNode != null) {
            System.out.println(studentNode.getData());
            studentNode = studentNode.getNext();
        }
    }

    public static void rentBookToStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Rent Book to Student ---");

        System.out.print("Enter ISBN of the book to rent: ");
        long isbn = Library.getLongInput(scanner);

        Node<Book> bookNode = bookData.getHead();

        while (bookNode != null) {
            if (bookNode.getData().getIsbn() == isbn) {
                if (bookNode.getData().isRented()) {
                    System.out.println("This book is already rented.");
                } else {
                    System.out.print("Enter the ID of the student: ");
                    int studentId = Library.getIntInput(scanner);

                    Node<Student> studentNode = studentData.getHead();

                    while (studentNode != null) {
                        if (studentNode.getData().getId() == studentId) {
                            bookNode.getData().setRented(true);
                            rentedBooks[rentedBooksCount][0] = (int) bookNode.getData().getIsbn();
                            rentedBooks[rentedBooksCount][1] = studentNode.getData().getId();
                            rentedBooksCount++;
                            System.out.println("Book rented successfully.");
                            return;
                        }
                        studentNode = studentNode.getNext();
                    }

                    System.out.println("Student with the given University ID not found.");
                }
                return;
            }
            bookNode = bookNode.getNext();
        }

        System.out.println("Book with the given ISBN not found.");
    }

    public static void returnBookFromStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Return Book from Student ---");

        System.out.print("Enter ISBN of the book to return: ");
        long isbn = Library.getLongInput(scanner);

        Node<Book> bookNode = bookData.getHead();

        while (bookNode != null) {
            if (bookNode.getData().getIsbn() == isbn) {
                if (bookNode.getData().isRented()) {
                    for (int i = 0; i < rentedBooksCount; i++) {
                        if (rentedBooks[i][0] == isbn) {
                            int studentId = rentedBooks[i][1];

                            Node<Student> studentNode = studentData.getHead();

                            while (studentNode != null) {
                                if (studentNode.getData().getId() == studentId) {
                                    bookNode.getData().setRented(false);
                                    rentedBooks[i][0] = 0;
                                    rentedBooks[i][1] = 0;
                                    rentedBooksCount--;
                                    System.out.println("Book returned successfully.");
                                    return;
                                }
                                studentNode = studentNode.getNext();
                            }

                            System.out.println("Student not found for the rented book.");
                            return;
                        }
                    }
                } else {
                    System.out.println("This book is not currently rented.");
                }
                return;
            }
            bookNode = bookNode.getNext();
        }

        System.out.println("Book with the given ISBN not found.");
    }

    public static void displayRentedBooks() {
        System.out.println("\n--- Rented Books ---");

        if (rentedBooksCount == 0) {
            System.out.println("No books currently rented.");
            return;
        }

        for (int i = 0; i < rentedBooksCount; i++) {
            long isbn = rentedBooks[i][0];
            int studentId = rentedBooks[i][1];

            Node<Book> bookNode = bookData.getHead();
            Node<Student> studentNode = studentData.getHead();

            while (bookNode != null && bookNode.getData().getIsbn() != isbn) {
                bookNode = bookNode.getNext();
            }

            while (studentNode != null && studentNode.getData().getId() != studentId) {
                studentNode = studentNode.getNext();
            }

            if (bookNode != null && studentNode != null) {
                System.out.println("Book ISBN: " + isbn);
                System.out.println("Title: " + bookNode.getData().getTitle());
                System.out.println("Rented by:");
                System.out.println("Student ID: " + studentId);
                System.out.println("Name: " + studentNode.getData().getFullName());
                System.out.println("-----------------------");
            }
        }
    }
}
