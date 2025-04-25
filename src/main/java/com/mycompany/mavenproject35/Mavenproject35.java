
package com.mycompany.mavenproject35;

public class Mavenproject35 {

    public static void main(String[] args) {
        Employee firstEmployee = new SalariedEmployee("Usman", "Ali", "111-11-1111", 800.00);
        Employee secondEmployee = new CommissionEmployee("Atif", "Aslam", "222-22-2222", 10000, 0.06);
        Employee thirdEmployee = new BasePlusCommissionEmployee("Rana", "Naseeb", "333-33-3333", 5000, 0.04, 300);
        Employee fourthEmployee = new HourlyEmployee("Renson", "Isaac", "444-44-4444", 16.75, 40);

        System.out.println(firstEmployee);
        System.out.println("Earnings: " + firstEmployee.earnings());

        System.out.println(secondEmployee);
        System.out.println("Earnings: " + secondEmployee.earnings());

        System.out.println(thirdEmployee);

        BasePlusCommissionEmployee currentEmployee = (BasePlusCommissionEmployee) thirdEmployee;

        double oldBaseSalary = currentEmployee.getBaseSalary();
        System.out.println("Old base salary: " + oldBaseSalary);

        currentEmployee.setBaseSalary(1.10 * oldBaseSalary);
        System.out.println("New base salary with 10% increase is: " + currentEmployee.getBaseSalary());

        System.out.println("Earnings: " + thirdEmployee.earnings());

        System.out.println(fourthEmployee);
        System.out.println("Earnings: " + fourthEmployee.earnings());
    }
}
