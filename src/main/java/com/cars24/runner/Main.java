package com.cars24.runner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Initialize the Scanner
        boolean exit = true;  // Variable to control the loop

        while (exit) {
            // Display menu
            System.out.println("Enter your choice:");
            System.out.println("1: Add Customer");
            System.out.println("2: Get Customer");
            System.out.println("3: Update Customer");
            System.out.println("4: Delete");
            System.out.println("5:exit");

            // Read user input
            int choice = sc.nextInt();

            // Switch statement for menu options
            switch (choice) {
                case 1:
                    // Call addCustomer() method from UI class
                    UI.addCustomer();
                    break;
                case 2:
                    // Call getCustomer() method from UI class
                    UI.getCustomer();
                    break;
                case 3:

                    UI.updateCustomer();
                    break;
                case 4:

                    UI.deleteCustomer();
                    break;
                case 5:
                    // Exit the loop
                    System.out.println("Exiting...");
                    exit = false;
                    break;
                default:
                    // Handle invalid input
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
                    break;
            }
        }

        sc.close();  // Close the Scanner
    }
}
