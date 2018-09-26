/*
 * Written by: Terry Lowery
 * Date: 9/22/18
 * Customer holds a customer object that extends Person
 */


public class Customer extends Person {
    
    // private var to hold customerNumber
    private String customerNumber;

    // Constructor to create thew Customer object input is firstname, lastname
    // of superclass and customerNumber of this object
    public Customer(String first, String last, String customerNumber) {
        // Call super's constructor with first and last name
        super(first, last);
        // Set instance varable for customer number to variable called in constructor
        this.customerNumber = customerNumber;
    }

    /**
     * @return the customerNumber
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * @param customerNumber the customerNumber to set
     */
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
    
    // Override the Person toString to add a newline then call to get the
    // customer number of this object
    @Override
    public String toString() {
        return super.toString() + "\n" + "Customer Number: " + getCustomerNumber();          
    }
    
}
