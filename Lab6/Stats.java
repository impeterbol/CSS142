import java.io.FileInputStream; //"turns" the file into a read stream
import java.util.Scanner; //reads from stream
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream; //"turns" the file into a write stream
import java.io.PrintWriter; //writes to the stream

import java.io.FileNotFoundException; //this exception must be caught and handled when dealing with streams!

public class Stats {
    public static void main(String[] args){

        generateRandoms();
        statsMethod();
        // end of main
    }


    //part1 optional
    public static void generateRandoms(){
        
        PrintWriter outputStreamRandms= null;
        double randomNumber = 0;

        try {
             //TODO CHANGE NAME to fileIn after end of testing
            outputStreamRandms = new PrintWriter(new FileOutputStream("fileIn1.txt"));
        } catch (Exception e) {
            System.out.println("This is filenotfound exceptiob");
            System.exit(0);
        }
        
        for(int i=0;i<50;i++){
            //TODO generate broader random number scope
            randomNumber = Math.random()+(Math.random()+11);
            System.out.println(randomNumber);
            outputStreamRandms.println(randomNumber);
        }
        outputStreamRandms.close();

    }

    //part1

    public static void statsMethod(){
        int numCounter = 0; //counts numbers
        int negNumCounter = 0;//counts negative numbers
        double sumAll = 0; //to count sum of all numbers
        double average = 0; //will be assigned average
        int betweenZeroAndHundred = 0; //will count nums between zero and hundred
        int moreThanHundred = 0; //will count numbers more than 100
        double minNum = 0.0; //for min num
        double maxNum = 0.0; //for max num
     
        double thisIsNum = 0; // current num
        double nextNum = 0; //next number

        
        Scanner minMaxScanner = null; //adding scanner to count min max
       
        try {
             //TODO CHANGE NAME to fileIn after end of testing
            minMaxScanner = new Scanner(new FileInputStream("fileIn1.txt"));

        } catch (FileNotFoundException e) {
           
            System.out.println("This is filenotfound exceptiob");
            System.exit(0);
        }

        while(minMaxScanner.hasNextDouble()){
            thisIsNum = minMaxScanner.nextDouble();
            nextNum = minMaxScanner.nextDouble();

            if((thisIsNum>nextNum)&& thisIsNum>maxNum){
                maxNum = thisIsNum;
            }
            else if((thisIsNum<nextNum)&&thisIsNum<minNum){
                minNum = thisIsNum;
            }

        }

        Scanner inputStream = null; //adding scanner for everything else so that it starts form the begining
        PrintWriter outputStream = null;

        try {
            //TODO CHANGE NAME to fileIn after end of testing
            inputStream = new Scanner (new FileInputStream("fileIn1.txt"));
            outputStream = new PrintWriter(new FileOutputStream("fileOut.txt"));

            
        } catch (FileNotFoundException e) {
            //TODO: handle exception
            System.out.println("This is filenotfound exceptiob");
            System.exit(0);
        }

        while(inputStream.hasNextDouble()){
            thisIsNum = inputStream.nextDouble();
            numCounter++;
            sumAll+=thisIsNum;
            if(thisIsNum>=0 && thisIsNum<100){
                betweenZeroAndHundred++;   
            }
            else if(thisIsNum>=100){
                moreThanHundred++;
            }
            else if(thisIsNum<0){
                negNumCounter++;
            }
           
        }
        average = sumAll/numCounter;

        //output stream
        outputStream.println("Statistics for the numbers in fileInt.txt: ");
        outputStream.printf("average: %.2f (rounded by 2 decimals) \n",average);
        outputStream.println("max: "+maxNum);
        outputStream.println("min: "+ minNum);

        outputStream.println("There are "+ negNumCounter + " negative numbers, "+
      betweenZeroAndHundred + " numbers between 0(inclusive) and 100 (exclusive), "+
        "and "+moreThanHundred+" that are more or equal hundred");
        outputStream.close();
        // end of output stream

        System.out.println("Your fileOut.txt is ready for view ");
        
       
       

        //end of stats
    }

    
//=========================//
    

        //part 2 
    public static void DiaryLog(){



        Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter a date of the entry >");
        String userDate = keyboard.nextLine();
        System.out.println("Now tell the diary all the secrets >");
        String userInput = keyboard.nextLine();

        
        PrintWriter outputStream = null; //declaring the outputstream

        try {
            outputStream = new PrintWriter(new FileOutputStream("diaryLog.txt",true));
        } catch (FileNotFoundException e) {

            System.out.println("Error creating/accessing the file stats.txt."); 
            System.exit(0);
        }

        System.out.println("Writing to file");
        outputStream.println(userDate);
        outputStream.println(userInput);
        outputStream.println();
        outputStream.close();

        System.out.println("Do you have more secrets? Type yes to add more or anything to exit >");
        String userAction = keyboard.next();
        
        if(userAction.toLowerCase().equals("yes")){
            diaryLog();
        }
        else{
            System.out.println("Ok thank you!");
        }


        //end of part 2
    }





    //end of class
}
