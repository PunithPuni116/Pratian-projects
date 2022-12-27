package Basics;

import java.util.Scanner;
public class SalaryProblem {    
    public static void main(String[] args) {
        // Declaration
        Scanner scanner = new Scanner(System.in);
        SalaryProblem compute = new SalaryProblem();
        
        // Accepting user input
        System.out.print("Enter your name : ");
        String name = scanner.nextLine();
        System.out.print("Enter your Employee ID : ");
        int empId = scanner.nextInt();
        System.out.print("Enter your basic component : ");
        double basic = scanner.nextDouble();
        System.out.print("Enter your special allowance : ");
        double special = scanner.nextDouble();
        System.out.println("Enter your percentage of bonus");
        double bonusPercentage = scanner.nextDouble();
        System.out.println("Enter your monthly tax saving investments");
        double taxSavingInvestments = scanner.nextDouble();
        scanner.close();
        
        // Validate User input
        boolean isValid = compute.validateUserInput(name, empId, basic, special, bonusPercentage, taxSavingInvestments);
        if (!isValid) {
            return;
        }
        // Computing the gross salary per annum
        double grossSalary = compute.GrossSalary(basic, special, bonusPercentage);
        
        // Computing the taxableSalary on the basis of tax investments
        double taxableSalary = compute.TaxableSalary(grossSalary, taxSavingInvestments);
        
        // Tax slab
        double taxes = compute.Tax(taxableSalary);
        double netSalary = grossSalary - taxes;
        System.out.printf("Annual gross : %f\nAnnual Net : %f\nTaxes Paid: %f", grossSalary, netSalary, taxes);
    }
    // Validates the user input
    public boolean validateUserInput(String name, int empId, double basic, double special, double bonusPercentage, double taxSavingInvestments) {
        if (name.length() <= 2) {
            System.out.println("Please Enter a valid name");
            return false;
        }
        else if (empId <= 0 || basic <= 0 || special <= 0 || bonusPercentage <= 0 || taxSavingInvestments <= 0) {
            System.out.println("Please enter valid numbers");
            return false;
        }
        return true;
    }
    // Computes the gross Annual salary when basic and special allowances are given in monthly
    public double GrossSalary(double basic, double special, double bonusPercentage) {
        double monthlyGross = basic + special;
        double annualGross = monthlyGross*12;
        double grossSalary = annualGross + (annualGross*bonusPercentage)/100;
        return grossSalary;
    }
    public double TaxableSalary(double grossSalary, double taxSavingInvestments) {
        double taxSavingYearly = taxSavingInvestments*12;
        if (taxSavingYearly >= 150000) {
            taxSavingYearly = 150000;
        }
        double taxableSalary = grossSalary - taxSavingYearly;
        return taxableSalary;
    }
    // Computes the taxes as per the taxableSalary
    public double Tax(double taxableSalary) {
        double taxes = 0;
        if (taxableSalary <= 250000) {
        }
        else if (taxableSalary >= 250000 && taxableSalary <= 500000) {
            taxes = 0.05*taxableSalary;
        }
        else if (taxableSalary >= 500000 && taxableSalary <= 1000000) {
            taxes = 0.2*taxableSalary;
        }
        else if (taxableSalary > 2000000) {
            taxes = 0.3*taxableSalary;
        }
        return taxes;
    }
}