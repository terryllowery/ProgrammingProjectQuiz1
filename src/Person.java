/*
 * Written by: Terry Lowery
 * Date: 9/22/18
 * This is the superclass that either customer or employee is created from
 */


public class Person {
    
    private String firstName; // firstname input var
    private String lastName; // lastname input var
    
    // Constructor for Person input is Strings firstname and lastName
    public Person(String first, String last) {
        // Set instance var firstname to what is called from constructor
        this.firstName = first; 
        // Set instance var lastname to what is called from constructor
        this.lastName = last;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    // Override toSting to include firstName and lastName
    @Override
    public String toString() {
        return "Name: " + firstName + "\n" + "Lastname: " + lastName;
        
    }
    
}
