import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HW_Loops_Files{

    public static void main(String[] args){

        Scanner inputStream = null;

        try {
            inputStream = new Scanner(new FileInputStream("courseData.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Here is a filenotfound exception");
            System.exit(0);
            
        }

        while(inputStream.nextInt()!=0 && inputStream.hasNext()){
            int userInteger = inputStream.nextInt();
            System.out.println(userInteger);
            System.out.println();
        }
      


       
            
        
       

    }
    
}
