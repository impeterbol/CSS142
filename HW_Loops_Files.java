import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//http://www.cplusplus.com/forum/beginner/170504/
public class HW_Loops_Files{

    public static void main(String[] args){
        String nextLine;
        double programWeight=0;
        double midtermWeight=0;
        double finalExamweight=0;
        

        Scanner inputStream = null;

        try {
            inputStream = new Scanner(new FileInputStream("courseData.txt"));
        } 
        catch (FileNotFoundException e) {
            System.out.println("Here is a filenotfound exception");
            System.exit(0);
            
        }

        //getting exam weights thru line 35
        nextLine = inputStream.nextLine();
        

        Scanner weight = new Scanner(nextLine);
        while(weight.hasNext()){
            programWeight = weight.nextDouble();
            midtermWeight = weight.nextDouble();
            finalExamweight = weight.nextDouble();
            
        }
       

        String groupNum = inputStream.nextLine();
        double classAverage = 0;
        int counter = 0;
        while(inputStream.hasNext()){
            
            String line = inputStream.nextLine();
            if(line.equals("0")){
                break;
            }
            classAverage+=studentAverage(line, programWeight,midtermWeight,finalExamweight);
            System.out.println(studentAverage(line, programWeight,midtermWeight,finalExamweight));
            System.out.println(classAverage + " this is class average");
            counter++;
           
           
        }
        
        System.out.println("class average is "+ (classAverage/(double)counter));
        
        
       
        
      

       
        // end of main
    }

        public static double studentAverage(String line, double programWeight, double midtermWeight, double finalExamweight){
            int studentId = 0;
        int programScore = 0;
        int midtermScore = 0;
        int finalScore = 0;
        double weightedAverage = 0;
            // System.out.println(line);
            Scanner linScanner3 = new Scanner (line);
            while(linScanner3.hasNext()){
                studentId = linScanner3.nextInt();
                programScore = linScanner3.nextInt();
                midtermScore = linScanner3.nextInt();
                finalScore = linScanner3.nextInt();
            }
            weightedAverage = ((double)programScore*programWeight)+((double)midtermScore*midtermWeight)+((double)finalExamweight*finalScore);
            //   System.out.println(weightedAverage);

            //end of studentAverage
            return weightedAverage;
        }
            
    //end of class
}
