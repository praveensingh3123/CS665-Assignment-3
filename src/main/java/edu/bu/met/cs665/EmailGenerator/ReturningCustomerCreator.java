package edu.bu.met.cs665.EmailGenerator;

/**
 * Name: Praveen Singh
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/02/2024
 * File Name: ReturningCustomerCreator.java
 * Description: This class implements the CustomerCreator interface. Here a new Returning Customer is created and a function to send
 * emails to the customer is defined.
 */


public class ReturningCustomerCreator implements CustomerCreator{

    /**
     * This method is used to create new customers
     */
    @Override
    public Customer createCustomer() {
        return new ReturningCustomer();
    }

    /**
     * This method is used to send emails to customers
     */
    @Override
    public String sendCustomerEmails() {
        Customer returningCustomer = createCustomer();
        return returningCustomer.sendEmail();
    }
}
