package edu.bu.met.cs665.EmailGenerator;

/**
 * Name: Praveen Singh
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/02/2024
 * File Name: FrequentCustomer.java
 * Description: This class implements the Customer interface. Here the template for the email which needs to be sent to
 * the frequent customers is defined.
 */


public class FrequentCustomer implements Customer{
    /**
     * This method creates a template to send email to customers.
     */
    @Override
    public String sendEmail() {
        return "Dear Frequent Customer: \nGood to see you again. \nThank you";
    }
}
