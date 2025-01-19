package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hedgehog hedgehog = new Hedgehog(); // Default hedgehog

        while (true) {
            System.out.println("\n--- Hedgehog Menu ---");
            System.out.println("1. Create a new hedgehog");
            System.out.println("2. Make the hedgehog speak");
            System.out.println("3. Make the hedgehog run");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 1) { // Create a new hedgehog
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
                hedgehog = new Hedgehog(name, age);
                System.out.println("New hedgehog created: " + hedgehog.name + ", Age: " + hedgehog.age);
            } else if (choice == 2) { // Make the hedgehog speak
                System.out.print("What should the hedgehog say? ");
                String message = scanner.nextLine();
                hedgehog.speak(message);
            } else if (choice == 3) { // Make the hedgehog run
                System.out.print("How many laps? ");
                int laps = scanner.nextInt();
                hedgehog.run(laps);
            } else if (choice == 4) { // Exit
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
