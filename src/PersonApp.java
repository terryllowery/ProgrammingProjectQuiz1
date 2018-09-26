/*
 * Written by: Terry Lowery
 * Date: 9/22/18
 * Contains main class that gathers input. to either create a new customer
 * or employee then output the information you entered.
 */


import java.util.Scanner;

public class PersonApp {
    
    public static void main(String args[]) {
        
        // Print the app welcome and blank line.
        System.out.println("Welcome to the Person Manager");
        System.out.println();
        
        // Enter while loop to capture add or not add new person "n" breaks out
        Scanner sc = new Scanner(System.in);
        // Set to "y" to intiate first iteration of loop
        String menuChoice = "y"; 
        
        
        // Check for "y" do continue loop
        while (menuChoice.equalsIgnoreCase("y")) {
            
            // Setting recordType = null since no record type has been selected
            String recordType = null;
            
            // Enter recordType menu when recordType is null and continue if null
            while (recordType == null) {
                // Output to create a new customer or employee
                System.out.println("Create customer or employee? (c/e):");
                // Get user input for record type
                recordType = sc.next();
                sc.nextLine(); // Discard unwanted data
                
                // If the the record type is "c" or "e" lets create a record 
                if(recordType.equalsIgnoreCase("c") || recordType.equalsIgnoreCase("e")) {
                    // New record is going to be a person class that is either
                    // Customer or Employee as returned from the static method 
                    // in PersonDB
                    Person person = PersonDB.createRecord(recordType);
                    
                    // As long as a Person type gets sent back and it is not
                    // null then we will print it out using the Overridden toString()
                    if (person != null) {
                        // Output type of record created using a call to get
                        // the class name
                        System.out.print("Your have entered a new ");
                        System.out.println(person.getClass().getSimpleName());
                        
                        // overriden toString
                        System.out.println(person.toString());
                    } else { // We will throw and error here allthough a record should get returned
                        System.out.println("Error creating record");
                        }
                } else { // If recordType is not 'c' or 'e' display error
                    System.out.println("Error! Entry must be 'c' or 'e'. Try Again.");
                    //on error do to incorrect input set record type to null
                    //this puts it back in the recordType select loop again
                    recordType = null;  
                }
            } // End of while for recordType
            
            // Get intial input if user wants to continue addiding records
            System.out.println("Continue? (y/n):");
            menuChoice = sc.;
            sc.nextLine();
            
            //Do a while loop and a reverse boolean to check if menuChoice is not equal to
            // "y" or "n". If it is not equal to either then it will continue to ask 
            // for correct input.
            while( !(menuChoice.equalsIgnoreCase("y") || menuChoice.equalsIgnoreCase("n"))) {
                System.out.println("Error! Entry must be 'y' or 'n'. Try again.");
                System.out.println("Continue? (y/n):");
                menuChoice = sc.next();
                sc.nextLine();
            }
        } // End of while for continure adding. Special not that if you get an "n" then break our and end programm
           
    }
}


