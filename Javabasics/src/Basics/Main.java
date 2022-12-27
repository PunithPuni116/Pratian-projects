package Basics;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		//Step 1 - Declaration
        String name = "";
        double marks1, marks2, marks3 = 0;
        double total = 0;
        double average = 0.0;
        String result = "";
        
        //Scanner to be able to get the data from the console
        Scanner console = new Scanner(System.in);
        
        //Step 2 - Accept values from  the user
        System.out.println("Please enter Name : ");
        name = console.nextLine();
        
        System.out.println("Please enter Marks 1 : ");
        marks1 = console.nextDouble();
        
        System.out.println("Please enter Marks 2 : ");
        marks2 = console.nextDouble();
        
        System.out.println("Please enter Marks 3 : ");
        marks3 = console.nextDouble();
        
        //Step 3- Calculate Total
        total = marks1 + marks2 + marks3;
        
        //Step 4 - Calculate Average
        average = total/3;
        
        //Step 5 - Calculate Result
        if(marks1 > 35 & marks2 > 35 && marks3 > 35){
            if(average >= 60){
                result = "First Class";
            }
            else if(average >= 50){
                result = "Second Class";
            }
            else if(average >= 35){
                result = "Pass Class";
            }
            else
                result = "Fail";
        }
        else
            result = "Fail";
        
        
        //Step 6 - Display the Outout needed
        System.out.println("Name : " + name);
        System.out.println("Marks 1 : " + marks1);
        System.out.println("Marks 2 : " + marks2);
        System.out.println("Marks 3 : " + marks3);
        
        System.out.println("Total : " + total);
        System.out.println("Average : " + average);
        
        System.out.println("Result : " + result);
        
        //Step 7 - Test Cases
        //1. What if its a Zero
        //2. What if its a negative number
        //3. What if they are decimal numbers
        //4. What if we provide huge number > 100 and < 0
        //5. What if we provide characters
        //6. What if it is null and not given
        
        //Step 8 - CheckIn and Close
	}
}
