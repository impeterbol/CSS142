// Peter Boldyrev CSSSKL 142 // Lab 4 assignment

import java.util.*;

public class Lab4 {
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        countGrains();

        System.out.println("~~~~~~ANOTHER METHOD OF COUNTING GRAINS"+
        " WITH DOUBLE NUMS AND USING FOR LOOP~~~~~~~~");

        anotherLoopforGrains();
       

        System.out.println("Please enter number which power is it of 2 >");
        int userNum = keyboard.nextInt();
        powerOfTwo(userNum);
        
        numBackward();

        straightLine2();

        boxMaker();
        triangularPattern();
        xPattern();

        ///end of main
    }

    //Part 3
//     Starting with one grain of rice, double the number of grains of rice you receive each day. 
//     If a king paid you for 64 days, how many grains of rice would you have? Write a short, 
//     method with the name countGrains that calculates and prints the number of grains you earn each day and the running sum of all the grains to date.
// Note: Do you observe anything unusual in your output when you run your code? Explain, in comments.
// Answer: After day 31 I received a negative number of grains (a large negative number is printed out) and the total went to -1
//I assume it is due to the fact that I am using int in the countGrains() function.
//I created another way of solving this task on line 46 and used double there - all amounts printed  

    public static void countGrains(){
        int grain = 1;
        int total=1;
        int i = 1;
        do{
            System.out.println("Day "+i+" and you got "+grain+" grains(s) of rice for a total of "+total);
            
            grain=grain*2;
            total=total+grain;
            i++;
           
        }
        while(i<=64);

       
        //end of count grains
    }

    //this is another way to solve the same task Part 3 with for loop and doubles
    public static void anotherLoopforGrains(){
        double total =  1;
            double grain = 1;
            for(int i = 1;i<=64;i++){
                System.out.println("Day "+i+" and you got "+grain+" grains(s) of rice for a total of "+total);
                grain=grain*2;
                total=grain+total;
            }
            //end of anotherLoopforGrains
    }

//Part 4
// Single Loops

// Write a method powerOfTwo that takes an integer argument and prints 
// to the console what power of 2 the given number is. If the number 
// is not a power of 2, then simply print a message that says so.

    public static void powerOfTwo(int userNum){
        int counter = 0;
        if(userNum%2==0){
            
            for(int i=userNum;i>=2;i=i/2){
                counter++;
            }
            System.out.println(userNum+" is 2 to the power of "+counter);
        }
        else{
            System.out.println(userNum+ " is not a power of two");
        }
       
        //end of powerOfTwo
    }

    // Write a method numBackward that reverses the digits of a given integer 
    // (that is, an integer passed in as an argument). Use a single loop and 
    // modular arithmetic to accomplish this goal. If you don't want to use 
    // modular arithmetic, you can also use String methods.
    //  Play around with ideas on paper first. After you reverse the digits, 
    //  compare the number you got with the original argument and determine 
    //  if the original argument is a palindrome.


    //method with a String
    public static void numBackward(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number to reverse >");
        String userInput = keyboard.next();
        String reversed ="";
        for (int i =userInput.length()-1;i>=0;i--){
            reversed = reversed+userInput.charAt(i);
        }
        if(reversed.equals(userInput)){
            System.out.println("backward: "+reversed+", palindrome!");
        }
        else{
            System.out.println("backward: "+reversed+", not a palindrome!");
        }

        //end of numbackward
    }
        //mehtod with %

        public static void numBackward2(){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Please enter a number to reverse >");
            int userInput = keyboard.nextInt();
           //getting a numberOf digits in user's input
        int numbDigits = String.valueOf(nBuserInput).length();
        
        for(int i=0;i<numbDigits;i++){
            int newDigit=nBuserInput%10;
            nBuserInput = nBuserInput/10;
            System.out.println(newDigit);
        }
        //need to finish
            
        //end of numBackward2
    }
    

    //Part 5
    // Build a method called StraightLine that produces a straight line, 
    // just as in loop 0 in section 2 above. Use a loop variable called size to terminate the loop.
    public static void straightLine(){
        int size = 5;
        for (int i = 0; i < size; i++) {
            System.out.print( "*" );
        }
        System.out.println();

        //end of straightLine()
    }

    // Now, wrap this loop that produces a line inside another loop, as demonstrated in loop 1 in section 2. 
    // Make the outer loop also terminate using the "size" variable. The only thing to add to the outer loop 
    // is a System.out.println(); 
    // to move the cursor to the next line. When you’re done, 
    // the output should look like the square below, with the same number of rows and columns.
    public static void straightLine2(){
        int size = 3;
        for (int i = 0; i < size; i++) {
            for(int j=0;j<size;j++){
                System.out.print( "*" );
            }
            System.out.println();//ensures to go to the next line
        }
        

        //end of straightLine()
    }


    //Part 6
    //Write a method called BoxMaker that asks the user for an integer x (using Scanner),
    //  and then builds a box of x asterisks.
    public static void boxMaker(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please tell me the box size >");
        int userInputBoxSize = keyboard.nextInt();

        for(int i = 1;i<=userInputBoxSize;i++){
       
            for(int j=1;j<=userInputBoxSize;j++){
                //here we check on the first/last row to fill out otherwise type space
                if(i==1 || i==userInputBoxSize || j==1 || j==userInputBoxSize){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                //end of inner loop
            }
            System.out.println();//ensuring we go to the next line
           //end of outer loop
        }

        //end of box maker
    }
   

//Part 7 (Optional)
// Nested Loops
// Write methods that print the following patterns to the console such that their size depends on a 
// passed-in integer argument.

// This first shape is atriangular pattern with sides of 6 asterisks. 
// The call that produces this pattern is shape7a(6);. Your code should work for any positive integer.


public static void triangularPattern(){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please tell me the box size for triangular pattern >");
    int n=keyboard.nextInt();

    for(int i=1;i<=n;i++){//lines
        
        for(int j=1;j<=(i-1);j++){
               System.out.print("."); 
        }

        for(int j=i;j<=n;j++){
            System.out.print("*");
        }
        
        System.out.println();
    }
   
    //end of triangularPattern
}

// This second shape is an “X” pattern with arms of 3 asterisks each. 
// The call that produces this pattern is shape7b(3);. Your code should work for any positive integer.

public static void xPattern(){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please tell me the box size for x pattern>");
    int n=keyboard.nextInt();

    for(int i=1;i<=n;i++){//lines
        
        for(int j=1;j<=n;j++){
        if((i == j)||(j==(n+1)-i)){
                System.out.print("*");
            }
            else{   
                System.out.print(".");
            }
        }

        System.out.println();
    }
   
    //end of xPattern
}




    //end of class
}
