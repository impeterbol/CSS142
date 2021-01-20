//Peter Boldyrev  - CSSSKL 142D - Lab Week 2 - PART 4
import java.lang.Math;
import java.util.Scanner;

public class Lab2bPart4 {
        public static void main(String[] args) {
                lookingAtMinMax();
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Please enter your name followed by 3 real numbers (that is, any number from −∞ to ∞) separating by space >");
                String userInput = keyboard.nextLine();
               
                String[] userInputSplit = userInput.split("\\s+");
                String userName = userInputSplit[0];
                
                double firstNum = Integer.parseInt(userInputSplit[1]);
                double secondNum = Integer.parseInt(userInputSplit[2]);
                double thirdNum = Integer.parseInt(userInputSplit[3]);

                double largest = Math.max(firstNum,Math.max(secondNum,thirdNum));
                double smallest = Math.min(firstNum,Math.min(secondNum,thirdNum));
                double  middle = Math.max(Math.min(firstNum,secondNum), Math.min(Math.max(firstNum,secondNum),thirdNum));

                System.out.println("Hi there, "+userName+"! Here are the numbers you entered in descending order:");
                System.out.println(largest+" "+middle+" "+ smallest);
                System.out.println("Thank you for using the three-number-sorting system! Good-bye.");
        
        }
        public static void lookingAtMinMax(){
                double maxNumber1 = Math.max(22.3, 34.5);
                double minNumber1 = Math.min(3.6/7.2, 3.8/6.9);
                double maxNumber2 = Math.max(2/3, 0.1);
                double minNumber2 = Math.min(13.5555, 13.5556);
        System.out.println(maxNumber1 + " "+ minNumber1+ " " +maxNumber2 + " "+ minNumber2);
        }
}