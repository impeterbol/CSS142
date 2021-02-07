//Peter Boldyrev / CSSSKL 142 // Feb 6

import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args){
        overall();
       //end of main
    }


    public static void overall(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Lab5! \n Enter 1 to check how long it takes to get rich on a magic dollar coin. \n"+
        " Enter 2 to calculate e^x for any real x \n"+
        " Enter 3 to enter palindrome words.\n"+
        " Enter 4 to re-print the menu. \n"+
        " Enter 0 to exit. \n"+
        "What is your choice? >");
        
        int mainMenuChoice = keyboard.nextInt();

        if (mainMenuChoice ==1){
            getRichQuick();
            
        }
        else if(mainMenuChoice ==2){
            System.out.println("Please enter an x >");
            double userTaylorX = keyboard.nextDouble();
            eTaylor(userTaylorX);
        }
        else if(mainMenuChoice ==3){
           palindromeCheck();
        }
        else if(mainMenuChoice ==4){
            overall();
         }
         else if(mainMenuChoice==0){
             System.out.println("Thank you for participating! Goodbye");
         }
         else{
            System.out.println("Seems like you accidentally entered some other number, let's try again!");
            overall();
         }


    }

    public static void getRichQuick(){
        double amount = 1;
        int day = 1;
        System.out.println("Day 1: $"+amount);
        while (amount<=1000000){
            
            // System.out.println("Day "+day+": $"+amount+" + ($1 + "+(amount/2)+") = $"+(amount+(1+(amount/2))));
            System.out.print("Day "+day+": ");
            System.out.printf("$ %.2f +($1+ %.2f) = $ %.2f %n",amount, (amount/2), (amount+(1+(amount/2))));
            day++;
            amount = amount+(1+(amount/2));
            
        }

        //end of getRichQuick
    }


    //eTaylor method
    public static void eTaylor(double x){
       double sum = 0;
        int n=0;

        while (eTaylorHelper(x, n)>10e-16){
            sum= sum+eTaylorHelper(x, n);
            n++;
        }
        System.out.println("e^"+x+" = "+sum);

        //end of eTaylor
    }

    // Part 2 helper method
public static double eTaylorHelper(double x, int n){
    double power = 1;
    double factorial = 1;

    for(int i = 1; i <= n; i++){
        power = power * x;
        factorial = factorial * i;
    }
    
    return power / factorial;
}
    

//part 3 -- palindrome checker

public static void palindromeCheck(){
    Scanner keyboard = new Scanner(System.in);
    System.out. println("Please enter words separated by the whitespace");
    String userInput = keyboard.nextLine();

    Scanner lineScan = new Scanner(userInput);
    // System.out.println(lineScan.next());
    

    int palindromeCounter = 0;
    int wordsCounter = 0;
    String reversed = "";
    

    while (lineScan.hasNext()){
        wordsCounter++;
        reversed="";
        String nextWord = lineScan.next();
        
        for (int i =nextWord.length()-1;i>=0;i--){
            reversed = reversed+nextWord.charAt(i);
        }
        if(reversed.equals(nextWord)){
            System.out.println(nextWord);
            palindromeCounter++;
           
        }
       
    }
    
    System.out.println("There are "+palindromeCounter +" palindromes "+" out of total "+wordsCounter+" words");

    //end of palindrome check method
}

//end of class
}

