
import java.util.Scanner;
import java.FileInputStream;
import java.io.FileNotFoundException;


public class readingFromFile {
    public static void main(String[] args){
    
        Scanner inputStream = null;

        try{
            inputStream = new Scanner(new FileInputStream("stuff.txt"));
            // After this statement, you can use the methods nextInt, nextDouble, nextLine, and so forth 
            // to read from the named text files just as you have used these methods to read from the keyboard. 
            // When used in this way, the FileInputStream constructor, and hence the Scanner constructor 
            // invocation, can throw a FileNotFoundException, which is a kind of IOException.
        }
        catch(FileNotFoundException e){
            System.out.println("Error opening the file "); 
            System.exit(0);
        }


        //end of main
    }

    //end of class
}
