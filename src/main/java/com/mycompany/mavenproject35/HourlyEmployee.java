
package com.mycompany.mavenproject35;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee() {
        super();
        wage = 0.0;
        hours = 0.0;
    }

    public HourlyEmployee(String firstName, String lastName, String CNIC, double wage, double hours) {
        super(firstName, lastName, CNIC);
        setWage(wage);
        setHours(hours);
    }

    public void setWage(double wage) {
        if (wage >= 0.0)
            this.wage = wage;
    }
    public double getWage() {
        return wage;
    }

    public void setHours(double hours) {
        if (hours >= 0.0)
            this.hours = hours;
    }
    public double getHours() {
        return hours;
    }

    @Override
    public double earnings() {
        if (hours <= 40)
            return wage * hours;
        else
            return 40 * wage + (hours - 40) * wage * 1.5;
    }

    @Override
    public String toString() {
        return "\nHourly employee: " + super.toString();
    }

}
