//Peter Boldyrev  - CSSSKL 142D - Lab Week 2 - PART 3


import java.util.Scanner;

public class Lab2aPart3 {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("please type \"secondTime\" if you want to convert seconds to hh:mm:ss OR type \"inSeconds\" if you want to convert hh,mm,ss to seconds.Type \"exit\" to stop >");
            String userChoice = keyboard.next();

            if(userChoice.equals("secondTime")){
                    System.out.println("Please enter seconds >");
                    int initialSeconds = keyboard.nextInt();
                    secondTime(initialSeconds);
                    main(args);
            }
                
            else if(userChoice.equals("inSeconds")){
                    
                    System.out.println("Please enter hours,minutes and seconds separated by comma \",\" like 23,13,13 to find out what is it in seconds> ");
                    String userInput = keyboard.next();
                    String[] userInputVector = userInput.split(",");
                    //user input converted to int
                    int h=Integer.parseInt(userInputVector[0]);
                    int m=Integer.parseInt(userInputVector[1]);
                    int s=Integer.parseInt(userInputVector[2]);

                    inSeconds(h,m,s);
                    main(args);
                    
            }

            else if (userChoice.equals("exit")) {
                    System.out.println("Alright, have a nice day!");
                
            }

            else {
                System.out.println("Sorry I didn't get you, can you try again? ");
                main(args);
            }
            
     //main method close       
    }
    // Write a method called secondTime() that takes as argument an integer corresponding to a number of seconds. 
// secondTime() should compute and display the equivalent time 
// in hours, minutes and seconds, printing the result to console in the format:
        public static void secondTime(int initialSeconds){
            // checking hours first
            int hours = initialSeconds/3600;
            //checking what's left after getting full number of hours
            int secLeft = initialSeconds%3600;
            // checking full number of min from the amount of seconds left on line 11
            int mins = secLeft/60;
            //checking how mnay seconds left after geting full number of minutes
            int secLeft2 = secLeft%60;

            System.out.println("initial seconds is " + initialSeconds + " == "+ hours+"h : "+ mins+"m : "+ secLeft2+"s");
        
        }
        // Write another method called inSeconds() that takes as arguments three integers: 
        // ours, minutes and seconds, computes the exact time in seconds, then returns 
        // the total number of seconds and prints the following message to the console:
        public static void inSeconds(int h, int m, int s){
            int secFromHours = h*3600;
                int secFromMins = m*60;
                int total = secFromHours+secFromMins+s;
                System.out.println(h + "h : "+ m + "m : " + s+ "s === "+ total+" seconds");
        }

        // Write the following tests of your methods and submit the outputs with your codebase.

        //         inSeconds( 0, 2, 0 ); >> 120 seconds
        // secondTime( 9001 ); >> 2h : 30m : 1s
        // inSeconds( 24, 0, 0 );>> 86400 seconds
        // secondTime( 3600 ); >> 1h : 0m : 0s
        // inSeconds( -1, 61, -60 ); >> 0 seconds
        
        
}
