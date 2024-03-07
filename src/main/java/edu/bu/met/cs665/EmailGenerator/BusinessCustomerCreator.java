package edu.bu.met.cs665.EmailGenerator;
/**
 * Name: Praveen Singh
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/02/2024
 * File Name: BusinessCustomerCreator.java
 * Description: This class implements the CustomerCreator interface. Here a new Business Customer is created and a function to send
 * emails to the customers is defined.
 */

public class BusinessCustomerCreator implements CustomerCreator{

    /**
     * This method is used to create new customers
     */
    @Override
    public Customer createCustomer() {
        return new BusinessCustomer();
    }

    /**
     * This method is used to send emails to customers
     */
    @Override
    public String sendCustomerEmails() {
        Customer businessCustomer = createCustomer();
        return businessCustomer.sendEmail();
    }
}
