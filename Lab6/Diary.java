import java.io.FileInputStream; //"turns" the file into a read stream
import java.util.Scanner; //reads from stream
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream; //"turns" the file into a write stream
import java.io.PrintWriter; //writes to the stream

import java.io.FileNotFoundException; //this exception must be caught and handled when dealing with streams!

public class Diary {
    public static void main(String[] args){

        diaryLog();
    
        // end of main
    }

      
    public static void diaryLog(){



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
