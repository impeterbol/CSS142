import java.util.Scanner;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Reverse{
    public static void main(String[] args){
        overall();

        //end of main   
    }


    public static void overall(){
        Scanner sc = null;
        PrintWriter outputStream = null;

        try {
            sc = new Scanner(new FileInputStream("input.txt"));
            
        } catch (FileNotFoundException e) {
            System.out.println("Error accessing the input.txt."); 
            System.exit(0);
        }

        try {
            outputStream = new PrintWriter(new FileOutputStream("output.txt"));
        } catch (Exception e) {
            System.out.println("Error creating the output.txt"); 
            System.exit(0);
        }

        reverse(sc,outputStream);
        //end of overall
    }

         public static void reverse(Scanner input, PrintWriter output){
    
        while(input.hasNextLine()){
                       
           output.println(reverseLine(input.nextLine()));
          
        } 
            output.close();

        //end of reverse
    }

    public static String reverseLine(String line){

        String reversedString ="";
        String [] wordsInLine = line.split(" ");
           
        for(int i=wordsInLine.length-1;i>=0;i--){
            reversedString+=wordsInLine[i]+" ";
                        
        }
        return reversedString;
    }
    //end of class
}