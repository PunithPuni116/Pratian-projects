package Series;
import java.util.Scanner;
class test1 {
    public static void main(String[] args) {
        
        int numbers=0;
        // an array to store the sequence
        int[] array=new int[101];
        //to generate a give n series
        while(numbers<=100){
            array[numbers]=numbers*numbers+1;
          System.out.print(array[numbers]+" ");
          numbers++;
            
        }
        System.out.println();
        System.out.println("\nCount of numbers ending with 7 :"+ CountSeven(array)+"\n"); 
        displayPrime(array);
        
        System.out.println("Neither Ascending nor Descending numbers :"+norAscendDescend(array));
        
    }
    //to count of elements in the array ending with 7
    public static int CountSeven(int[] arr){
        int count=0;
        for(int i=0;i<=100;i++){
            if((arr[i]%10)==7)
                count++;
        }
        return count;
    }
    
    //to display the prime numbers present in the above series
    
    public static void displayPrime(int[] arr){
        System.out.println("prime numbers are displayed below ");
        int count=0;
        for(int i=0;i<=100;i++){
            if(isPrime(arr[i])){
                System.out.print(arr[i]+" ");
                count++;
                  }
             }
        System.out.println("\nnumber of prime numbers in array:  "+ count);
        
      }
        
        public static boolean isPrime(int num){
            if(num<=1)
                return false;
            else if(num==2)
                return true;
            else if((num%2)==0)
                return false;
            
            for(int i=3;i<=Math.sqrt(num);i+=2){
                if(num%i==0)
                    return false;
            }
            return true;
                
        }
        
        //count of numbers which are ascending nor descending
        
        public static int norAscendDescend(int[] arr){
            
            int count=0;
            
            for(int i=0;i<=100;i++){
                
                if(checkAscendDes(arr[i]))
                    count++;
            }
            return count;
        }
        
        
        public static boolean checkAscendDes(int num){
            
            if(num>100){
                int d=num/10;
                d=d%10;
                if((d>(num/100) && d<num%10) || (d<num/100 && d>num%10))
                    return true;
                    
                
            }
            return false;
            
                
        }
        
//395 
   
        
}