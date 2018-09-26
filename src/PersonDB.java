/*
 * Written by: Terry Lowery
 * PersonDB while return a new Person object when calling static 
 * method createRecord
 */


import java.util.Scanner;

public class PersonDB {
    

    // Holds a Person object that will be returned to the PersonApp with
    // either employee or customer
    public Person person;
   
    
    // Constructor sets default values
    public PersonDB() {
        // Initiate person to null - we will also use this to check for erros
        this.person = null;
    }
    

    // Returns Person object depending on recordType "c" or "e:
    public static Person createRecord(String recordType) {
        // Create a null Person object. We will later use polymorphism 
        // when sending the object back.
        Person p = null;
        
        // Scanner to get input from user for all the fields required.
        Scanner sc = new Scanner(System.in);
        
        // If we are creating a customer 
        if (recordType.equalsIgnoreCase("c")) {
            String first; // first name input var
            String last;  // last name input var
            String number; // customer number input var
            
            // Get first name from user
            System.out.println("Enter First Name:");
            first = sc.next();
            sc.nextLine(); // Discard unwanted data
            
            // Get last name from user
            System.out.println("Enter Last Name:");
            last = sc.next();
            sc.nextLine(); // Discard unwanted data
            
            // Get customer number
            System.out.println("Enter Customer Number");
            number = sc.next();
            sc.nextLine(); // Discard unwanted data
            
            // This is a customer so we create a new Customer calling the overridden constructor
            Customer customer = new Customer(first, last, number);
            // Polymorphism to cast the customer to it's superclss
            p = customer;            
            
        } else if (recordType.equalsIgnoreCase("e")){ // Createing employee type
            String first; // first name input var
            String last; // last name input var
            String ssn; //ssn input var
            
            // Get input for firstname
            System.out.println("Enter First Name:");
            first = sc.next();
            sc.nextLine(); //Discard unwanted data
            
            // Get input for lastname
            System.out.println("Enter Last Name:");
            last = sc.next();
            sc.nextLine(); //Discard unwanted data
            
            // Get input for ssn
            System.out.println("Enter Last 4 of SSN:");
            ssn = sc.next();
            sc.nextLine(); //Discard unwanted data
            
           // Create employee type using overriden constructor
           Employee employee = new Employee(first, last, ssn);
           // Polymorhism to cast employee to it's superclass
           p = employee;
        }
        // Return the Person Object back
        return p;
    }
    }


/*

 // createRecordType holds either c for customer or e for employee
            // this determines the type of record to create
            
            
            // Print menu options for employee or customer
            System.out.println("Create customer or employee? (c/e)");
            String createRecordType = "";
            // Get users input
            createRecordType = sc.next();
            // Discard other data collected on line
            sc.nextLine();
            
            // Create customer if selection is "c"
    
            if (createRecordType.equalsIgnoreCase("c")) {
                String firstName; // Var for first name 
                String lastName; // Var for last name
                String customerNumber; // Var for customer number
                
                System.out.println("Enter first name:");
                firstName = sc.next(); // Get the first name from input
                sc.nextLine(); // Discard extra data
                 
                System.out.println("Enter last name:");
                lastName = sc.next(); // Get the last name from input
                sc.nextLine(); // Discard extra data
                
                System.out.println("Enter customer number:");
                customerNumber = sc.next(); // Get the customer number from input
                sc.nextLine(); // Discard extra data
                
                Customer customer = new Customer(firstName, lastName, customerNumber);
                Person p = customer;
            } else if (createRecordType.equalsIgnoreCase("e")) {
                String firstName; // Var for first name 
                String lastName; // Var for last name
                String ssn; // Var for last 4 of SSN
                
                System.out.println("Enter first name:");
                firstName = sc.next(); // Get the first name from input
                sc.nextLine(); // Discard extra data
                 
                System.out.println("Enter last name:");
                lastName = sc.next(); // Get the last name from input
                sc.nextLine(); // Discard extra data
                
                System.out.println("Enter last for of SSN:");
                ssn = sc.next(); // Get the customer number from input
                sc.nextLine(); // Discard extra data
                
                Employee employee = new Employee(firstName, lastName, ssn); 
                Person p = employee;
            } else {
                System.out.println("Error: Entry must be 'c' or 'e'. Try again.");
            }

*/