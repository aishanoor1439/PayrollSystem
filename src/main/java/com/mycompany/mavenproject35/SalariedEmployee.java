
package com.mycompany.mavenproject35;

public class SalariedEmployee extends Employee {
private double weeklySalary;

    public SalariedEmployee() {
        super();
        weeklySalary = 0.0;
    }

    public SalariedEmployee(String firstName, String lastName, String CNIC, double weeklySalary) {
        super(firstName, lastName, CNIC);
        setWeeklySalary(weeklySalary);
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary >= 0.0)
            this.weeklySalary = weeklySalary;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
@Override
    public double earnings() {
        return weeklySalary;
    }

@Override
    public String toString() {
        return "\nSalaried employee: " + super.toString();
    }
}
