package Series;
import java.util.Scanner;
class carProblem {
    public static void main(String[] args) {
        //number of days between april 1 to sept 2 is 183
        int days=183;
        int[] array=new int[183];
        

        int sales=1;
        int even=0;
        for(int i=0;i<183;i++){
            sales=sales+even;
            array[i]=sales;
            //System.out.print(array[i]+"" "");
            even+=2;
        }
       eachMonthSales(array);
       System.out.println("Number of vehicles solde to retail: ");
       System.out.println(retailSales(array));
       System.out.println();
       System.out.println("Number of vehicles sold to corporate: ");
       System.out.println(corporateSales(array)+"\n");
        int givenDateSales=0;
        for(int i=13;i<46;i++){
            givenDateSales+=array[i];
        }
        
        System.out.println("Vehicles sold from aug 15 to sept 15 is : "+givenDateSales);
    }
    public static int corporateSales(int[] arr){
        int count=0;
        int sales=0;
        for(int i=0;i<183;i++){
            
            if(count==4){
                sales=sales+arr[i];
                count=0;
            }
            count++;
            
        }
        return sales;
    }
    public static int retailSales(int[] arr){
        int count=0;
        int sales=0;
        for(int i=0;i<183;i++){
            if(count==4){
                count=0;
                continue;
            }
            sales+=arr[i];
            count++;
        }
        return sales;
    }
    
    public static void eachMonthSales(int[] arr){
        System.out.println("Each month sales from april 1 to september 30 is dispalyed below: "+"\n");
        int x=0;
        int y=0;
        int sum=0;
        String[] month={"April","May","June","July","August","September"};
        int k=0;
        for(int i=0;i<183;i++){
            sum=sum+arr[i];
            if(x==30){
               System.out.println(month[k]+":    "+sum);
               sum=0;
               y=0;
               k++;
            }
            else if(y==31){
                System.out.println(month[k]+":    "+sum);
                sum=0;
                x=0;
                k++;
            }
            x++;
            y++;
        }
        System.out.println(month[k]+" "+sum+"\n");
        
    }
}