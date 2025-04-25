
package com.mycompany.mavenproject35;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee() {
        super();
        baseSalary = 0.0;
    }

    public BasePlusCommissionEmployee(String firstName, String lastName, String CNIC,
                                      double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, CNIC, grossSales, commissionRate);
        setBaseSalary(baseSalary);
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0.0)
            this.baseSalary = baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        return "\nBase plus Commission employee: " + super.toString();
    }

}
