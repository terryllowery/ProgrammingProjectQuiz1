/*
 * Written by: Terry Lowery
 * Date: 9/22/18
 * Employee extends Person - This holds the extra ssn field for an 
 * employee
 */


public class Employee extends Person {
    
    private String Ssn; // input var for ssn
    
    // Constructor takes first and last name plus ssn
    public Employee(String first, String last, String ssn) {
        // Call the super class with first and last name 
        super(first, last);
        // Set instance var of Ssn to input from constructor
        this.Ssn = ssn;
    }

    /**
     * @return the Ssn
     */
    public String getSsn() {
        return Ssn;
    }

    /**
     * @param Ssn the Ssn to set
     */
    public void setSsn(String Ssn) {
        this.Ssn = Ssn;
    }
    
    // Override the toString from superclass to include output for
    // newline and SSN
    @Override
    public String toString() {
        return super.toString() + "\n" + "SSN: xxx-xx-" + Ssn; 
    }  
}
