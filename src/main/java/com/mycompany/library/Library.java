package com.mycompany.library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        LibrarianSystem librarianSystem = new LibrarianSystem();

        // ADDING REQUIRED USERS HERE.
        LibrarianHandler.studentData.addFirst(new Student(120220155, "Abeer Ahmed", 400166654, "IT", "Multimedia", 2022));
        LibrarianHandler.studentData.addFirst(new Student(120220115, "Mohamed Ismail", 400166596, "IT", "Multimedia", 2022));
        LibrarianHandler.studentData.addFirst(new Student(120220120, "Mohamed Shaban", 405134185, "IT", "Multimedia", 2022));
        LibrarianHandler.studentData.addFirst(new Student(120220654, "Ahmed Salem", 400153383, "IT", "Multimedia", 2022));
        LibrarianHandler.studentData.addFirst(new Student(120220553, "Mahmoud Samy", 400156654, "IT", "Multimedia", 2022));
        LibrarianHandler.studentData.addFirst(new Student(120220656, "Assel Naser", 400163256, "IT", "Multimedia", 2022));
        LibrarianHandler.studentData.addFirst(new Student(120220659, "Lama Samer", 400148625, "IT", "Multimedia", 2022));
        LibrarianHandler.studentData.addFirst(new Student(120220964, "Saleem Khalil", 400133452, "IT", "Multimedia", 2022));

        // ADDING REQUIRED BOOKS HERE.
        LibrarianHandler.bookData.addFirst(new Book(97813279, "Eloquent JavaScript, Third Edition", "A Modern Introduction to Programming", "Marijn Haverbeke", "2018-12-04T00:00:00.000Z", "No Starch Press", 472, "JavaScript lies at the heart of almost every modern web application, from social apps like Twitter to browser-based game frameworks like Phaser and Babylon. Though simple for beginners to pick up and play with, JavaScript is a flexible, complex language that you can use to build full-scale applications.", "http://eloquentjavascript.net/", false));
        LibrarianHandler.bookData.addFirst(new Book(97811943, "Practical Modern JavaScript", "Dive into ES6 and the Future of JavaScript", "Nicolás Bevacqua", "2017-07-16T00:00:00.000Z", "O'Reilly Media", 334, "To get the most out of modern JavaScript, you need learn the latest features of its parent specification, ECMAScript 6 (ES6). This book provides a highly practical look at ES6, without getting lost in the specification or its implementation details.", "https://github.com/mjavascript/practical-modern-javascript", false));
        LibrarianHandler.bookData.addFirst(new Book(97813277, "Understanding ECMAScript 6", "The Definitive Guide for JavaScript Developers", "Nicholas C. Zakas", "2016-09-03T00:00:00.000Z", "No Starch Press", 352, "ECMAScript 6 represents the biggest update to the core of JavaScript in the history of the language. In Understanding ECMAScript 6, expert developer Nicholas C. Zakas provides a complete guide to the object types, syntax, and other exciting changes that ECMAScript 6 brings to JavaScript.", "https://leanpub.com/understandinges6/read", false));
        LibrarianHandler.bookData.addFirst(new Book(97819365, "Speaking JavaScript", "An In-Depth Guide for Programmers", "Axel Rauschmayer", "2014-04-08T00:00:00.000Z", "O'Reilly Media", 460, "Like it or not, JavaScript is everywhere these days -from browser to server to mobile- and now you, too, need to learn the language or dive deeper than you have. This concise book guides you into and through JavaScript, written by a veteran programmer who once found himself in the same position.", "http://speakingjs.com/", false));
        LibrarianHandler.bookData.addFirst(new Book(97819331, "Learning JavaScript Design Patterns", "A JavaScript and jQuery Developer's Guide", "Addy Osmani", "2012-08-30T00:00:00.000Z", "O'Reilly Media", 254, "With Learning JavaScript Design Patterns, you'll learn how to write beautiful, structured, and maintainable JavaScript by applying classical and modern design patterns to the language. If you want to keep your code efficient, more manageable, and up-to-date with the latest best practices, this book is for you.", "http://www.addyosmani.com/resources/essentialjsdesignpatterns/book/", false));
        LibrarianHandler.bookData.addFirst(new Book(97982477, "You Don't Know JS Yet", "Get Started", "Kyle Simpson", "2020-01-28T00:00:00.000Z", "Independently published", 143, "The worldwide best selling You Don't Know JS book series is back for a 2nd edition: You Don't Know JS Yet. All 6 books are brand new, rewritten to cover all sides of JS for 2020 and beyond.", "https://github.com/getify/You-Dont-Know-JS/tree/2nd-ed/get-started", false));

        librarianSystem.run();
    }

    public static int getIntInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                System.out.print("Your input: ");
                scanner.nextLine(); // to clear the invalid input from the scanner
            }
        }
    }

    public static long getLongInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextLong();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer or long value.");
                System.out.print("Your input: ");
                scanner.nextLine(); // to clear the invalid input from the scanner
            }
        }
    }
}
