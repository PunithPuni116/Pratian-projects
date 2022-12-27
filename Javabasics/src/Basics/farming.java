package Basics;
public class farming{
public static void main(String[] args) {
    
    //Declaration
    double totalArea, dividedArea, annualTomato, annualCabbage,annualPotato,annualSunflower,annualSugarcane,totalRevenue,salesOf11Months;
    
    //Area allotment
    totalArea = 80;
    dividedArea = 80/5;
    
    
    //Revenue calculation
    annualTomato = (0.3*10*1000*dividedArea*7) + (0.7*12*dividedArea*7*1000);
    annualPotato = dividedArea*10*1000*20;
    annualCabbage = dividedArea*1000*14*24;
    annualSunflower = dividedArea*1000*0.7*200;
    annualSugarcane = dividedArea*4000*45;
    
    
    //Total revenue calculation
    totalRevenue = annualTomato + annualPotato +annualCabbage + annualSunflower + annualSugarcane;
    
    salesOf11Months = annualTomato + annualPotato +annualCabbage + (annualSugarcane*2)+(annualSunflower*2);
    
    
    //Printing results
    System.out.println("Revenue of Totmatoes : " +annualTomato);
    System.out.println("Revenue of Potatoes : " +annualPotato);
    System.out.println("Revenue of Cabbage : " +annualCabbage);
    System.out.println("Revenue of Sunflower : " +annualSunflower);
    System.out.println("Revenue of Sugarcane : " +annualSugarcane);
    System.out.println("Total Revenue : " +totalRevenue);
    System.out.println("Revenue of 11 months : " +salesOf11Months);





}}
