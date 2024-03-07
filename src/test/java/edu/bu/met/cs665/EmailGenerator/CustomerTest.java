package edu.bu.met.cs665.EmailGenerator;

import junit.framework.TestCase;

public class CustomerTest extends TestCase {

    public void testBusinessCustomer() {
        // Create a BusinessCustomer using the BusinessCustomerCreator.
        CustomerCreator creator = new BusinessCustomerCreator();
        Customer customer = creator.createCustomer();

        // Assert the type of customer created and verify the generated email content.
        assertTrue(customer instanceof BusinessCustomer);
        assertEquals("Dear Business Customer: \nIt's a pleasure doing business with you. \nThank you", customer.sendEmail());
    }
    public void testFrequentCustomer() {
        // Create a BusinessCustomer using the BusinessCustomerCreator.
        CustomerCreator creator = new FrequentCustomerCreator();
        Customer customer = creator.createCustomer();

        // Assert the type of customer created and verify the generated email content.
        assertTrue(customer instanceof FrequentCustomer);
        assertEquals("Dear Frequent Customer: \nGood to see you again. \nThank you", customer.sendEmail());
    }
    public void testNewCustomer() {
        // Create a BusinessCustomer using the BusinessCustomerCreator.
        CustomerCreator creator = new NewCustomerCreator();
        Customer customer = creator.createCustomer();

        // Assert the type of customer created and verify the generated email content.
        assertTrue(customer instanceof NewCustomer);
        assertEquals("Dear New Customer: \nIt's a pleasure to have you on board with us. \nThank you", customer.sendEmail());
    }
    public void testReturningCustomer() {
        // Create a BusinessCustomer using the BusinessCustomerCreator.
        CustomerCreator creator = new ReturningCustomerCreator();
        Customer customer = creator.createCustomer();

        // Assert the type of customer created and verify the generated email content.
        assertTrue(customer instanceof ReturningCustomer);
        assertEquals("Dear Returning Customer: \nGood to see you again. \nThank you", customer.sendEmail());
    }
    public void testVIPCustomer() {
        // Create a BusinessCustomer using the BusinessCustomerCreator.
        CustomerCreator creator = new VIPCustomerCreator();
        Customer customer = creator.createCustomer();

        // Assert the type of customer created and verify the generated email content.
        assertTrue(customer instanceof VIPCustomer);
        assertEquals("Dear VIP Customer: \nYou have access to all our perks. \nThank you", customer.sendEmail());
    }

}