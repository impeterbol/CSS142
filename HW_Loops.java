//Peter Boldyrev // CSS 142 // HW Loops

import java.util.*;

public class HW_Loops {
    public static void main(String[] args){
       
        overall();
        
        //end of main method
    }

    //main ask overall
    public static void overall(){
        String userInput = firstAsk();
        sanityCheck(userInput);
        System.out.println("Sequence1: " +
        userInput.toUpperCase());
        occurenceC(userInput);
        fractionCG(userInput);
        compliment(userInput);

        String userInput2 = firstAsk();
        sanityCheck(userInput2);
        System.out.println("Sequence2: " +
        userInput2.toUpperCase());
        occurenceC(userInput2);
        fractionCG(userInput2);
        compliment(userInput2);

         //call next function from here re checks of C and num 2 and 3
         pairwise(userInput, userInput2);
        

        //end of overall
    }

    //first ask
    public static String firstAsk(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a single DNA sequence."+
        " Allowed bases are adenine (A). guanine (G), cytosine (C), thymine (T)."+
        " Please enter A,C,G,T and press return  >");
        String userInput = keyboard.next();
        return userInput;
        //end first ask
    }


    //valid check
    public static boolean validCheck(String userInput){
        int counter=0;
        for(int i=0;i<userInput.toUpperCase().length();i++){
          if(userInput.toUpperCase().charAt(i)=='A' || 
          userInput.toUpperCase().charAt(i)=='C'  || 
          userInput.toUpperCase().charAt(i)=='G' || 
          userInput.toUpperCase().charAt(i)=='T' ){
            counter++;
          }
        }
        if(counter!=userInput.length()){
            return false;  
        }
        else{
            return true;
        }
        //end of valid check
    }

    public static void sanityCheck(String userInput){
        Scanner keyboard = new Scanner(System.in);
        if(validCheck(userInput)){
            System.out.println("Thank you for adding the following valid string: "+userInput.toUpperCase());
 
        }
        else{
            System.out.println("Seems that not all characters are G,A,T or C. Here is what you entered: "
            +userInput.toUpperCase()+". Please try again or enter exit to stop");
            String userInput3 = keyboard.next();
            if(userInput3.equals("exit")){
                System.out.println("Goodbye!");
            }
            else{
                // System.out.println("I am else ");
              sanityCheck(userInput3);

            }
        }
        //end of sanity check
    }

     //exercise #1 - count number of C occurences. >> occurenceC(userInput);
            //I have done it via concat of strings just to not use counter second time 
            //but it can also be solved via counter 
    public static int occurenceC(String userInput){
        String cOccurence = "";
        for(int i=0;i<userInput.toUpperCase().length();i++){
            if(userInput.toUpperCase().charAt(i)=='C'){
                cOccurence = cOccurence+"C";
            }
        }
        int numberOfC = cOccurence.length();
        System.out.println("C-count: "+ numberOfC);
        return numberOfC;
        //end of C occurence
    }
    

       //exercise #2 Determine the fraction of cytosine >>fractionCG(userInput);
            //  and guanine nucleotides. For example, if half of the 
            //  nucleotides in the sequence are either "C" or "G", the fraction should be 
            //  0.5.  If a sequence was "CGAATTTT", the fraction should be 0.25 (25% are C or G)
            
    public static double fractionCG(String userInput){
        double counter = 0;
        for(int i=0;i<userInput.toUpperCase().length();i++){
            if(userInput.toUpperCase().charAt(i)=='C' ||
            userInput.toUpperCase().charAt(i)=='G' ){
                counter++;
            }
        }
        double cgFraction = (counter/userInput.toUpperCase().length());
        System.out.print("#2 There were "+counter +" Cs and Gs our of "+userInput.toUpperCase().length()+" So fraction is ");
        System.out.printf("%.2f",cgFraction);
        System.out.print(". Here is the percentage that C and G take of total: ");
        System.out.printf("%.2f",cgFraction*100);
        System.out.print("%");
        System.out.println();
        return cgFraction;
    }

 // exercise #3  >>compliment(userInput);
            //A DNA strand is actually made up of pairs of bases — 
            // in effect, two strands that are cross-linked together. 
            // These two strands are complementary: if you know one,
            //  you can always determine the other, 
            // or complement, because each nucleotide only pairs up with one other. 
            // In particular, "A" and "T" are complements, as are "C" and "G". 
            // So, for example, the complement of the sequence "AAGGTCT" would be "TTCCAGA". 
            // Compute the complement of the input sequence.
            
    public static String compliment(String userInput){
        String compl = "";
        for(int i=0;i<userInput.toUpperCase().length();i++){
            if(userInput.toUpperCase().charAt(i)=='A'){
                compl=compl+"T";
            }
            else if(userInput.toUpperCase().charAt(i)=='T'){
                compl=compl+"A";
            }
            
            else if(userInput.toUpperCase().charAt(i)=='C'){
                compl=compl+"G";
            }
            else if(userInput.toUpperCase().charAt(i)=='G'){
                compl=compl+"C";
            }
        }
        System.out.println("Here is compliment string "+compl);
        return compl;

        //end of compliment method
    }

        public static void pairwise(String userInput, String userInput2){
            int counter1 =0;
            if(userInput.length()==userInput2.length()){
                for (int i=0;i<userInput.length();i++){
                   
                        if(userInput.toUpperCase().charAt(i)==userInput2.toUpperCase().charAt(i)){
                            counter1++;
            
                    }
                }
            }


           System.out.println("This is pairwise "+userInput+" and also "+userInput2+" and counter "+counter1);
        }



    //end of class HW_Loops
}
