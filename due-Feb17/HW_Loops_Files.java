//Peter Boldyrev CSS 142
//Feb 12 - HW Loops_FIles (I/O)

//testing method called on line 62 and outlined on line 182

import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HW_Loops_Files{

    public static void main(String[] args){
        String nextLine; 
        double programWeight=0;
        double midtermWeight=0;
        double finalExamweight=0;
        int  gradeCounter=0; // counter that tracks number of grades (i.e 161, 263 etc)

        //declaring scanner to check the number of grades in place
        Scanner counterScanner = null;

        try {
            //adding data from txt file
            counterScanner = new Scanner (new FileInputStream("courseData.txt"));
        } 
        //catching error if any to proceed further 
        catch (FileNotFoundException e) {
            System.out.println("Here is a filenotfound exception");
            System.exit(0);
            
        }
        
        while(counterScanner.hasNext()){//looping through scanner 
            if(counterScanner.nextLine().equals("0")){ 
                gradeCounter++; //counting number of grades (i.e. 161, 263 etc)
            }
        }
        

        Scanner inputStream = null;
// adding another scanner to loop since previous is at the end + handling the errors via try - catch 
        try {
            inputStream = new Scanner(new FileInputStream("courseData.txt"));
        } 
        catch (FileNotFoundException e) {
            System.out.println("Here is a filenotfound exception");
            System.exit(0);
            
        }
        //getting exam weights start 
        nextLine = inputStream.nextLine();

        Scanner weight = new Scanner(nextLine);
        while(weight.hasNext()){
            programWeight = weight.nextDouble();
            midtermWeight = weight.nextDouble();
            finalExamweight = weight.nextDouble();
            
        }
        //getting exam weights end


        // testVariableValues(finalExamweight);


        //starts grading method for every grade identified via gradeCounter
        //passing Scanner and weights from lines 46-56
        for(int i =0;i<gradeCounter;i++){
            gradingMethod(inputStream, programWeight, midtermWeight, finalExamweight );
        }
        
        // end of main
    }

    //grading method 

    public static void gradingMethod(Scanner inputStream, 
    double programWeight, 
    double midtermWeight, 
    double finalExamweight){

//getting the group number based on the file structure
    String groupNum = inputStream.nextLine(); 

    double classAverage = 0;
    int studentsPerGradeCounter = 0; // counting students per grade to get weighted average
    double weightedAverage = 0; // declaring weightedAverage as zero
    String passFail =""; //declaring a String for pass/fail value

    //retrieve separated values for studentID programScore midterm score and finalScore
    int studentID = 0;
    int programScore = 0;
    int midtermScore = 0;
    int finalScore = 0;

        System.out.println("\nGrade data for class "+groupNum+"\n ");
        System.out.println(" ID  PROG  MID  FINAL  WEIGHTED  GRADE ");
        System.out.println(" --  ----  ---  -----  -------  ------"); 
        //looping through the scanner
        while(inputStream.hasNext()){
            
            String line = inputStream.nextLine();
            
            try {
                //creating another scanner to get values of studentIT programScore midtermScore and finalScore
                Scanner linScanner2 = new Scanner (line);
            while(linScanner2.hasNext()){
                
                studentID = linScanner2.nextInt();
                programScore = linScanner2.nextInt();
                midtermScore = linScanner2.nextInt();
                finalScore = linScanner2.nextInt();
                
            }
            } catch (NoSuchElementException e) {
                System.out.print("");
            }
            
            if(line.equals("0")){
                break;
                //this will start the next iteration of grading method
            }

            
            
            weightedAverage = weightedAverage(line, programWeight,
            midtermWeight,finalExamweight);
            
            classAverage+=weightedAverage;
            if (weightedAverage>=70){
                passFail="Pass";
            }
            else{
                passFail="Fail";
            }
            
           System.out.print(studentID +"  " +programScore + 
           "    " +midtermScore + "   " +finalScore + "     ");
           System.out.printf("%.2f", weightedAverage);
           System.out.print("   " + passFail);
           System.out.println();
            studentsPerGradeCounter++;
           
           
        }
        
        System.out.println("Class average is "+ 
        (classAverage/(double)studentsPerGradeCounter));
       
    
    //end of grading method   
    };

        public static double weightedAverage(String line, 
        double programWeight, double midtermWeight, 
        double finalExamweight){

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
            weightedAverage = ((double)programScore*programWeight)+
            ((double)midtermScore*midtermWeight)+
            ((double)finalExamweight*finalScore);
            //   System.out.println(weightedAverage);

            //end of studentAverage
            return weightedAverage;
        }

        public static void testVariableValues(double someValue){
            System.out.print("This is a value that were testing: "+someValue);
        }

       
            
    //end of class
}
