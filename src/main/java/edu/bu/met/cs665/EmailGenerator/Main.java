package edu.bu.met.cs665.EmailGenerator;

/**
 * Name: Praveen Singh
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/02/2024
 * File Name: Main.java
 * Description: This is the entry point of the Email Generation System. It offers a system to create different types
 * of users and send emails to them with a custom template.
 */

public class Main {
    /**
     * Main method which is the starting point of execution. Here customer instances are created and we send the emails to
     * various customers based on the custom template.
     */
    public static void main(String[] args) {
        CustomerCreator[] creators = {
                new BusinessCustomerCreator(),
                new ReturningCustomerCreator(),
                new FrequentCustomerCreator(),
                new NewCustomerCreator(),
                new VIPCustomerCreator()
        };

        for (CustomerCreator creator : creators) {
            System.out.println(creator.sendCustomerEmails());
            System.out.println("-------------------------------------------");
        }
    }
}
