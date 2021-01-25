//Peter Boldyrev -- CSSSKL 142D --Lab3 

import  java.util.Scanner;
import java.util.Random;

//PART 3
    
    //     boolean isFiveLess = 5<15; //my answer - true
    //     int n =4;
    //     boolean isEven = (n%2==0); //my answer - true
    //     boolean isOdd = !(isEven); // my answer - false
    //     boolean isTenLessOrEqual = (10<=100/10);//my answer - true
    //     int a =3;
    //     int b = 5;
    //     boolean isALess = a<b; //my answer -  true

    // END OF PART 3

public class Lab3 {
    public static void main(String[] args){

        

        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter first number > ");
        int userNum1 = keyboard.nextInt();
        System.out.println("Please enter second number > ");
        int userNum2 = keyboard.nextInt();

        multipleOfChecker(userNum1,userNum2);
        oddEvenchecker(userNum1);
        oddEvenchecker(userNum2);

        sumOfSqrtMain(userNum1,userNum2);

        greaterOfTwoMain(userNum1,userNum2);
        
        smallerOfThreeMain(userNum1,userNum2);
        
        playRps();
        


        //END OF MAIN CLASS
    }

    

    public static void oddEvenchecker(int num){
        if(num%2==0){
            System.out.println(num+" is even");
        }
        else{
            System.out.println(num+" is odd");
        }

    }

    public static void multipleOfChecker(int a, int b){
        if(a%b==0 || b%a ==0){
            System.out.println(b + " is a multiple of "+ a +"or vice versa");
        }
        
        else{
            System.out.println("not a multiple");
        }
    }


    public static void sumOfSqrtMain(int userNum1, int userNum2){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to see sum of sqrt of the same "+
        "numbers or enter different? If same, type same if different, type different> ");
        String userChoice1 = keyboard.next();
        if (userChoice1.equals("same")){
            double userNum1Double = (double) userNum1;
            double userNum2Double = (double) userNum2;
            sqrtSumBucketer(userNum1Double,userNum2Double);
        }
        else if (userChoice1.equals("different")){
            System.out.println("Please enter first number to get sum of sqrt > ");
            double userNum3 = keyboard.nextDouble();
            System.out.println("Please enter second number to get sum of sqrt > ");
            double userNum4 = keyboard.nextDouble();
            sqrtSumBucketer(userNum3, userNum4);
        }
    }

    public static void sqrtSumBucketer(double num1, double num2){
        
        
        if(num1<0){
            System.out.println("number should be  >0");
        }
        
        if(num2<0){
            System.out.println("number should be >0");
        }
        double sumSqrt = (num1*num1)+(num2*num2);
        

        if(  sumSqrt <=10  ){
            System.out.println("less than 10 or equal 10");
        }
        else if(sumSqrt>10 && sumSqrt<=20){
            System.out.println(sumSqrt + " is between 10 and 20");
        }
        else if(sumSqrt>20 && sumSqrt<=30){
            System.out.println(sumSqrt + " is between 20 and 30");
        }
        else if(sumSqrt>30){
            System.out.println(sumSqrt + " is greater than 30");
        }
        

    }


    public static void greaterOfTwoMain(int userNum1, int userNum2){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to see greater of two of the same "+
        "numbers or enter different? If same, type continue if different, type choose> ");
        String userChoice2 = keyboard.next();
        if (userChoice2.equals("continue")){
            double userNum1DoubleOld1 = (double) userNum1;
            double userNum2DoubleOld2 = (double) userNum2;
            greaterOfTwo(userNum1DoubleOld1,userNum2DoubleOld2);
        }
        else if (userChoice2.equals("choose")){
            System.out.println("Please enter first number to get greater of two > ");
            double userNum5 = keyboard.nextDouble();
            System.out.println("Please enter second number to get reater of two > ");
            double userNum6 = keyboard.nextDouble();
            greaterOfTwo(userNum5, userNum6);
        }
    }


    public static void greaterOfTwo(double firstNum, double secondNum){
        if(firstNum>secondNum){
            System.out.println(firstNum +" is greater than "+ secondNum);
            
            
        }
        else if(firstNum==secondNum){
            System.out.println("they are equal");
        }
        else{
            System.out.println(secondNum+" is more than "+ firstNum);
       
        }
    }


    public static void smallerOfThreeMain(int userNum1, int userNum2){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to use the previous two numbers and just enter one more"+
        " to find smaller of three?"+
        " If reuse two and add one new, type add if all different, type new> ");
        String userChoice3 = keyboard.next();
        if (userChoice3.equals("add")){
            System.out.println("Got it! You are reusing two numbers " +userNum1+ " and "+userNum2+ 
            ". Please enter third number to get smaller of three >");
            double userNum7 = keyboard.nextDouble();
            double userNum1DoubleOld3 = (double) userNum1;
            double userNum2DoubleOld4 = (double) userNum2;
            smallerOfThree(userNum1DoubleOld3,userNum2DoubleOld4, userNum7);
        }
        else if (userChoice3.equals("new")){
            System.out.println("Please enter first number to get smaller of three > ");
            double userNum8 = keyboard.nextDouble();
            System.out.println("Please enter second number to get smaller of three > ");
            double userNum9 = keyboard.nextDouble();
            System.out.println("Please enter second number to get smaller of three > ");
            double userNum10 = keyboard.nextDouble();
            smallerOfThree(userNum8,userNum9, userNum10);
            
        }
    }


    public static void smallerOfThree(double firstNum, double secondNum, double thirdNum){
        if(firstNum<secondNum&& firstNum<thirdNum){
            System.out.println(firstNum +" is smallest");
            
            
        }
        else if(secondNum<firstNum&& secondNum<thirdNum){
            System.out.println(secondNum +" is smallest");
           
        }
        else if(thirdNum<firstNum&& thirdNum<secondNum){
            System.out.println(thirdNum+" is the smallest ");
            
        }
        else{
            System.out.println("They all are equal");
        }

    }


