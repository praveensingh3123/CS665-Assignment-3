package edu.bu.met.cs665.EmailGenerator;

/**
 * Name: Praveen Singh
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/02/2024
 * File Name: VIPCustomerCreator.java
 * Description: This class implements the CustomerCreator interface. Here a new VIP Customer is created and a function to send
 * emails to the customer is defined.
 */

public class VIPCustomerCreator implements CustomerCreator{

    /**
     * This method is used to create new customers
     */
    @Override
    public Customer createCustomer() {
        return new VIPCustomer();
    }

    /**
     * This method is used to send emails to customers
     */
    @Override
    public String sendCustomerEmails() {
        Customer VIPCustomer = createCustomer();
        return VIPCustomer.sendEmail();
    }
}
