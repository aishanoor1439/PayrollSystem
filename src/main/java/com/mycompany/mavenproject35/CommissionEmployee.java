
package com.mycompany.mavenproject35;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee() {
        super();
        grossSales = 0.0;
        commissionRate = 0.0;
    }

    public CommissionEmployee(String firstName, String lastName, String CNIC, double grossSales, double commissionRate) {
        super(firstName, lastName, CNIC);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public void setGrossSales(double grossSales) {
        if (grossSales >= 0.0)
            this.grossSales = grossSales;
    }
    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate >= 0.0)
            this.commissionRate = commissionRate;
    }
    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return "\nCommission employee: " + super.toString();
    }

}
