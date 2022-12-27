package Basics;

import java.util.Scanner;

public class TaxCalculator {

	 

    public static void main(String[] args) {
        // TODO Auto-generated method stub

 

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the name of the Employee: ");
        
        String name=sc.nextLine();
        
        System.out.println("Enter the Employee ID");
        
        String ID=sc.next();
        
        System.out.println("Enter basic salary: ");
        double basic=sc.nextDouble();
        
        System.out.println("Enter bonus percentage: ");
        double bonus =sc.nextDouble();
        
        System.out.println("Enter  splAlw percentage: ");
        double splAlw=sc.nextDouble();
        
        System.out.println("Enter monthly tax saving investments: ");
        double taxSavingmonthly=sc.nextDouble();
        
        double grossMonthly= basic+splAlw;
        double yearlyTaxSavingInvestment =12*taxSavingmonthly;
        System.out.println("The yearly tax saving investment is: "+yearlyTaxSavingInvestment);
        
        double annualSalary=(grossMonthly*12);
        System.out.println("annual salary for the employee: "+annualSalary);
        
        double totalBonus=annualSalary*(bonus/100);
        System.out.println("bonus received by the employee: "+totalBonus);
        
        double grossAnnualSalary=annualSalary+totalBonus;
        System.out.println("annual Salary of the employee: "+grossAnnualSalary);
        
        grossAnnualSalary=grossAnnualSalary-yearlyTaxSavingInvestment;
        
        if(grossAnnualSalary<=250000) {
            System.out.println("the employee annual net salary: "+grossAnnualSalary);
            System.out.println("payable Tax: "+"0.00");
        }
        else if(grossAnnualSalary>250000 && grossAnnualSalary<=500000) {
            double Taxpayable=(grossAnnualSalary)*0.05;
            System.out.println("the employee annual net salary: "+(grossAnnualSalary-Taxpayable));
            System.out.println("payablTax: "+Taxpayable);
        }
    }
}