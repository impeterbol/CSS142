// Peter Boldyrev /CSS 142 HW Branching 1/24/2021

import java.util.Scanner;
import java.util.concurrent.Flow.Publisher;

public class HW_Branching {
    public static void main(String[] args) {

        salesStoreMethod();

        //end of main
    }

    //method checks against threshold and returns boolean
    public static boolean checkThreshold(double storeSales, double threshold){
        if(storeSales>threshold){
            boolean above = true;
            return above;
        }
        else{
            boolean above = false;
            return above;
        }
        //end of checkThreshold method
    }

    public static void salesStoreMethod(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter sales store1 >");
        double salesStore1 = keyboard.nextDouble();
        System.out.println("Please enter sales store2 >");
        double salesStore2 = keyboard.nextDouble();
        System.out.println("Please enter sales store3 >");
        double salesStore3 = keyboard.nextDouble();

        System.out.println("What is the threshold to check if stores exceeded? >");
        double threshold = keyboard.nextDouble();

        System.out.println("here are the sales for store 1,2,3  and threshold "
        +salesStore1+" " +salesStore2+" "+salesStore3+ " "+threshold);
        System.out.println("the fact that store 1 exceeded threshold is "
        + checkThreshold(salesStore1,threshold));

        System.out.println("the fact that store 2 exceeded threshold is "
        + checkThreshold(salesStore2,threshold));

        System.out.println("the fact that store 3 exceeded threshold is "
        + checkThreshold(salesStore3,threshold));

        
        boolean noneExceeded = 
        !(checkThreshold(salesStore1,threshold)) 
        && !(checkThreshold(salesStore2,threshold)) 
        && !(checkThreshold(salesStore3,threshold));
        boolean allExceeded = 
        checkThreshold(salesStore1,threshold) 
        && checkThreshold(salesStore2,threshold) 
        && checkThreshold(salesStore3,threshold);

        boolean allButStore1 = 
        !(checkThreshold(salesStore1,threshold)) 
        && checkThreshold(salesStore2,threshold)
        &&checkThreshold(salesStore3,threshold);
        boolean allButStore2 = 
        checkThreshold(salesStore1,threshold) 
        && !(checkThreshold(salesStore2,threshold)) 
        && checkThreshold(salesStore3,threshold);
        boolean allButStore3 = 
        checkThreshold(salesStore1,threshold) 
        && checkThreshold(salesStore2,threshold)
        &&!(checkThreshold(salesStore3,threshold));
        
        boolean store1Exceeded = 
        checkThreshold(salesStore1,threshold) 
        && !(checkThreshold(salesStore2,threshold)) 
        && !(checkThreshold(salesStore3,threshold));
        boolean store2Exceeded = 
        !(checkThreshold(salesStore1,threshold)) 
        && checkThreshold(salesStore2,threshold) 
        && !(checkThreshold(salesStore3,threshold));
        boolean store3Exceeded = 
        !(checkThreshold(salesStore1,threshold)) 
        && !(checkThreshold(salesStore2,threshold)) 
        && checkThreshold(salesStore3,threshold);

        if(allExceeded){
            double averageAllExceeded = (salesStore1+salesStore2+salesStore3)/3;
            System.out.println(" All three stores passed over threshold! "+
            "Here is their sales "
            +averageAllExceeded);
        }
        else if(noneExceeded){
            
            System.out.println(" Unfortunately none of the stores "+
            "exceeded threshold...We'll keep pushing!!! ");
        }
        else if(allButStore1){
            double averageAllButStore1= (salesStore2+salesStore3)/2;
            System.out.print("Here is the average of store 2 and 3"+
            " that passed threshold: ");
            System.out.printf("%.2f",averageAllButStore1);
            System.out.println();
        }
        else if(allButStore2){
            double averageAllButStore2= (salesStore1+salesStore3)/2;
            System.out.print("Here is the average of store 1 and 3"+
            " that passed threshold: ");
            System.out.printf("%.2f",averageAllButStore2);
            System.out.println();
        }
        else if(allButStore3){
            double averageAllButStore3= (salesStore1+salesStore2)/2;
            System.out.print("Here is the average of store 1 and 2"+
            " that passed threshold: ");
            System.out.printf("%.2f",averageAllButStore3);
            System.out.println();
        }
        else if(store1Exceeded){
         
            System.out.println("Only store 1 exceeded threshold, "+
            "so there is no real average, but here are store 1 sales: "+
            salesStore1);
        }

        else if(store2Exceeded){
         
            System.out.println("Only store 1 exceeded threshold, "+
            "so there is no real average, but here are store 1 sales: "+
            salesStore2);
        }
        else if(store3Exceeded){
         
            System.out.println("Only store 1 exceeded threshold, "+
            "so there is no real average, but here are store 1 sales: "+
            salesStore3);
        }
       

        //end of salesStoreMethod method
    }

    
   
    
    
}
