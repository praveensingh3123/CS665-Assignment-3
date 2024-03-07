package edu.bu.met.cs665.EmailGenerator;

/**
 * Name: Praveen Singh
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/02/2024
 * File Name: CustomerCreator.java
 * Description: This is a CustomerCreator interface. Here the functions to create a customer and send customer emails
 * are defined.
 */

public interface CustomerCreator {

    public Customer createCustomer();

    public String sendCustomerEmails();
}
