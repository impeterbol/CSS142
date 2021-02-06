import java.util.Scanner;

public class guessANumber {
    public static void main(String[] args){
       overall();
        //end of main
    }


    public static void overall(){
    int gamesPlayed=0;
    int tries=0;
    boolean playing = true;
    int average;

    while(playing){
        //user picks a number
        int numMax = getMaxNumber();
        //program generates a number from 1 to the user num
        int randomNumber = randomNum(1, numMax);
         //program provides a hint whether it's higher or lower than num

        //user prompted to guess a number and score is counter
            tries = guessANumber(randomNumber, numMax);
               //if user gets it correctly - finish

            gamesPlayed++;
            playing=playAgain();

    }
    average = tries/gamesPlayed;
    System.out.println("Thank you for playing! You played "+gamesPlayed+" games and spent And spend on average "+average+" tries per game");

//end of overall
    }


    //getting max num function
    public static int getMaxNumber(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please select a max number for the program (number should be >1) >");
        int numMax = keyboard.nextInt();
        

        if(numMax<0 || numMax<=1){
            System.out.println("Well.. the number needs to be >1. Let's try again... >");
            getMaxNumber();
        }
        else if (numMax>1){
            System.out.println("Thank you! Now the system will generate a random number between 1 and " + numMax);
        }
       
        return numMax;
        //end of getMaxNum
    }

    // generate a random number
    public static int randomNum(int min, int max){
        int range = (max-min)+1;
        //math random returns a value between 0.0 and 1.0 
        int randomNumber = (int)(Math.random() * range) + min;
        System.out.println(randomNumber);
        return randomNumber;
    }

    //ask user about a number
    public static int guessANumber(int definedRandomNumber, int pickedMax){
        int tries = 0;
        Scanner keyboard = new Scanner(System.in);
         //program sets counter correct = 0 and incorrect = 0;
        
         System.out.print("Computer has randomly (I promise!) generated a number between 1 and "+pickedMax+". Can you try and guess it? Enter a number >");
         int userGuess = keyboard.nextInt();
         System.out.println("this is userguess "+userGuess);
         System.out.println("this is definedNumber "+definedRandomNumber);
        
        

        while(userGuess!=definedRandomNumber){
            tries++;
         
            if(userGuess<definedRandomNumber){
                System.out.println("Close but not exactly - your number is less that the random one!");
            }
            else if(userGuess>definedRandomNumber){
               System.out.println("Close but not exactly - your number is more that the random one!");
            }

            System.out.println("Try again! Please type a number > ");
            userGuess=keyboard.nextInt();
            
        }

        
         //printing the final score
         System.out.println("Wohoo you got it! The random number this time was "+ definedRandomNumber+". It took you just "+tries+" tries to get it!");
         return tries;

        
    }

    // play again function

    public static boolean playAgain(){
        boolean response;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Want to play again? Type YES to play again or anything else to stop and leave as a winner! ");
        String userAnswerPlayAgain = keyboard.next();

        if(userAnswerPlayAgain.toLowerCase().equals("yes")){

            response = true;
        }
        else{
            response = false;
        }
        return response;
        
    }
    

    //housekeeping exit function
    public static void exitFunction(){
        System.out.println("Bye! We will miss you!");
     
    }
    //hint function
    public static void hintFunction(int definedRandomNumber){
        System.out.println("Alright! here is the number: "+definedRandomNumber);
     
    }

    //end of class
}
