import java.io.FileInputStream; //"turns" the file into a read stream
import java.util.Scanner; //reads from stream
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream; //"turns" the file into a write stream
import java.io.PrintWriter; //writes to the stream

import java.io.FileNotFoundException; //this exception must be caught and handled when dealing with streams!


public class Advice{
    
    
    public static void main(String[] args){
        advice();

        //end of main
    }

    public static void advice(){
    String currentAdvice = "";
    String userInput = "";
        Scanner inputStream = null;

        PrintWriter outputStream = null;
        PrintWriter outputStream2 = null;

        try{
            inputStream = new Scanner(new FileInputStream("advice.txt"));
            outputStream = new PrintWriter(new FileOutputStream("adviceLog.txt",true));
            outputStream2 = new PrintWriter(new FileOutputStream("advice.txt",true));
        }
        catch(FileNotFoundException e){
            System.out.println("this is a fielnotfound exception");
            System.exit(0);
        }

        currentAdvice=inputStream.nextLine(); 
        
        //TODO - how scanner can access the last line?

        System.out.println("This is current advice: \n"+currentAdvice);

        System.out.println("Please enter your advice >");
        Scanner keyboard = new Scanner(System.in);
        userInput = keyboard.nextLine();

        System.out.println("Now logging your advice... ");
        outputStream.println(userInput);

        System.out.println("Now leaving your advice for the next user... ");
        outputStream2.println("\n"+userInput);
        System.out.println("Your advice  "+ userInput+" has been successfully logged");
        
        outputStream.close();
        outputStream2.close();

        //end of advice
    }
    //end of class 
}
