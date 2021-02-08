
import java.util.Scanner;
import java.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;


public class HW_Loops_Files {
    public static void main(String[] args){
        
        PrintWriter outputStream = null;

        try {
            outputStream = new PrintWriter(new FileOutputStream("stuff.txt"));
        } 
        
        catch (FileNotFoundException e) {
            //TODO: handle exception
            System.out.println("Error opening the file stuff.txt."); 
            System.exit(0);
        }

        System.out.println("Writing to file.");
        outputStream.println("The quick brown fox");
        outputStream.println("jumps over the lazy dog.");
        outputStream.close();
        System.out.println("End of program.");

        //end of main
    }

    //end of class
}
