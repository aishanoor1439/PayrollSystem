
package com.mycompany.mavenproject35;

public class Employee {
    private String firstName;
    private String lastName;
    private String CNIC;

    public Employee() {
        firstName = "";
        lastName = "";
        CNIC = "";
    }

    public Employee(String firstName, String lastName, String CNIC) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.CNIC = CNIC;
    }

    public String getFirstName() 
    { return firstName; }
    public void setFirstName(String firstName) 
    { this.firstName = firstName; }

    public String getLastName() 
    { return lastName; }
    public void setLastName(String lastName) 
    { this.lastName = lastName; }

    public String getCNIC() 
    { return CNIC; }
    public void setCNIC(String CNIC) 
    { this.CNIC = CNIC; }

    public double earnings() {
        return 0.00;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " CNIC# " + CNIC;
    }
}