//Part 5
    public static void playRps(){
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors! Please enter "+
        "1 for rock, 2 for paper and 3 for scissors > ");
        
        int userRpsChoice = keyboard.nextInt();
        int compRpsChoice = rand.nextInt(2)+1;

        boolean validChoice = (userRpsChoice>=1&&userRpsChoice<=3);
        if(validChoice){
            score(userRpsChoice, compRpsChoice);
            playRpsAgain();
        }
        else{
            System.out.println("Seems like you have an invalid choice, please try again!");
            playRps();
        }
        

        //end of playRps
    }

    public static void score(int userRpsChoice, int compRpsChoice){
        boolean tieGame = (userRpsChoice==compRpsChoice || compRpsChoice==userRpsChoice);
        boolean userWon = 
        (userRpsChoice==1 && compRpsChoice==3)||
        (userRpsChoice==2 &&compRpsChoice==1)||
        (userRpsChoice==3 &&compRpsChoice==2);
        boolean compWon = 
        (compRpsChoice ==1 && userRpsChoice==3)||
        (compRpsChoice ==2 && userRpsChoice==1)||
        (compRpsChoice ==3 && userRpsChoice==2);

        if(tieGame){
            String resTie= "Ha! You chose "+rpsChoiceDisplay(userRpsChoice)+
            " and the computer decided to play with "+rpsChoiceDisplay(compRpsChoice)+
            " as well! It's a tie! ";
           System.out.println(resTie);
            
        }
        else if (userWon){
            String  resUser = "Great Job! You won by selecting "+rpsChoiceDisplay(userRpsChoice)+
            " and beating computer who randomly (I promise :) ) selected "+ rpsChoiceDisplay(compRpsChoice);
            System.out.println(resUser);
            
        }
        else if (compWon){
            String  resComp = "Hmmmmm! You selected "+rpsChoiceDisplay(userRpsChoice)+
            " and computer randomly (I promise :) ) selected "+ rpsChoiceDisplay(compRpsChoice)+
            ". Computer won this time.. But hey, there is always a chance next time!! ";
            System.out.println(resComp);
         
        }

        //end of score method
    }
    
    public static String rpsChoiceDisplay(int RpsChoice){
        if (RpsChoice== 1){
            String RpsChoiceConverted1 = "Rock";
            return RpsChoiceConverted1;
        }
        else if(RpsChoice== 2){
            String RpsChoiceConverted2 = "Paper";
            return RpsChoiceConverted2;
        }
        else if(RpsChoice== 3){
            String RpsChoiceConverted3 = "Scissors";
            return RpsChoiceConverted3;
        }
        else{
            String RpsChoiceConverted4 = "Invalid selection";
            return RpsChoiceConverted4;
        }

        //end of rpsChoice
    }

    public static void playRpsAgain(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Do you want to play again? Type yes to play again or anything else to stop > ");
        String playAgain = keyboard.next();
        if(playAgain.equalsIgnoreCase("yes")){
            playRps();
        }
        else {
            System.out.println("Ok see you later! ");
            
        }
    }
            
    

    //CLASS ENDS
}

